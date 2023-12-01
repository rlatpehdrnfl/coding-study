package com.day14;

//내부클래스4(Annoymous, 익명의,무명의 클래스)
//클래스를 리턴값, 또는 매개변수 자리에 만든다
//메모리의 낭비를 줄이기 위해 

public class Test4 {

	public Object getTitle() {

		return new Object() {// 리턴 결과값 자리에 클래스를 만듦

			@Override
			public String toString() {
				return "익명의 클래스";
			}
		};
	}

	public static void main(String[] args) {// 추상클래스와 인터페이스는 구현하거나 상속받으면 무조건 오버라이딩 하라고 빨간줄이 생김

		Test4 ob = new Test4();
		System.out.println(ob.getTitle());

	}

}
