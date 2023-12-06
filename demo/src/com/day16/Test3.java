package com.day16;

import java.util.Scanner;

//����ó�� :  ������ ������ ó���ϴ� ��
//Exception
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		String oper;

		try {

			System.out.println("�� ���� ��?");// 20 30
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.println("������?");// +
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
			System.out.println("������ �Է��ض�!");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");

		} catch (Exception e) {
			// System.out.println(e.toString());
			// e.printStackTrace();
			System.out.println("�� �װ� ���ڷ� ���̳�?");

		}
	}
}
