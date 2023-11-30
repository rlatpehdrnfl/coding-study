package com.day3;

import java.util.Scanner;

//Scanner : 단락문자의 패턴( , 등)을 사용해 구분
// 기본패턴 : 공백

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner 는 BufferedReader의 대용품
		
		String name;
		int kor;
		
		System.out.print("이름?"); //세빈
		name = sc.next();
				// next는 반환값이 String
				// 읽어내는 함수가 next()
		
		System.out.print("국어?"); //100
		kor = sc.nextInt();
		
		String pan="";
		
		// else if 조건이 여러개이고 작업도 여러개일 때
		
		if(kor>=90) {
			pan = "수";
		}else if(kor>=80) {
			pan = "우";
		}else if(kor>=70) {
			pan = "미";
		}else if(kor>=60) {
			pan = "양";
		}else {
			pan = "가";
		}
		//else로 처리하기 때문에 pan을 초기화하지 않아도 빨간줄이 안 생김
		//비교할 때 큰 숫자-작은숫자 순서대로
		//조건이 위에서 맞으면 밑에 있는 것은 통과~
		//else가 있기 때문에 초기화하지 않아도 빨간줄이 안 보임(그치만 지금은 초기화해놓음ㅎ)
		
		System.out.println(name + ":" + pan);
		

	}

}
