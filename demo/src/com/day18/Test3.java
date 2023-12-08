package com.day18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte문자를 2byter Stream으로 변환해 주는 Stream

//OutputStreamReader

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("문자열?");

		Reader rd = new InputStreamReader(System.in);// Reader 보급형 저장소

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.print(ch);
		}

	}

}
