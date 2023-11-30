package com.day11;

//String의 보조 클래스

//StringBuffer : 동기화를 지원(조금 느림)
//StringBuilder : 동기화를 지원 안함(조금 빠름)

public class Test1 {

	public void stringTime() {

		System.out.println("String...");

		// long start = System.currentTimeMillis();
		long start = System.nanoTime();

		String str = "A";

		for (int i = 1; i < 50000; i++) {
			str += "A";

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start) + "ms");

	}

	public void stringBuilder() {

		System.out.println("StringBuilder...");

		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");

		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start) + "ms");
	}

	public void stringBuffer() {

		System.out.println("StringBuffer...");

		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");

		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("실행시간: " + (end - start) + "ms");
	}

	public static void main(String[] args) {

		Test1 ob = new Test1();

		ob.stringTime();
		ob.stringBuffer();
		ob.stringBuilder();
	}
}
