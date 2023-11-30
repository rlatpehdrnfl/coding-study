package com.day12;

//final : �������
//instance ������ final�� ���̸� : �ѹ��� �ʱ�ȭ ����
//Method�� final�� ���̸� "Override"�� �Ұ�
//Class�� final�� ���̸� ����� �Ұ��ϴ�

class TestB {

	public static final double PI;

	static {
		PI = 3.14;
	}

	// PI// = 3.1415;

	public double area;

	public void write(String title) {
		System.out.println(title + ":" + area);
	}

	public void circleArea(int r) {
		area = r * r * PI;
	}
}

public class Test3 extends TestB {

	// @Override
	// public void write(String title){
	// System.out.println("��ȣ~~~");
	// }

	public static void main(String[] args) {

		Test3 ob = new Test3();
		ob.circleArea(10);
		ob.write("��");

	}
}
