
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
	// final은 상수 반드시 초기화해줘야함

	public Circle(int r) {
		super("원");
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

	// 메소드 오버라이드(Override)
	// 상속관계에서 부모의 메소드와 비슷한 작업을 하는 메소드의 이름과 동일하게 만들고 내용만 다르게 만들어 준다
	@Override
	public void write() {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("면적: " + area);
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
		ob2.write(); // 5.부모와 내가 같은 객체를 가지고 있으면 내꺼쓴다

	}

}
//자바에서 가장 큰 자료형은 오브젝트(단군)