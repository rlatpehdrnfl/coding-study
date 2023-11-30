package com.day7;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = {"가위","바위","보"};
		Random rd = new Random();
		
		int com = rd.nextInt(3)+1;
		
		//System.out.println(com);

		int user;
		do {
			System.out.println("1:가위, 2:바위, 3:보");
			user = sc.nextInt();
		}while(user<1||user>3);
		
		
		System.out.println("사용자: " + str[user-1] + ", 컴퓨터: " + str[com-1]);
		
		String result;
		
		result = "무승부 입니다";
				
		if((user==1 && com==3) || (user>com && !(com==1 && user ==3))) {
			result = "사용자가 이겼습니다";
		}
		
		if((com==1 && user==3) || (com>user && !(user==1 && com==3))) {
			result = "컴퓨터가 이겼습니다";
		}
		System.out.println("결과: " + result);
	}

}

//클래스는 재사용하기 위해 만듦
//클래스가 많아지면 복잡해지지만 전문성이 올라감

//메소드 : 공간을 나눠주는 파티션
//메소드명은 소문자로 시작(main)

//지역변수 : 메소드 안에서만 쓸 수 있음, 초기에는 쓰레기값이 들어있음 ??절대 호환되지 않음??
//전역변수(instance 변수) : 모든 영역을 커버하는 변수

//return값 : 갈때 돌려주는 값
//자료형 : return값의 종류  //8개에 + String, object -> 총 10개
//void : return값이 없음

//매개변수(인수) : 메소드에 들어가기 위해 필요한 것 
//접근지정자 : public(직원, 외부사람 모두 출입 가능)
//private : Staff Only

//Com ob = new Com(); -> 문을 통해서 Com으로 넘어감  예) sc.nextInt();
//Com ob2 = new Com();



