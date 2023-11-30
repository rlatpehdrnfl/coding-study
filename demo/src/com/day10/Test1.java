package com.day10;

import java.io.IOException;
import java.util.Scanner;

class Calc {

	private int num1, num2;
	private char oper;

	public boolean input() throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 수 입력?");// 20.30
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("연산자?");
		oper = (char) System.in.read();

		if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
			return false;
		}

		return true;

	}

	public int result() {

		int r = 0;

		switch (oper) {
		case '+':
			r = num1 + num2;
			break;
		case '-':
			r = num1 - num2;
			break;
		case '*':
			r = num1 * num2;
			break;
		case '/':
			r = num1 / num2;
			break;

		}

		return r;

	}

	public void print(int r) {
		System.out.printf("%d  %c %d = %d\n", num1, oper, num2, r);
	}

}

public class Test1 {

	public static void main(String[] args) throws IOException {

		Calc ob = new Calc();

		// boolean boo = ob.input();

		if (!ob.input()) {
			// 연산자 오류
			System.out.println("연산자 오류");
			return;
		}

		// 연산자 잘씀
		int r = ob.result();
		ob.print(r);
	}

}
