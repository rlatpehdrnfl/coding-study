package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out.println("1.�Է� 2.��� 3. �����ϱ� 4.������Ʈ �ϱ� 5.�й� ã�� 6.�̸� ã�� 7.����: ");

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
				ob.delete();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findHak();
				break;
			case 6:
				ob.findName();
				break;
			default:
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
		}

	}

}
