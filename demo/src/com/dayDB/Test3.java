package com.dayDB;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		int ch;
		int id;
		String name, birth, tel;

		try {

			while (true) {

				do {
					System.out.print("1.입력 2.출력 3.종료: ");
					ch = sc.nextInt();
				} while (ch < 1);

				switch (ch) {

				case 1:
					conn.setAutoCommit(false);

					System.out.print("아이디?");
					id = sc.nextInt();

					System.out.println("이름?");
					name = sc.next();

					System.out.println("생일?");// 1990-10-10
					birth = sc.next();

					System.out.println("전화?");
					tel = sc.next();

					sql = String.format("insert into test1(id,name) values (%d,'%s')", id, name);

					stmt = conn.createStatement();
					stmt.executeUpdate(sql);

					sql = String.format("insert into test2(id,birth) values (%d,'%s')", id, birth);

					stmt = conn.createStatement();
					stmt.executeUpdate(sql);

					sql = String.format("insert into test3(id,tel) values (%d,'%s')", id, tel);

					stmt = conn.createStatement();
					stmt.executeUpdate(sql);

					conn.commit();
					break;

				case 2:
					break;

				case 3:
					DBConn.close();
					System.exit(0);
					break;
				}

			}

		} catch (Exception e) {

		}

	}

}
