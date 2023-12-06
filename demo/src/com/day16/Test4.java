package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static String getOper() throws Exception {// static이 있기 때문에 객체생성 따로 안해도 됨

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String oper = "";

		try {

			System.out.println("연산자 ?");// +,-,*,/
			oper = br.readLine();

			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {

				// 사용자 정의 에러
				// throw로 예외를 의도적으로 발생시킴
				throw new Exception("연산자 입력 오류");// overloading됨
			}

		} catch (IOException e) {
			System.out.println("입력에러!");
		}

		return oper;
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, result;
		String oper;

		try {

			System.out.println("첫번째 수?");
			num1 = Integer.parseInt(br.readLine());

			System.out.println("두번째 수?");
			num2 = Integer.parseInt(br.readLine());

			oper = Test4.getOper();// error 발생

			result = 0;

			if (oper.equals("+"))
				result = num1 + num2;
			else if (oper.equals("-"))
				result = num1 - num2;
			else if (oper.equals("*"))
				result = num1 * num2;
			else if (oper.equals("/"))
				result = num1 / num2;

			System.out.printf("%d %s %d = %d", num1, oper, num2, result);

		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

}
