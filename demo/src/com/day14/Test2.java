package com.day14;
//���� ����

//���� Ŭ����2(Local)

//�޼ҵ� �ȿ� Ŭ������ ��

class Outer2 {

	static int a = 10;
	int b = 20;

	public void write() {

		int c = 30;// ��������
		final int D = 40;

		class Local {

			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(D);

			}

		}

		Local ob = new Local();// �޼ҵ� �ȿ� �ִ� Ŭ������ �޼ҵ� �ȿ����� Ŭ������ ������ �� ����
		ob.print();
	}

}

public class Test2 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.write();

	}

}
