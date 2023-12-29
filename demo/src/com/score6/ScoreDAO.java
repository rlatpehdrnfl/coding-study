package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO {// DB�� ���� / ó�� Ŭ���� (Data Access Object)

	// �߰�
	// return 0�ƴ� 1 �̾���ϴϱ� int

	// DAO�� ��������ִ¾ִϱ� �׷� �ϴ� ���� ������ ����(ScoreDTO)~~~
	public int insertData(ScoreDTO dto) {

		int result = 0;

		// dbã�ư�����
		Connection conn = DBConn.getConnection();

		// (2) PreparedStatement - interface

		PreparedStatement pstmt = null;
		String sql; // ������ ������ ����� sql �ʿ���

		try {

			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values (?,?,?,?,?)";

			// 2. connection�� Statement�� ����°Ŵϱ�
			pstmt = conn.prepareStatement(sql); // conn = db�� �̸� ã�ư� ->
			// sql insert��(29,30)�� �������� db�� �˻縦 �ð� pstmt�� insert���� ������

			// (ù��° ����ǥ, dto�� 5���ǵ����Ͱ������ϱ� => ������� (?,?,?,?,?) �ȿ� ���� ��)
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate(); // **������ DB�� ���� ��ɾ�!!!**

			pstmt.close(); // �� �ݾ��ֱ�
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
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "update score set kor=?,eng=?,mat=? ";
			sql += "where hak=?";// ���ǹ�

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

	// ����
	public int deleteData(String hak) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "delete score where hak = ? ";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);// ����ǥ ä���ִ� ��

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// ��ü ��� ((���������� ���� ���� �����ϱ� LIST�� ����)
	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;// ������ �Է��ϰ� ���ִ� ��

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {

			// select��
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // ��ŷ
			sql += "from score";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // select = exexcuteQuery��

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
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// �̸��˻� (���������� ���� ���� �����ϱ� LIST�� ����)
	public List<ScoreDTO> searchName(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {

			// select��
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
			sql += "rank() over (order by (kor+eng+mat) desc) rank "; // ��ŷ
			sql += "from score where name = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery(); // select = exexcuteQuery��

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
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// �й��˻� (���������� ���� ���� �����ϱ� LIST�� ����)
	public ScoreDTO searchHak(String hak) { // hak�� �Ȱ��� ������ ���� - primary key => dto�� �����Ű� dto�� ��ȯ���ָ� ��

		ScoreDTO dto = null; // new ��ü���� - ���� ���� �����ϱ� , �ʿ��Ҷ� ��ü�����ϸ� ��

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		// select�� �ϰ� ������ select �� ���(table)�� ��� �׸��� ResultSet (interface) �� ������ �ʿ���
		ResultSet rs = null;

		String sql;

		try {

			// select��
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave "; // from �տ� ������ �ȵǴϱ� ��ĭ ���
			// sql += "rank() over (order by (kor+eng+mat) desc) rank "; //��ŷ - ������ 1���̹Ƿ�
			sql += "from score where hak = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);

			rs = pstmt.executeQuery(); // select = exexcuteQuery��

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
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}

}
