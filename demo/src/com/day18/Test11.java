package com.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Test11 {

	public static void main(String[] args) {

		String str = "c:\\doc\\temp\\java\\test1.txt";

//		// ���1
//		String path = str.substring(0, str.lastIndexOf("\\"));
//
//		System.out.println(path);
//
//		File f = new File(path);
//
//		if (!f.exists()) {
//
//			f.mkdirs();
//
//		}

		// ���2
		File f = new File(str);

		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		// ����
		try {

			FileOutputStream fos = new FileOutputStream(str);

			System.out.print("���ڿ� �Է�?");

			int data;

			while ((data = System.in.read()) != -1) {
				fos.write(data);
				fos.flush();
			}

		} catch (Exception e) {
			System.out.println();
		}

	}

}