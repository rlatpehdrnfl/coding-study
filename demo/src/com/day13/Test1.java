package com.day13;

class TestA {

	public void prin() {
		System.out.println("A 클래스...");
	}

}

class TestB {

	public void prin() {
		System.out.println("B 클래스...");
	}

}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		TestA c;

		c = a;
		// b = a; // 클래스는 자료형임.
		// b = (TestB)a; 안됨
		// 형변환은 2가지 종류밖에 없음. 자료형과 부모-자식관계가 성립된 상속관계에서만 가능
		// 사용하고 싶으면 객체를 생성하는 방법밖에 없음
	}

}
