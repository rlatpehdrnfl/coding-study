
package com.day10;

//Object
//�ڹٿ��� �̹� ��������ִ� Ŭ������ ���� ���� Ŭ����
//!!�׸��� ������ ���� Ŭ������ �θ�
//Object�� �ڹٿ��� ���� ū �ڷ����̴�

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

		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false : �ּҰ� ���İ� ��� ��!(����Ǵ� ��ġ�� �ٸ�)
		System.out.println("ob1.equasl(ob2): " + ob1.equals(ob2));// false

		// HashCode
		System.out.println("ob1: " + ob1);// ����� �Ȱ��� ����
		System.out.println("ob1.toString(): " + ob1.toString());

		System.out.println("ob2: " + ob2);

	}

}
//�ڹٿ����� �̹� ��������ִ� Ŭ���� �Ӹ� �ƴ϶� ���� ���� Ŭ������ �θ�� ������ object�� ��ӹ���