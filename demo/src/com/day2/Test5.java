package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		
		///선언(정의)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		// 클래스(String)에 name 아무것도 안들어 있음 (null상태)
		int kor, eng, tot;
		// int 자료형은 쓰레기값이 들어가 있음
		float ave;
		
		/// 입력
		System.out.print("이름이 뭐니?"); //세빈
		name = br.readLine();
		// readLine() : String으로 되돌려 줌
		
		
		//System.out.println(name);
		
		System.out.print("국어점수는?"); //60
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어점수는?"); //80
		eng = Integer.parseInt(br.readLine());
		
		///연산
		tot = kor + eng;
		// 프로그램은 위에서 아래로 실행되기 때문에 tot 값을 미리 설정해놓아야 함.
		
		ave = tot/2.0f;
		//Java는 실수를 마주하면 double로 생각하기 때문에 float으로 설정된 ave를 float이라고 알려주기 위해 f라고 쓴다.
		
		///출력
		System.out.printf("%s의 성적 총점은 %d이고 평균은 %.2f입니다.",name,tot,ave);
		
	}

}
