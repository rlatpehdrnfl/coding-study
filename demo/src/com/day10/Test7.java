package com.day10;

//String

//String은 자료형이 아니다(클래스)
//저장하는 양은 방대하고 사용하는 빈도는 높기 때문에 자료형처럼 사용
//String은 불변의 법칙을 가지고 있다
public class Test7 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");

		System.out.println("ob1 == ob2: " + (ob1 == ob2));// true
		System.out.println("ob1 == ob3: " + (ob1 == ob3));// false : 주소지가 같냐
		System.out.println("ob1.equls(ob3): " + ob1.equals(ob3));// true : 내용물이 같냐(자료형 흉내)//여기는 String의 equals

		ob2 = "korea";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false
		// String은 한번 기록한 것은 고칠수도 없고 삭제도 안됨

		ob2 = "japan";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false

		ob2 = "Seoul";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// true

		System.out.println(ob2);// Seoul
		System.out.println(ob2.toString());// Seoul

		/*
		 * String a = "A"; a = "AA"; a = "AAA";
		 * 
		 * a="AX5000"
		 */
	}

}
