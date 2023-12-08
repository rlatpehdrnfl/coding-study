package com.day18;

import java.io.IOException;

//Stream

//기본 입출력스트림
//in
public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("문자열 입력: ");// abc123
		while ((data = System.in.read()) != -1) {// -1은 데이터가 없으면 이라는 뜻
			char ch = (char) data;

			System.out.print(ch);
		}

	}

}
//String은 겹쳐서 쓸 수 있음
