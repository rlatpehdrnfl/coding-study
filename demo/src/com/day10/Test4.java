package com.day10;

//super() : 부모 생성자를 호출(기본생략)
class SuperC {

	private String title;
	protected int area;

	// public SuperC() {}

	public SuperC(String title) {// 오버로딩
		this.title = title;
	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class RectC extends SuperC {

	private int w, h;

	public RectC(int w, int h) {
		super("사각형"); // 자식이 먼저 만들어지면 안된다.

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
