package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// ���� ���� ���α׷�
		// ��������? c:\\doc\\test.txt
		// �������? c:\\doc\\out2.txt
		// ����Ϸ�

		try {

			Scanner sc = new Scanner(System.in);

			String str1, str2;
			int data;

			System.out.println("��������?");
			str1 = sc.next();

			System.out.println("�������?");
			str2 = sc.next();

			FileInputStream fis = new FileInputStream(str1);// !!!!!!!!!!�ϱ�!!!!!!!!!!!!!!!!
			FileOutputStream fos = new FileOutputStream(str2);// !!!!!!!!!!!!!�ϱ�!!!!!!!!!!!!!

			while ((data = fis.read()) != -1) {

				fos.write(data);
				fos.flush();
			}

			fis.close();
			fos.close();

			System.out.println("����Ϸ�!!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
//test5 +6 �� ���� �����ϴ� ȿ��
