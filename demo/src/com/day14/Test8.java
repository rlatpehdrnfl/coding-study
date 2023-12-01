package com.day14;

import java.util.Vector;

class Test {

	String name;
	int age;

}

public class Test8 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<Test>();

		Test ob;
		ob = new Test();// new는 heap영역에 무조건 객체가 생성된다
		ob.name = "배수지";
		ob.age = 28;

		v.add(ob);

		ob = new Test();
		ob.name = "이이담";
		ob.age = 27;

		v.add(ob);

		for (Test t : v) {
			System.out.println(t.name + ":" + t.age);
		}

	}

}
