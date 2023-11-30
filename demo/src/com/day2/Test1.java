package com.day2;

//한줄 주석
		/*
		 * 여러줄 주석
		 */

// 접근지정자 : public
// 클래스이름 : Test1
// 첫문자는 영문 대문자, 예시(CustomInfo)
public class Test1 {

	//Method 명령어를 만드는 것
	//Void : 리턴값 없어
	//main : 메소드명, 기본 메소드
	// main은 출입문과 같다. 건물을 들어가게 해줌.
	//첫문자는 영문 소문자! 예시(customInfo) 
	//String[] args : 매개변수, 인수, 인자 // 헤헹-> 인수
	public static void main(String[] args) {
		
		System.out.print("헤헹"); // print는 반드시 인수가 필요!
		System.out.println();	// 인수가 없으면 엔터만 
		//System.out.print(); // 컴파일 오류(밑에 빨간줄) -> 반드시 고쳐줘야 하는 에러
							  // 실행시 오류발생은 런타임 오류
		System.out.println("헤헹");
		
		
	}

}
