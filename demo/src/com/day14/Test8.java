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
		ob = new Test();// new�� heap������ ������ ��ü�� �����ȴ�
		ob.name = "�����";
		ob.age = 28;

		v.add(ob);

		ob = new Test();
		ob.name = "���̴�";
		ob.age = 27;

		v.add(ob);

		for (Test t : v) {
			System.out.println(t.name + ":" + t.age);
		}

	}

}
