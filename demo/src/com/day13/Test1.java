package com.day13;

class TestA {

	public void print() {
		System.out.println("A 클래스...");
	}

}

class TestB {

	public void print() {
		System.out.println("B 클래스...");
	}

}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		TestA c;

		c = a;
		// b = a; // 클래스는 자료형임. 따라서 가장 큰 자료형인 Object에 들어갈 수 있음
		// b = (TestB)a; 안됨. 왜? 상속관계가 아니기 때문
		// 형변환은 2가지 종류밖에 없음. 자료형과 부모-자식관계가 성립된 상속관계에서만 가능
		// 사용하고 싶으면 객체를 생성하는 방법밖에 없음
	}

}
