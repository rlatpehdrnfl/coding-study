package com.day18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte���ڸ� 2byter Stream���� ��ȯ�� �ִ� Stream

//OutputStreamReader

public class Test3 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("���ڿ�?");

		Reader rd = new InputStreamReader(System.in);// Reader ������ �����

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.print(ch);
		}

	}

}
