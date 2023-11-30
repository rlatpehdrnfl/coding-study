
package com.day10;

class SuperClass {

	private String title;
	protected double area;

	public SuperClass() {
	}

	public SuperClass(String title) {
		this.title = title;
	}

	public void write() {
		System.out.println(title + ":" + area);
	}
}

class Circle extends SuperClass {

	private int r;
	protected static final double PI = 3.14;
	// final�� ��� �ݵ�� �ʱ�ȭ�������

	public Circle(int r) {
		super("��");
		this.r = r;
	}

	public void circleArea() {
		area = r * r * PI;
	}

}

class Rectt extends SuperClass {

	private int w, h;

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;

		area = w * h;
	}

	// �޼ҵ� �������̵�(Override)
	// ��Ӱ��迡�� �θ��� �޼ҵ�� ����� �۾��� �ϴ� �޼ҵ��� �̸��� �����ϰ� ����� ���븸 �ٸ��� ����� �ش�
	@Override
	public void write() {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + area);
	}

}

public class Test5 {

	public static void main(String[] args) {

		Circle ob1 = new Circle(10);

		ob1.circleArea();
		ob1.write();

		Rectt ob2 = new Rectt();
		ob2.rectArea(10, 20);
		// ob2.write();
		ob2.write(); // 5.�θ�� ���� ���� ��ü�� ������ ������ ��������

	}

}
//�ڹٿ��� ���� ū �ڷ����� ������Ʈ(�ܱ�)