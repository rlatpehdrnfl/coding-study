package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		//System.out.print("이름 국어 영어 수학");//세빈 50 70 60

		System.out.print("이름,국어,영어,수학");//세빈,50,70,60
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		// 정규화 표현식 \\s : 공백 한 칸 -> 쉼표 옆으로 공백이 있으면 안된다...
		//-> , 로 쓰고 싶으면 써줘야 함!
		
		
				
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		//null은 정수로 바꿀 수 없음
		
		
		System.out.println(name + ":" + (kor+eng+mat) + "점");
		
		
		
		
		

	}

}
