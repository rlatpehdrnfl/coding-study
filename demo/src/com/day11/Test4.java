package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//String�� �޼ҵ带 ����ؼ� ���� ����
public class Test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("����[3 + 5]: ");// 5 9 + 3
		String str = br.readLine();

		str = str.replaceAll("\\s", "");

		// System.out.println(str);// 59+3

		String[] op = { "+", "-", "*", "/" };
		for (String oper : op) {
			// for(String op : new String[]){ "+", "-", "*", "/" }

			int pos = str.indexOf(oper);
			// System.out.println(pos);//2

			if (pos > -1) {

				int num1 = Integer.parseInt(str.substring(0, pos));// substring�� �ڿ��� -1����� ��ex}pos
				int num2 = Integer.parseInt(str.substring(pos + 1));

				int result = 0;

				char operator = str.charAt(pos);

				switch (operator) {

				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}

				// System.out.printf("%d %c %d = %d",num1,operator,num2,result);
				String s = String.format("%d %c %d = %d", num1, operator, num2, result); // String.format�� printf�� �Ȱ���

				System.out.println(s);
			}

		}

	}
}
