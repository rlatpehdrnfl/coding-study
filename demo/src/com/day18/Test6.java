package com.day18;

import java.io.FileOutputStream;

//FileOutputStream
public class Test6 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("c:\\doc\\out1.txt");

			int data;
			System.out.println("문자열 입력:");

			while ((data = System.in.read()) != -1) {

				fos.write(data);

				fos.flush();
			}

			fos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
