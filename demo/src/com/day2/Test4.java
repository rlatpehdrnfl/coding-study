package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
// class는 복제해서 사용 but 원본은 사용 불가능하다.
	
	public static void main(String[] args) throws IOException {
		
		// IOException : 사용자에게 문제가 발생할 수 있다는 걸 client에게 알려줌
		// 입출력 에러를 제외하는 것.(오류 무시해~)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 사용자가 입력한 값을 읽어서 가지고 들어가는 부품
		
		// System.in (시스템이라는 클래스 안에 들어있는 매소드. out은 출력 in은 출입)
		// System.in : 키보드를 통해 1byte를 입력받음
		// InputStreamReader : System.in으로 읽어온 1byte를 문자(2byte)로 변경
		// BufferedReader : 처리속도를 높이는 저장공간
		
		int r;
		double area, length;
		
		System.out.print("반지름?");//10
		
		r = Integer.parseInt(br.readLine()); //형변환 : 문자를 숫자로 바꾸는 것
		// bufferedreader라는 클래스 안에 readLine이라는 메소드.
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("반지름:" + r + ", 넓이:" + area);
		
		System.out.printf("반지름:%d, 둘레:%.2f",r,length);
		

	}

}
