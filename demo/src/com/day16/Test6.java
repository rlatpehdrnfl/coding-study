package com.day16;

import java.util.Scanner;

class MyAuthenticator {

	public void inputFormat(String str) throws Exception {

		// 검증 조건
		// 1. 사용자가 입력한 문자열이 5~10자이내인지 검사
		// 2. 영문자(대소문자 구분x),숫자 혼합입력

		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("문자열의 길이는 5~10자입니다");
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
			throw new Exception("영문자, 숫자 혼용만 가능합니다");
		}
	}

}

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;

		MyAuthenticator auth = new MyAuthenticator();

		try {

			System.out.println("문자열: ");// abcd
			str = sc.next();

			auth.inputFormat(str);// 검증????

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
