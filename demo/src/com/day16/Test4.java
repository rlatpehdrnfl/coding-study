package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static String getOper() throws Exception {// static�� �ֱ� ������ ��ü���� ���� ���ص� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String oper = "";

		try {

			System.out.println("������ ?");// +,-,*,/
			oper = br.readLine();

			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {

				// ����� ���� ����
				// throw�� ���ܸ� �ǵ������� �߻���Ŵ
				throw new Exception("������ �Է� ����");// overloading��
			}

		} catch (IOException e) {
			System.out.println("�Է¿���!");
		}

		return oper;
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, result;
		String oper;

		try {

			System.out.println("ù��° ��?");
			num1 = Integer.parseInt(br.readLine());

			System.out.println("�ι�° ��?");
			num2 = Integer.parseInt(br.readLine());

			oper = Test4.getOper();// error �߻�

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
