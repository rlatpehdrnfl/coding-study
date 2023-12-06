package com.excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcepMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		double num1, num2, result;

		OperatorMethod om = new OperatorMethod();

		try {

			System.out.print("두 개의 숫자?[a,b]");// 10,20
			str = br.readLine();

			om.inputFormat(str);// 데이터 검증

			String[] temp = str.split(",");

			om.number(temp[0]); // 정수, 실수 검증
			num1 = Double.parseDouble(temp[0]);

			om.number(temp[0]); // 정수, 실수 검증
			num2 = Double.parseDouble(temp[1]);

			System.out.println("연산자?");// +-*/
			str = br.readLine();

			om.operator(str.charAt(0));// 연산자 검증

			char oper = str.charAt(0);

			result = 0;

			if (oper == '+')
				result = num1 + num2;
			else if (oper == '-')
				result = num1 + num2;
			else if (oper == '*')
				result = num1 + num2;
			else if (oper == '/')
				result = num1 + num2;

			System.out.printf("%g %c %g = %g\n", num1, oper, num2, result);

		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

}

//Operator Method로 보냈다가 오류가 없으면 돌아오고 오류가 있으면  MyException으로 가서 e에 결과를 저장하는 것