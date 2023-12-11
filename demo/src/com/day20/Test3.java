package com.day20;

// Class 클래스
// 특정 클래스나 인터페이스의 정보를 검색할때 사용하는 클래스

class Test {

	public void write() {
		System.out.println("테스트...");
	}
}

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("com.day20.Test");

		Object o = c.newInstance();// test라는 클래스의 객체 생성하는 것.

		Test t = (Test) o;

		t.write();

	}

}
