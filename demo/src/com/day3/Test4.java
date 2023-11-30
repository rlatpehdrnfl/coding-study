package com.day3;

import java.io.BufferedReader;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// throws IOException
		//한개의 문자를 입력받을 수 있음
		// char ch = 'a';//97이라는 기호, 신호가 입력
		// 하나의 아스키 값만 들어갈 수 있음
		
		// System.out.println(ch);//a
		// System.out.println(Integer.toString(ch));//97
		
		char ch,result;
		
		System.out.print("한개의 문자");//a(97(기호))
		//강제 형변환
		ch = (char)System.in.read();   //-> int 형식으로 받음.
		//System.in : 키보드로 입력한 하나의 1byte문자만 입력받음
				
		System.out.println(ch);
		/////////System.out.println(Integer.toString(ch));

		result = ch>=65 && ch<=90 ? (char)(ch+32) : (ch>='a' && ch<='z'?(char)(ch-32):ch);
				// char가 정수타입에 속함 -> (char)강제로 변환 왜 하는건지?
		
		System.out.println(ch + "->" + result);
		
		//엔터 : 커서를 밑으로 이동 : CR + 커서를 왼쪽으로 이동 : LF

		
	
	}

}
