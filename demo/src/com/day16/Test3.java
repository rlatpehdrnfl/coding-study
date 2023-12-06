package com.day16;

import java.util.Scanner;

//예외처리 :  에러가 났을때 처리하는 것
//Exception
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		String oper;

		try {

			System.out.println("두 개의 수?");// 20 30
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println("연산자?");// +
			oper = sc.next();

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

		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해라!");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");

		} catch (Exception e) {
			// System.out.println(e.toString());
			// e.printStackTrace();
			System.out.println("넌 그게 숫자로 보이냐?");

		}
	}
}
