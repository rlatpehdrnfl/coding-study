package com.day20;

// Class Ŭ����
// Ư�� Ŭ������ �������̽��� ������ �˻��Ҷ� ����ϴ� Ŭ����

class Test {

	public void write() {
		System.out.println("�׽�Ʈ...");
	}
}

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("com.day20.Test");

		Object o = c.newInstance();// test��� Ŭ������ ��ü �����ϴ� ��.

		Test t = (Test) o;

		t.write();

	}

}
