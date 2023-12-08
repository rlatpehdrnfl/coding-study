package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// 파일 복사 프로그램
		// 원본파일? c:\\doc\\test.txt
		// 대상파일? c:\\doc\\out2.txt
		// 복사완료

		try {

			Scanner sc = new Scanner(System.in);

			String str1, str2;
			int data;

			System.out.println("원본파일?");
			str1 = sc.next();

			System.out.println("대상파일?");
			str2 = sc.next();

			FileInputStream fis = new FileInputStream(str1);// !!!!!!!!!!암기!!!!!!!!!!!!!!!!
			FileOutputStream fos = new FileOutputStream(str2);// !!!!!!!!!!!!!암기!!!!!!!!!!!!!

			while ((data = fis.read()) != -1) {

				fos.write(data);
				fos.flush();
			}

			fis.close();
			fos.close();

			System.out.println("복사완료!!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
//test5 +6 은 파일 복사하는 효과
