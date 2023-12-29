package cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.db.DBConn;

public class CinemaDAO {
	// DB�� ���� �ʿ�

	// �α��� �޼���
	public CinemaDTO selectId(String id, String pw) {

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		CinemaDTO user = null; // �������� �׸�

		try {
			sql = "SELECT * FROM members WHERE id = ? AND pw = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				user = new CinemaDTO(); // ��ġ�� ���� ����
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

	// ȸ������ ���� �޼���
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

	// ��ȭ���� �޼���
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

	// ��ü ��ȭ ����
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

	// ��ȭ ���� ������Ʈ
	// ��ŷ���̺� (�ߺ����� üũ) > ��ũ���� ���̺� (�¼�üũ) > ��ŷ���̺� (�� �Է�)
	public CinemaDTO ticketing(int movieNum, String userId) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		CinemaDTO ticket = null;

		try {
			// ��ŷ ���̺� üũ (�ߺ� ���� ���� üũ)
			sql = "select * from booking where movieNo = ? and userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			pstmt.setString(2, userId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("   �̹� ���ŵ� ��ȭ�Դϴ�.");
				return null;
			}

			// ��ũ���� ���̺� ����Ʈ (�����¼� üũ)
			sql = "select * from screenings where movieNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNum);
			rs = pstmt.executeQuery();

			if (rs.next()) { // ���� ������
				int nowSeats = rs.getInt("nowSeats"); // ���� �¼� ����

				if (nowSeats > 0) {
					// �¼��� ����������
					sql = "insert into booking (movieNo, movieName, userId, checkMoive) values (?, ?, ?, ?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, rs.getInt("movieNo"));
					pstmt.setString(2, rs.getString("movieName"));
					pstmt.setString(3, userId);
					pstmt.setString(4, "1");

					int ck = pstmt.executeUpdate();

					if (ck > 0) {
						// ���� ������, ������Ʈ�� �¼��� -1 ����
						sql = "update screenings set nowSeats = nowSeats - 1 where movieNo = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, movieNum);
						pstmt.executeUpdate();

						// ���� ���� ��ȸ �� ��ȯ
						sql = "select * from booking where movieNo = ? and userId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, rs.getInt("movieNo"));
						pstmt.setString(2, userId);
						rs = pstmt.executeQuery();

						if (rs.next()) {
							// ���� ���� ����
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

	// ���� ���
	// ��ŷ ���̺�(����) > ��ũ���� ���̺� (�¼� +1, ��ȭ�̸� ��ȯ)
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
				// ���� �Ǹ� �ܿ��¼� +1
				sql = "update screenings set nowSeats = nowSeats+1 where movieName like ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%" + movieName + "%");
				int updateResult = pstmt.executeUpdate();

				if (updateResult != 0) {
					// ���� �Ǹ� ���ŵ� ��ȭ ������ ������
					sql = "select movieName from screenings where movieName like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%" + movieName + "%");
					rs = pstmt.executeQuery();

					if (rs.next()) {
						// rs�� ������
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

	// �������� �޼���
	public List<CinemaDTO> check(String id) {
		List<CinemaDTO> lists = new ArrayList<CinemaDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			// �������� ���̺�, ȸ�� ���̺� ���� (���̵�,�̸�, ��ȭ����)
			sql = "select a.userId, b.name, a.movieName  from booking a join members b ";
			sql += "on a.userId = b.id where a.userId=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				CinemaDTO dto = new CinemaDTO();

				// �������� ����Ʈ ����
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

	// ������ ��Ȳ �޼���
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

	// ȸ����ü���� ���
	public void printAll() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CinemaDTO> membersList = new ArrayList<CinemaDTO>();

		try {
			// ������ ����
			String sql = "select * from members";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// ����� ����Ʈ�� ����
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
				// Iterator ����Ͽ� ����Ʈ ���
				Iterator<CinemaDTO> it = membersList.iterator();
				System.out.println("   ========================ȸ�� ����========================");
				System.out.printf("    %s %9s %8s %8s\n", "���̵�", "�̸�", "����", "��ȭ��ȣ");
				while (it.hasNext()) {
					CinemaDTO dto = it.next();
//					System.out.println("Id: " + dto.getId() + " Pw: " + dto.getPw() + " name: " + dto.getName() + " birth: "
//							+ dto.getBirth() + " tel: " + dto.getTel());
					System.out.printf("    %s %8s  %8d   %8s", dto.getId(), dto.getName(), dto.getBirth(),
							dto.getTel());
					System.out.println();
				}
			} else {
				System.out.println("����� ȸ���� �����ϴ�.");
			}
			System.out.println("   =========================================================");

			// ���ҽ� �ݱ�
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

				// ȸ�� ���� ���
				System.out.println("   ========================ȸ�� ����========================");
				System.out.println("   ID: " + dto.getId());
				System.out.println("   PW: " + dto.getPw());
				System.out.println("   Name: " + dto.getName());
				System.out.println("   Birth: " + dto.getBirth());
				System.out.println("   Tel: " + dto.getTel());
				System.out.println("   =========================================================");

			} else {
				System.out.println("   �ش��ϴ� ȸ���� �����ϴ�.");
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;
	}

	// ��üȸ�����ų���
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

				System.out.println("   ========================���� ����========================");
				System.out.printf("    %s %9s %10s %10s\n", "���̵�", "�̸�", "��ȭ��ȣ", "��ȭ�̸�");
				for (CinemaDTO booking : bookingList) {
					System.out.printf("    %s %8s  %4s     %s\n", booking.getId(), booking.getName(), booking.getTel(),
							booking.getMovieName());
				}
				System.out.println("   =========================================================");

			} else {
				System.out.println("����� ������ �����ϴ�.");
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
