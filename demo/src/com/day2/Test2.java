package com.day2;

public class Test2 {

	public static void main(String[] args) {

		// 자바의 공식적인 자료형은 8개(+2 String, object)
		//변수 : 반드시 이름이 있어야 함, 첫글자 소문자로
		int a; //숫자(정수만, -21억~21억)저장, 4byte
		int b;
		a = 10; // 변수초기화 : 변수에 최초로 값이 저장될 때 변수가 생성되는 것
				// 이때 사용된 값을 초기값이라고 한다.
		b = 3;
		
		//=는 오른쪽에 있는 걸 왼쪽으로 넣음
		
		
		int c,d;
		
		c = a + b;
		d = a / b;  // 몫을 구하는 것 : / 
		
		System.out.println(a);
		//System.out.println(b); // 쓰레기 값은 찍을 수 없음
		//초기화 : 변수 선언 후 값을 넣는 작업
		System.out.println(c);
		
		System.out.println(a + "+" + b + "=" + c );
		System.out.println(a + "/" + b + "=" + d );
		
		// printf 형식대로 출력하는 것
		System.out.printf("%d + %d = %d%n",a,b,c); // %d,%n : printf에서만 사용 , %n = \n : 엔터

		System.out.printf("%d - %d = %d",a,b,(a-b));
	}
}
