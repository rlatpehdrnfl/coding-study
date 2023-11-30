
package com.day10;

//Object
//자바에서 이미 만들어져있는 클래스와 내가 만든 클래스
//!!그리고 앞으로 만들 클래스의 부모
//Object는 자바에서 가장 큰 자료형이다

class Test {// extends Object

	private int a = 10;

	public void write() {
		System.out.println("a : " + a);
	}

}

public class Tset6 {

	public static void main(String[] args) {

		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false : 주소가 같냐고 물어본 것!(저장되는 위치가 다름)
		System.out.println("ob1.equasl(ob2): " + ob1.equals(ob2));// false

		// HashCode
		System.out.println("ob1: " + ob1);// 결과가 똑같이 나옴
		System.out.println("ob1.toString(): " + ob1.toString());

		System.out.println("ob2: " + ob2);

	}

}
//자바에서는 이미 만들어져있는 클래스 뿐만 아니라 내가 만든 클래스의 부모는 무조건 object를 상속받음