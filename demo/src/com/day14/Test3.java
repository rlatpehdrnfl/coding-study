package com.day14;
//공부 ㄴㄴ

//내부 클래스 3(중첩, static)

//클래스 안에 클래스(static)가 들어감

class Outer3 {
	static int a = 10;
	int b = 20;

	public static class Inner3 {

		int c = 30;

		public void write() {
			System.out.println(a);
			// System.out.println(b);
			System.out.println(c);

			Outer3 out = new Outer3();
			System.out.println(out.b);

		}
	}

	public void print() {
		System.out.println("Outer3 print()...");
	}

}

public class Test3 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.print();

		Outer3.Inner3 in = new Outer3.Inner3();
		in.write();
	}

}
