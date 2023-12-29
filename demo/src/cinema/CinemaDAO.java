package cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.db.DBConn;

public class CinemaDAO {
	// DB에 연결 필요

	// 로그인 메서드
	public CinemaDTO selectId(String id, String pw) {

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		CinemaDTO user = null; // 유저정보 그릇

		try {
			sql = "SELECT * FROM members WHERE id = ? AND pw = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				user = new CinemaDTO(); // 일치할 때만 생성
				user.setId(rs.getString("id"));
				user.setPw(rs.getString("pw"));
				user.setName(rs.getString("name"));
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return user;
	}

	// 회원가입 가입 메서드
	public int insertData(CinemaDTO dto) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "insert into members values (?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setInt(4, dto.getBirth());
			pstmt.setString(5, dto.getTel());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 영화정보 메서드
	public CinemaDTO moiveInfo(int movieNum) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CinemaDTO dto = null;
		String sql;

		try {
			sql = "select * from movies where movieNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new CinemaDTO();
				dto.setMovieNo(rs.getInt(1));
				dto.setMovieName(rs.getString(2));
				dto.setMovieGenre(rs.getString(3));
				dto.setMovieTime(rs.getString(4));
				dto.setMovieSub(rs.getString(5));
			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;
	}

	// 전체 영화 정보
	public List<CinemaDTO> moivesInfo(int movieNum) {
		List<CinemaDTO> lists = new ArrayList<CinemaDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql;

		try {
			sql = "select * from movies";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CinemaDTO dto = new CinemaDTO();

				dto.setMovieNo(rs.getInt(1));
				dto.setMovieName(rs.getString(2));
				dto.setMovieGenre(rs.getString(3));
				dto.setMovieTime(rs.getString(4));
				dto.setMovieSub(rs.getString(5));

				lists.add(dto);
			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// 영화 예매 업데이트
	// 부킹테이블 (중복여부 체크) > 스크리닝 테이블 (좌석체크) > 부킹테이블 (값 입력)
	public CinemaDTO ticketing(int movieNum, String userId) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		CinemaDTO ticket = null;

		try {
			// 부킹 테이블 체크 (중복 예매 여부 체크)
			sql = "select * from booking where movieNo = ? and userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			pstmt.setString(2, userId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("   이미 예매된 영화입니다.");
				return null;
			}

			// 스크리닝 테이블 셀렉트 (예매좌석 체크)
			sql = "select * from screenings where movieNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			rs = pstmt.executeQuery();

			if (rs.next()) { // 값이 있으면
				int nowSeats = rs.getInt("nowSeats"); // 현재 좌석 저장

				if (nowSeats > 0) {
					// 좌석이 남아있으면
					sql = "insert into booking (movieNo, movieName, userId, checkMoive) values (?, ?, ?, ?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, rs.getInt("movieNo"));
					pstmt.setString(2, rs.getString("movieName"));
					pstmt.setString(3, userId);
					pstmt.setString(4, "1");

					int ck = pstmt.executeUpdate();

					if (ck > 0) {
						// 예매 성공시, 업데이트로 좌석수 -1 변경
						sql = "update screenings set nowSeats = nowSeats - 1 where movieNo = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, movieNum);
						pstmt.executeUpdate();

						// 예매 정보 조회 후 반환
						sql = "select * from booking where movieNo = ? and userId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, rs.getInt("movieNo"));
						pstmt.setString(2, userId);
						rs = pstmt.executeQuery();

						if (rs.next()) {
							// 예매 정보 저장
							ticket = new CinemaDTO();
							ticket.setMovieNo(rs.getInt("movieNo"));
							ticket.setMovieName(rs.getString("movieName"));
							ticket.setId(rs.getString("userId"));
							ticket.setCheckMoive(rs.getString("checkMoive"));
						}
					}
				}
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return ticket;
	}

	// 예매 취소
	// 부킹 테이블(삭제) > 스크리닝 테이블 (좌석 +1, 영화이름 반환)
	public CinemaDTO cancelBooking(String movieName, String id) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		CinemaDTO movie = null;

		try {
			sql = "delete from booking where movieName like ? and userId = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + movieName + "%");
			pstmt.setString(2, id);
			int result = pstmt.executeUpdate();

			System.out.println(result);

			if (result != 0) {
				// 삭제 되면 잔여좌석 +1
				sql = "update screenings set nowSeats = nowSeats+1 where movieName like ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%" + movieName + "%");
				int updateResult = pstmt.executeUpdate();

				if (updateResult != 0) {
					// 삭제 되면 예매된 영화 정보를 가져옴
					sql = "select movieName from screenings where movieName like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%" + movieName + "%");
					rs = pstmt.executeQuery();

					if (rs.next()) {
						// rs가 있으면
						movie = new CinemaDTO();
						movie.setMovieName(rs.getString("movieName"));
					}
				}
				rs.close();
				pstmt.close();
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return movie;
	}

	// 예매정보 메서드
	public List<CinemaDTO> check(String id) {
		List<CinemaDTO> lists = new ArrayList<CinemaDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			// 예매정보 테이블, 회원 테이블 조인 (아이디,이름, 영화정보)
			sql = "select a.userId, b.name, a.movieName  from booking a join members b ";
			sql += "on a.userId = b.id where a.userId=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				CinemaDTO dto = new CinemaDTO();

				// 예매정보 리스트 저장
				dto.setMovieName(rs.getString("movieName"));
				dto.setId(rs.getString("userId"));
				dto.setName(rs.getString("name"));
				lists.add(dto);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// 상영정보 현황 메서드
	public List<CinemaDTO> getMoives() {
		List<CinemaDTO> moiveList = new ArrayList<CinemaDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			sql = "select * from screenings";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CinemaDTO movie = new CinemaDTO();
				movie.setMovieNo(rs.getInt("movieNo"));
				movie.setMovieName(rs.getString("movieName"));
				movie.setFullSeats(rs.getInt("fullSeats"));
				movie.setNowSeats(rs.getInt("nowSeats"));

				moiveList.add(movie);
			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return moiveList;
	}

	// 회원전체정보 출력
	public void printAll() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CinemaDTO> membersList = new ArrayList<CinemaDTO>();

		try {
			// 쿼리문 실행
			String sql = "select * from members";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// 결과를 리스트에 저장
			while (rs.next()) {
				CinemaDTO members = new CinemaDTO();

				members.setId(rs.getString("id"));
				members.setPw(rs.getString("pw"));
				members.setName(rs.getString("name"));
				members.setBirth(rs.getInt("birth"));
				members.setTel(rs.getString("tel"));

				membersList.add(members);
			}

			if (!membersList.isEmpty()) {
				// Iterator 사용하여 리스트 출력
				Iterator<CinemaDTO> it = membersList.iterator();
				System.out.println("   ========================회원 정보========================");
				System.out.printf("    %s %9s %8s %8s\n", "아이디", "이름", "생일", "전화번호");
				while (it.hasNext()) {
					CinemaDTO dto = it.next();
//					System.out.println("Id: " + dto.getId() + " Pw: " + dto.getPw() + " name: " + dto.getName() + " birth: "
//							+ dto.getBirth() + " tel: " + dto.getTel());
					System.out.printf("    %s %8s  %8d   %8s", dto.getId(), dto.getName(), dto.getBirth(),
							dto.getTel());
					System.out.println();
				}
			} else {
				System.out.println("저장된 회원이 없습니다.");
			}
			System.out.println("   =========================================================");

			// 리소스 닫기
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public CinemaDTO printOne(String id) {
		CinemaDTO dto = null;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			sql = "select id,pw,name,birth,tel from members where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new CinemaDTO();
				dto.setId(rs.getString(1));
				dto.setPw(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setBirth(rs.getInt(4));
				dto.setTel(rs.getString(5));

				// 회원 정보 출력
				System.out.println("   ========================회원 정보========================");
				System.out.println("   ID: " + dto.getId());
				System.out.println("   PW: " + dto.getPw());
				System.out.println("   Name: " + dto.getName());
				System.out.println("   Birth: " + dto.getBirth());
				System.out.println("   Tel: " + dto.getTel());
				System.out.println("   =========================================================");

			} else {
				System.out.println("   해당하는 회원이 없습니다.");
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;
	}

	// 전체회원예매내역
	public void reserveAll() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CinemaDTO> bookingList = new ArrayList<>();

		try {
			String sql = "select A.id, A.name, A.tel, B.movieName from members A, booking B where A.id = B.userId";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				CinemaDTO booking = new CinemaDTO();

				booking.setId(rs.getString(1));
				booking.setName(rs.getString(2));
				booking.setTel(rs.getString(3));
				booking.setMovieName(rs.getString(4));
				bookingList.add(booking);
			}

			if (!bookingList.isEmpty()) {

				System.out.println("   ========================예매 내역========================");
				System.out.printf("    %s %9s %10s %10s\n", "아이디", "이름", "전화번호", "영화이름");
				for (CinemaDTO booking : bookingList) {
					System.out.printf("    %s %8s  %4s     %s\n", booking.getId(), booking.getName(), booking.getTel(),
							booking.getMovieName());
				}
				System.out.println("   =========================================================");

			} else {
				System.out.println("예약된 정보가 없습니다.");
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
