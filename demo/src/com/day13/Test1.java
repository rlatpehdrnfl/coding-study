package com.day13;

class TestA {

	public void print() {
		System.out.println("A Ŭ����...");
	}

}

class TestB {

	public void print() {
		System.out.println("B Ŭ����...");
	}

}

public class Test1 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		TestA c;

		c = a;
		// b = a; // Ŭ������ �ڷ�����. ���� ���� ū �ڷ����� Object�� �� �� ����
		// b = (TestB)a; �ȵ�. ��? ��Ӱ��谡 �ƴϱ� ����
		// ����ȯ�� 2���� �����ۿ� ����. �ڷ����� �θ�-�ڽİ��谡 ������ ��Ӱ��迡���� ����
		// ����ϰ� ������ ��ü�� �����ϴ� ����ۿ� ����
	}

}
