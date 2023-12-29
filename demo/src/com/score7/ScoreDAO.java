package com.score7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.internal.OracleTypes;

public class ScoreDAO {// DB에 연결 / 처리 클래스 (Data Access Object)

	// 추가
	// return 0아님 1 이어야하니까 int

	// DAO는 연결시켜주는애니까 그럼 일단 먼저 데이터 내놔(ScoreDTO)~~~
	public int insertData(ScoreDTO dto) {

		int result = 0;

		// db찾아가야함
		Connection conn = DBConn.getConnection();

		// (2) PreparedStatement - interface

		CallableStatement cstmt = null;
		String sql; // 쿼리를 저장할 저장소 sql 필요함

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			// 2. connection이 Statement를 만드는거니까
			cstmt = conn.prepareCall(sql); // conn = db를 미리 찾아가 ->
			// sql insert문(29,30)을 가지고가서 db에 검사를 맡고 pstmt에 insert문이 들어가있음

			// (첫번째 물음표, dto에 5개의데이터가있으니까 => 순서대로 (?,?,?,?,?) 안에 들어가게 됨)
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate(); // **실제로 DB로 가는 명령어!!!**

			cstmt.close(); // 꼭 닫아주기
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
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			cstmt.setInt(1, dto.getKor());
			cstmt.setInt(2, dto.getEng());
			cstmt.setInt(3, dto.getMat());
			cstmt.setString(4, dto.getHak());

			result = cstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// 삭제
	public int deleteData(String hak) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call deleteScore(?)}";// 굳이 이렇게 할 필요 업삼

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, hak);// 물음표 채워넣는 곳

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 전체 출력 ((동명이인이 나올 수도 있으니까 LIST로 받음)
	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;// 쿼리문 입력하게 해주는 거

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {

			// select문
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // 랭킹
			sql += "from score";

			cstmt = conn.prepareCall(sql);

			// out파라미터의 자료형 설정(돌려받는 자료형)
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// 프로시져 실행
			rs = cstmt.executeQuery(); // select = exexcuteQuery임

			// out파라미터의 값을 돌려받기
			rs = (ResultSet) cstmt.getObject(1);

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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// 이름검색 (동명이인이 나올 수도 있으니까 LIST로 받음)
	public List<ScoreDTO> searchName(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {

			// select문

			sql = "{call selectNameScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out파라미터의 값을 돌려받기
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in 파라미터
			cstmt.setString(2, name);

			rs = cstmt.executeQuery(); // select = exexcuteQuery임

			// 프로시져 실행
			cstmt.executeQuery();

			rs = (ResultSet) cstmt.getObject(1);

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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// 학번검색 (동명이인이 나올 수도 있으니까 LIST로 받음)
	public ScoreDTO searchHak(String hak) { // hak은 똑같은 데이터 없음 - primary key => dto에 담을거고 dto를 반환해주면 됨

		ScoreDTO dto = null; // new 객체생성 - 없을 수도 있으니까 , 필요할때 객체생성하면 됨

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		// select를 하게 됐을때 select 한 결과(table)를 담는 그릇인 ResultSet (interface) 가 무조건 필요함
		ResultSet rs = null;

		String sql;

		try {
			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out파라미터의 값을 돌려받기
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in 파라미터
			cstmt.setString(2, hak);

			rs = cstmt.executeQuery(); // select = exexcuteQuery임

			// 프로시져 실행
			cstmt.executeQuery();

			rs = (ResultSet) cstmt.getObject(1);
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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}
}
