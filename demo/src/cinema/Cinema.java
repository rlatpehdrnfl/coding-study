package cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.db.DBConn;

public class Cinema {

	CinemaDAO dao = new CinemaDAO();
	Scanner sc = new Scanner(System.in);
	int ck;

	// 로그인 메서드
	public void login() {
		// 아이디, 비밀번호 입력 > db 체크
		System.out.print("   ID: ");
		String id = sc.next();
		System.out.print("   PW: ");
		String pw = sc.next();

		CinemaDTO user = dao.selectId(id, pw);

		// 로그인 성공
		if (user != null) {
			System.out.println();
			System.out.println();
			System.out.println("       ##       ######   ##       ##        ####      ##    ");
			System.out.println("       ##       ##       ##       ##       ##  ##     ##    ");
			System.out.println("       #####    ####     ##       ##       ##  ##     ##    ");
			System.out.println("       ##  ##   ##       ##       ##       ##  ##     ##    ");
			System.out.println("       ##  ##   ##       ##       ##       ##  ##            ");
			System.out.println("       ##  ##   ######   ######   ######    ####      ##    ");
			System.out.println();
			System.out.println("                      " + user.getName() + "님 환영합니다.");
			System.out.println();

			while (true) {
				do {
					System.out.println("   =========================================================");
					System.out.println("   |    1.영화예매      2.영화정보    3.예매확인 및 취소    |");
					System.out.println("   |    4.관리자페이지  5.로그아웃    5.종료                |");
					System.out.println("   =========================================================");
					System.out.print("   ▶ ");
					ck = sc.nextInt();
				} while (ck < 1);

				switch (ck) {
				case 1:
					ticketingMoive(user.getId());
					break;
				case 2:
					playMoive();
					break;
				case 3:
					checkMoive(user.getId(), user.getName());
					break;
				case 4:
					manager(user.getId(), user.getName());
					break;
				case 5:
					System.out.println("   메인으로 돌아갑니다.");
					return;
				case 6:
					System.out.println("   예매 시스템을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("   올바른 번호를 입력하세요.");
					break;
				}
			}
		} else {
			// 로그인 실패
			System.out.println("   아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	// 회원가입
	public void join() {
		// DTO 객체 생성
		CinemaDTO dto = new CinemaDTO();

		System.out.println();

		System.out.println("   회원가입을 시작합니다.");
		// 아이디 중복 체크
		while (true) {
			System.out.print("   ID 입력: ");
			String id = sc.next();

			if (id.length() < 6 || id.length() > 15) {
				System.out.println("   6글자 이상 15이하 ID만 입력 가능합니다.");
				continue;
			}

			if (isIdDuplicate(id)) {
				System.out.println("   이미 사용 중인 아이디입니다. 다른 아이디를 입력하세요.");
			} else {
				dto.setId(id);
				break;
			}
		}

		// 패스워드 중복체크
		while (true) {
			System.out.print("   PW 입력: ");
			String pw = sc.next();
			System.out.print("   PW 확인: ");
			String pw2 = sc.next();

			if (!pw.equals(pw2)) {
				System.out.println("   비밀번호가 동일하지 않습니다.");
			}

			if (pw.equals(pw2)) {
				dto.setPw(pw);
				break;
			}
		}

		while (true) {
			System.out.print("   이름(ex.한글 2~4글자): ");
			String name = sc.next();

			if (name.length() >= 2 && name.length() <= 4 && isKorean(name)) {
				dto.setName(name);
				break;
			} else {
				System.out.println("   2~4글자의 한글만 입력 가능합니다.");
			}
		}

		while (true) {
			System.out.print("   생일 (ex.970411): ");
			String userInput = sc.next();

			if (userInput.matches("\\d{6}")) {// 정규화
				// 6자리 숫자인 경우
				dto.setBirth(Integer.parseInt(userInput));
				break;
			} else {
				System.out.println("6자리 숫자를 입력하세요. ex.970411");
			}

		}

		while (true) {
			System.out.print("   전화번호(ex.010-xxxx-xxxx): ");
			String tel = sc.next();

			if (tel.length() == 13) {
				// 11자리일 경우
				dto.setTel(tel);
				break;
			} else {
				System.out.println("   형식에 맞춰 입력하세요. ex.010-xxxx-xxxx");
			}

		}

		int result = dao.insertData(dto);

		if (result != 0) {
			System.out.println("   회원가입 완료");
		} else {
			System.out.println("   회원가입 실패");
		}

	}

	private boolean isIdDuplicate(String id) {
		// id 중복 체크

		boolean ck = false;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			sql = "select id from members where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			ck = rs.next(); // 값이 있으면 true

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return ck;
	}

	// 이름 한글 체크
	private static boolean isKorean(String str) {
		for (char c : str.toCharArray()) {
			// 각 문자가 한글 범위에 있는지 확인
			if ((c < '가' || c > '힣') && (c < 'ㄱ' || c > 'ㅎ')) {
				return false;
			}
		}
		return true;
	}

	// 영화예매
	public void ticketingMoive(String userId) {

		// 상영정보
		List<CinemaDTO> movieList = dao.getMoives();

		System.out.println();
		System.out.println("   =======================현재 상영작=======================");
		System.out.println();
		for (CinemaDTO movie : movieList) {
			System.out.println("   " + movie.getMovieNo() + "." + movie.getMovieName() + " (전체좌석: "
					+ movie.getFullSeats() + "/ 현재좌석: " + movie.getNowSeats() + ")");
		}
		System.out.println();
		System.out.println("   =========================================================");

		int ck = 1;
		while (true) {

			do {
				System.out.println("   1.영화예매 2.뒤로가기");
				System.out.print("   ▶ ");
				ck = sc.nextInt();
			} while (ck < 1);

			switch (ck) {
			case 1:
				System.out.print("   예매할 영화 번호: ");
				int movieNum = sc.nextInt();

				CinemaDTO ticket = dao.ticketing(movieNum, userId);

				// 영화 예매 성공 여부
				if (ticket != null) {
					System.out.println("   ~~--~--~--~~--~--~--~~--~--~--~~--~--~--~~--~--~--");
					System.out.println("   .,;,.;~.~;.,;,.;~.~;.,;,.;~.~;.,;,.;~.~;.,;,.;~.~;");
					System.out.println("   :~,~:,-:-,:~,~:,-:-,:~,~:,-:-,:~,~:,-:-,:~,~:,-:-,");
					System.out.println("   ;~.~;.,-                                  .~;.,;,.");
					System.out.println("   .,;,.;~      TICKET                       ~,.;~.~;");
					System.out.println("   --~--~-      " + ticket.getMovieName());
					System.out.println("   ;~.~;.,,                                 .,~;.,;,.");
					System.out.println("   ~---~--,                                 ,;-~--~--");
					System.out.println("   ;~.~;.-      이용해주셔서 감사합니다.    .,:;.,;,.");
					System.out.println("   .,.;~.                                   ,;,.;~.~;");
					System.out.println("   ,-:-,:~,~:,-:-,:~,~:,-:-,:~,~:,-:-,:~,~:,-:-,:~,~:");
					System.out.println("   ;~.~;.,;,.;~.~;.,;,.;~.~;.,;,.;~.~;.,;,.;~.~;.,;,.");
					System.out.println("   --~--~~-~~--~--~~-~~--~--~~-~~--~--~~-~~--~--~~-~~");
					System.out.println("   " + ticket.getMovieName() + " 예매 완료");
					System.out.println();
				} else {
					System.out.println("   " + "예매 실패");
				}
				break;
			case 2:
				return;
			default:
				System.out.println("   잘못된 번호 입력");
				break;
			}

		}

	}

	// 영화정보
	public void playMoive() {
		System.out.println("   =======================현재 상영작=======================");
		System.out.println("   |    1.노량   2.서울의 봄   3.아쿠아맨과 로스트 킹덤    |");
		System.out.println("   |                                                       |");
		System.out.println("   |      4. 류이치 사카모토-오퍼스 5.괴물 6.전체보기      |");
		System.out.println("   =========================================================");
		System.out.print("   상세 정보 ▶");
		int movieNum = sc.nextInt();

		if (movieNum == 6) {
			List<CinemaDTO> lists = dao.moivesInfo(movieNum);
			Iterator<CinemaDTO> it = lists.iterator();

			while (it.hasNext()) {
				// 영화 정보 전체출력
				CinemaDTO movieAll = it.next();
				System.out.println();
				System.out.println("   ========================영화 정보========================");
				System.out.println("   영화명: " + movieAll.getMovieName());
				System.out.println("   장르: " + movieAll.getMovieGenre() + "   러닝타임: " + movieAll.getMovieTime());
				System.out.println("   " + movieAll.getMovieSub());
				System.out.println("   =========================================================");
			}
		} else {
			CinemaDTO dto = dao.moiveInfo(movieNum);

			while (true) {
				if (dto != null) {

					System.out.println("   ========================영화 정보========================");
					System.out.println("   영화명: " + dto.getMovieName());
					System.out.println("   장르: " + dto.getMovieGenre() + "   러닝타임: " + dto.getMovieTime());
					System.out.println("   " + dto.getMovieSub());
					System.out.println("   =========================================================");

					System.out.println("   1.HOME 2.뒤로가기");
					System.out.print("   ▶ ");
					int ck = sc.nextInt();

					switch (ck) {
					case 1:
						System.out.println("   메인으로 돌아갑니다.");
						return;
					case 2:
						playMoive();
						break;
					default:
						System.out.println("   올바른 번호를 입력해주세요.");
						break;
					}

				} else {
					System.out.println("   올바른 번호를 입력해주세요.");
					break;
				}
				return;
			}
		}

	}

	// 예매확인 및 취소
	public void checkMoive(String id, String name) {
		// 영화를 여러개 예매했을 수도 있어서 리스트 필요
		List<CinemaDTO> lists = dao.check(id);

		// 받아온 데이터 반복자로 출력
		Iterator<CinemaDTO> it = lists.iterator();
		System.out.println();
		System.out.println("   ========================예매 내역========================");
		System.out.println();
		System.out.println("   " + name + "님의 예매내역");
		int i = 1;

		if (lists.isEmpty()) {
			System.out.println("   예매 내역이 없습니다.");
		} else {
			while (it.hasNext()) {
				CinemaDTO dto = (CinemaDTO) it.next();
				// System.out.println("- " + dto.getMovieName());
				System.out.println("   " + i + ". " + dto.getMovieName());
				i++;
			}
			i = 1; // 순서 초기화
		}
		System.out.println();
		System.out.println("   =========================================================");

		int ck = 1;
		while (true) {
			do {
				System.out.println("   1.예매취소 2.뒤로가기");
				System.out.print("   ▶ ");
				ck = sc.nextInt();
			} while (ck < 1);

			switch (ck) {
			case 1:
				System.out.println("   취소할 영화 이름: ");
				System.out.print("   ▶ ");
				String movieName = sc.next();
				CinemaDTO dto = dao.cancelBooking(movieName, id);

				if (dto != null) {
					System.out.println("   " + dto.getMovieName() + " 예매 취소 완료");
				} else {
					System.out.println("   예매 취소 실패");
				}

				break;
			case 2:
				return;
			default:
				System.out.println("   잘못된 번호 입력");
				break;
			}

		}

	}

	// 관리자페이지
	public void manager(String id, String pw) {

		if (id.equals("admin")) {
			System.out.println("   관리자님 환영합니다.");
			CinemaDAO ob = new CinemaDAO();
			int ch;

			while (true) {
				do {
					System.out.println("   =========================================================");
					System.out.println("   |     1.회원출력 2.회원검색 3.회원예매내역 4.뒤로가기   |");
					System.out.println("   =========================================================");
					System.out.print("   ▶ ");
					ch = sc.nextInt();
				} while (ch < 1);

				switch (ch) {
				case 1:
					ob.printAll();
					break;
				case 2:
					System.out.print("   검색할 회원 아이디: ");
					String userId = sc.next();
					ob.printOne(userId);
					break;
				case 3:
					ob.reserveAll();
					break;
				case 4:
					System.out.println("   메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("   잘못된 번호 입력");
					break;

				}
			}
		} else {
			System.out.println("   관리자 권한이 없습니다.");
			return;
		}
	}
}
