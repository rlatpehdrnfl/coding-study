package com.dayDB;

import java.sql.Connection;

import com.db.DBConn;

public class Test1 {

	public static void main(String[] args) {

		Connection conn = DBConn.getConnection();

		if (conn == null) {
			System.out.println("�����ͺ��̽� ���� ����");
			System.exit(0);
		}

		System.out.println("�����ͺ��̽� ���� ����!!");
		System.out.println(conn);

		DBConn.close();
	}

}
