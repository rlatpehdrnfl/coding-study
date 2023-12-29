package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

	private static Connection dbConn;

	public static Connection getConnection() {

		if (dbConn == null) {

			try {

				String url = "jdbc:oracle:thin:@192.168.16.19:1521:xe";
				String user = "suzi";
				String pwd = "a123";

				Class.forName("oracle.jdbc.driver.OracleDriver");

				dbConn = DriverManager.getConnection(url, user, pwd);

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

		return dbConn;

	}

	public static void close() {

		if (dbConn != null) {

			try {

				if (!dbConn.isClosed()) {
					dbConn.close();
				}

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

		dbConn = null;
	}

}
