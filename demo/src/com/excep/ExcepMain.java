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

			System.out.print("�� ���� ����?[a,b]");// 10,20
			str = br.readLine();

			om.inputFormat(str);// ������ ����

			String[] temp = str.split(",");

			om.number(temp[0]); // ����, �Ǽ� ����
			num1 = Double.parseDouble(temp[0]);

			om.number(temp[0]); // ����, �Ǽ� ����
			num2 = Double.parseDouble(temp[1]);

			System.out.println("������?");// +-*/
			str = br.readLine();

			om.operator(str.charAt(0));// ������ ����

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

//Operator Method�� ���´ٰ� ������ ������ ���ƿ��� ������ ������  MyException���� ���� e�� ����� �����ϴ� ��