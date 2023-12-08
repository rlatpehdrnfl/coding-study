package com.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));// inputstreamreader를 쓴 이유는 사용자에게 키보드로
																				// 입력한 문자(1byte)를 받아 2byte로 만들기 위해서

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// inputstreamreader를 쓴 이유는 사용자에게 키보드로
																					// 입력한 문자(1byte)를 받아 2byte로 만들기 위해서

	}

}
