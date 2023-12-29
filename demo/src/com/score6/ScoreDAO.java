package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO {// DB에 연결 / 처리 클래스 (Data Access Object)

	// 추가
	// return 0아님 1 이어야하니까 int

	// DAO는 연결시켜주는애니까 그럼 일단 먼저 데이터 내놔(ScoreDTO)~~~
	public int insertData(ScoreDTO dto) {

		int result = 0;

		// db찾아가야함
		Connection conn = DBConn.getConnection();

		// (2) PreparedStatement - interface

		PreparedStatement pstmt = null;
		String sql; // 쿼리를 저장할 저장소 sql 필요함

		try {

			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values (?,?,?,?,?)";

			// 2. connection이 Statement를 만드는거니까
			pstmt = conn.prepareStatement(sql); // conn = db를 미리 찾아가 ->
			// sql insert문(29,30)을 가지고가서 db에 검사를 맡고 pstmt에 insert문이 들어가있음

			// (첫번째 물음표, dto에 5개의데이터가있으니까 => 순서대로 (?,?,?,?,?) 안에 들어가게 됨)
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate(); // **실제로 DB로 가는 명령어!!!**

			pstmt.close(); // 꼭 닫아주기
			// 정보가 담아지면 1 안담아지면 0
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 수정
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "update score set kor=?,eng=?,mat=? ";
			sql += "where hak=?";// 조건문

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// 삭제
	public int deleteData(String hak) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "delete score where hak = ? ";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);// 물음표 채워넣는 곳

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 전체 출력 ((동명이인이 나올 수도 있으니까 LIST로 받음)
	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;// 쿼리문 입력하게 해주는 거

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {

			// select문
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // 랭킹
			sql += "from score";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // select = exexcuteQuery임

			while (rs.next()) { // next() : 다음 한칸 내려봤을때 데이터가 있니?

				// 데이터가 있으면
				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1번부터 시작
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));

				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt(7));
				dto.setRank(rs.getInt("rank"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// 이름검색 (동명이인이 나올 수도 있으니까 LIST로 받음)
	public List<ScoreDTO> searchName(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {

			// select문
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // 랭킹
			sql += "from score where name = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery(); // select = exexcuteQuery임

			while (rs.next()) { // 이름몇개인지 모르니까 while / next() : 다음 한칸 내려봤을때 데이터가 있니?

				// 데이터가 있으면
				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1번부터 시작
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));

				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt(7));
				dto.setRank(rs.getInt("rank"));

				lists.add(dto);

			}
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// 학번검색 (동명이인이 나올 수도 있으니까 LIST로 받음)
	public ScoreDTO searchHak(String hak) { // hak은 똑같은 데이터 없음 - primary key => dto에 담을거고 dto를 반환해주면 됨

		ScoreDTO dto = null; // new 객체생성 - 없을 수도 있으니까 , 필요할때 객체생성하면 됨

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {

			// select문
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave "; // from 앞에 붙으면 안되니까 한칸 띄기
			// sql += "rank() over (order by (kor+eng+mat) desc) rank "; //랭킹 - 어차피 1명이므로
			sql += "from score where hak = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);

			rs = pstmt.executeQuery(); // select = exexcuteQuery임

			if (rs.next()) { // 어차피 하나 = if / 다음 한칸 내려봤을때 데이터가 있니?

				// 데이터가 있으면
				dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1번부터 시작
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));

				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt(7));
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}

}
