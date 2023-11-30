package com.day11;

//String�� ���� Ŭ����

//StringBuffer : ����ȭ�� ����(���� ����)
//StringBuilder : ����ȭ�� ���� ����(���� ����)

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

		System.out.println("����ð�: " + (end - start) + "ms");

	}

	public void stringBuilder() {

		System.out.println("StringBuilder...");

		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("A");

		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("����ð�: " + (end - start) + "ms");
	}

	public void stringBuffer() {

		System.out.println("StringBuffer...");

		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("A");

		for (int i = 1; i < 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime();

		System.out.println("����ð�: " + (end - start) + "ms");
	}

	public static void main(String[] args) {

		Test1 ob = new Test1();

		ob.stringTime();
		ob.stringBuffer();
		ob.stringBuilder();
	}
}
