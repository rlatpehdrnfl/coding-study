package com.day12;

//추상 클래스
//메모리의 낭비없이 클래스를 미리 설계(정의)
//메소드를 재정의해서 사용한다
//추상 클래스 안에는 반드시 한개 이상의 추상 메소드가 있어야 한다

abstract class ShapeClass {

	abstract void draw();

}

class Circ extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("원을 그린다...");

	}// 메서드 무조건오버라이드 해야해

}

class Rect extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}

}

class Tri extends ShapeClass {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");

	}
}

public class Test4 {

	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tri t = new Tri();

		c.draw();
		r.draw();
		t.draw();

	}

}
