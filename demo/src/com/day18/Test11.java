package com.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Test11 {

	public static void main(String[] args) {

		String str = "c:\\doc\\temp\\java\\test1.txt";

//		// 방법1
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

		// 방법2
		File f = new File(str);

		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		// 공용
		try {

			FileOutputStream fos = new FileOutputStream(str);

			System.out.print("문자열 입력?");

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
