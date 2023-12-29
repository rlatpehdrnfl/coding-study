package com.score7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.internal.OracleTypes;

public class ScoreDAO {// DB�� ���� / ó�� Ŭ���� (Data Access Object)

	// �߰�
	// return 0�ƴ� 1 �̾���ϴϱ� int

	// DAO�� ��������ִ¾ִϱ� �׷� �ϴ� ���� ������ ����(ScoreDTO)~~~
	public int insertData(ScoreDTO dto) {

		int result = 0;

		// dbã�ư�����
		Connection conn = DBConn.getConnection();

		// (2) PreparedStatement - interface

		CallableStatement cstmt = null;
		String sql; // ������ ������ ����� sql �ʿ���

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			// 2. connection�� Statement�� ����°Ŵϱ�
			cstmt = conn.prepareCall(sql); // conn = db�� �̸� ã�ư� ->
			// sql insert��(29,30)�� �������� db�� �˻縦 �ð� pstmt�� insert���� ������

			// (ù��° ����ǥ, dto�� 5���ǵ����Ͱ������ϱ� => ������� (?,?,?,?,?) �ȿ� ���� ��)
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate(); // **������ DB�� ���� ��ɾ�!!!**

			cstmt.close(); // �� �ݾ��ֱ�
			// ������ ������� 1 �ȴ������ 0
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// ����
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

	// ����
	public int deleteData(String hak) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call deleteScore(?)}";// ���� �̷��� �� �ʿ� ����

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, hak);// ����ǥ ä���ִ� ��

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// ��ü ��� ((���������� ���� ���� �����ϱ� LIST�� ����)
	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;// ������ �Է��ϰ� ���ִ� ��

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {

			// select��
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // ��ŷ
			sql += "from score";

			cstmt = conn.prepareCall(sql);

			// out�Ķ������ �ڷ��� ����(�����޴� �ڷ���)
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// ���ν��� ����
			rs = cstmt.executeQuery(); // select = exexcuteQuery��

			// out�Ķ������ ���� �����ޱ�
			rs = (ResultSet) cstmt.getObject(1);

			while (rs.next()) { // next() : ���� ��ĭ ���������� �����Ͱ� �ִ�?

				// �����Ͱ� ������
				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1������ ����
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

	// �̸��˻� (���������� ���� ���� �����ϱ� LIST�� ����)
	public List<ScoreDTO> searchName(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {

			// select��

			sql = "{call selectNameScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out�Ķ������ ���� �����ޱ�
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in �Ķ����
			cstmt.setString(2, name);

			rs = cstmt.executeQuery(); // select = exexcuteQuery��

			// ���ν��� ����
			cstmt.executeQuery();

			rs = (ResultSet) cstmt.getObject(1);

			while (rs.next()) { // �̸������ �𸣴ϱ� while / next() : ���� ��ĭ ���������� �����Ͱ� �ִ�?

				// �����Ͱ� ������
				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1������ ����
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

	// �й��˻� (���������� ���� ���� �����ϱ� LIST�� ����)
	public ScoreDTO searchHak(String hak) { // hak�� �Ȱ��� ������ ���� - primary key => dto�� �����Ű� dto�� ��ȯ���ָ� ��

		ScoreDTO dto = null; // new ��ü���� - ���� ���� �����ϱ� , �ʿ��Ҷ� ��ü�����ϸ� ��

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {
			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out�Ķ������ ���� �����ޱ�
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in �Ķ����
			cstmt.setString(2, hak);

			rs = cstmt.executeQuery(); // select = exexcuteQuery��

			// ���ν��� ����
			cstmt.executeQuery();

			rs = (ResultSet) cstmt.getObject(1);
			if (rs.next()) { // ������ �ϳ� = if / ���� ��ĭ ���������� �����Ͱ� �ִ�?

				// �����Ͱ� ������
				dto = new ScoreDTO();

				dto.setHak(rs.getString(1));// 1������ ����
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
