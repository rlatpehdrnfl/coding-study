package com.day18;

import java.util.Scanner;

public class DdataMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ddata ob = new DdataImpl();

		int ch;
		while (true) {

			do {
				System.out.print("1. �Է� 2. ��� 3. ���� 4. ����");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.save();
				break;

			default:
				System.exit(0);// ��������
			}

		}

	}

}
