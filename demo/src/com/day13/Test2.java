package com.day13;

class SuperTest {

	public int a = 10, b = 20;

	public void write() {
		System.out.println("�θ�Ŭ���� write()...");
	}

	public int hap() {
		return a + b; // 30

	}
}

class SubTest extends SuperTest {

	public int b = 100, c = 200;

	public void print() {
		System.out.println("�ڽ�Ŭ���� print()...");
	}

	@Override
	public int hap() {
		return a + b + c;// 310
	}

}

public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();

		System.out.println(ob1.b);// 100

		// ob1.b

		SuperTest ob2 = (SuperTest) ob1; // upcast(��Ӱ��迡���� ����) - �Ͻ��� ����ȯ

		System.out.println(ob2.b);// 20

		System.out.println("��: " + ob2.hap());// �������̵带 �ߴٴ� ���� ���� �ܺΰ�(�θ��)�� ���� �ʰڴٴ� �ǵ�...
		ob2.write();// �θ� / �ڽ��� write�� ���� ������ �θ���� ���

		// �޼���� ������ �ڱ� �ڽŰ��� ����

		// ob2.print();// �ڽİŶ� �θ� �ڽİŸ� ����� �� ����

		((SubTest) ob2).print();// downcast

	}

}
