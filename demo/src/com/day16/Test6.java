package com.day16;

import java.util.Scanner;

class MyAuthenticator {

	public void inputFormat(String str) throws Exception {

		// ���� ����
		// 1. ����ڰ� �Է��� ���ڿ��� 5~10���̳����� �˻�
		// 2. ������(��ҹ��� ����x),���� ȥ���Է�

		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("���ڿ��� ���̴� 5~10���Դϴ�");
		}

		int eng = 0;
		int num = 0;

		// str = "a1b2c3"
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				eng++;

			} else if (ch >= '0' && ch <= '9')
				num++;

		}

		if (eng == 0 || num == 0) {
			throw new Exception("������, ���� ȥ�븸 �����մϴ�");
		}
	}

}

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;

		MyAuthenticator auth = new MyAuthenticator();

		try {

			System.out.println("���ڿ�: ");// abcd
			str = sc.next();

			auth.inputFormat(str);// ����????

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
