package com.day10;

//super() : �θ� �����ڸ� ȣ��(�⺻����)
class SuperC {

	private String title;
	protected int area;

	// public SuperC() {}

	public SuperC(String title) {// �����ε�
		this.title = title;
	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class RectC extends SuperC {

	private int w, h;

	public RectC(int w, int h) {
		super("�簢��"); // �ڽ��� ���� ��������� �ȵȴ�.

		this.w = w;
		this.h = h;
	}

	public void rectArea() {
		area = w * h;
	}

}

public class Test4 {

	public static void main(String[] args) {

		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print();

	}

}
