package com.dayDB;
//Sql 구문을 연결해서 실행해주는 인터페이스

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//Statement 
//PreparedStatement 
//CallableStatement -- Procedure를 호출해서 사용

public class Test2 {

	public static void main(String[] args) {

		Connection conn = DBConn.getConnection();

		if (conn == null) {
			System.out.println("데이터베이스 연결 실패!");
			System.exit(0);

		}
		// DB연결 방법
		// 1.DriverManager가 Connection을 생성
		// 2.Connection이 Statement를 생성
		// 3.Statement가 query를 실행

		try {

			Statement stmt = conn.createStatement();

			String sql;
			/*
			 * sql = "insert into score (hak,name,kor,eng,mat) "; sql +=
			 * "values ('111','배수지',70,50,80)";
			 * 
			 * int result = stmt.executeUpdate(sql);
			 * 
			 * if (result == 1) { System.out.println("성공 추가!!"); }
			 */

			/*
			 * sql = "update score set kor=99, eng=99, mat=99 "; sql += "where hak=111";
			 * 
			 * int result = stmt.executeUpdate(sql);
			 * 
			 * if (result == 1) { System.out.println("성공 수정!!"); }
			 */

			sql = "delete score where hak = 111";

			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("성공 삭제!!");
			}

			// sql = "insert into score (hak,name,kor,eng,mat) ";
			// sql += "values ('"+ hak + "','",+ name + "'," + kor + "," + eng + "," + mat +
			// ")";

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		DBConn.close();

	}

}
