package com.day9;

import java.util.Scanner;

class Rect{

	private int w,h;

	public void set(int w,int h) {
		this.w = w;
		this.h = h;
	}

	public int area() {
		return w*h;
	}

	public int length() {
		return(w+h)*2;
	}

	public void print(int a, int l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}

	//�޼ҵ� �ߺ�����(overloading)
	//�ϳ��� Ŭ���� �ȿ��� �۾��� ����� �޼ҵ��� �̸��� ���Ͻ�Ű�� �۾�
	//�޼ҵ��� �̸��� ���Ͻ�Ű�� �Ű������� ������ �ڷ����� �ٸ��� �ٸ� �޼ҵ�� �ν��Ѵ�

	public void print() {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
	}

	public void print(int a) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
	}

	//�ڷ����� Ʋ���� �ٸ� �޼ҵ�� �νĵǾ� �浹�� �ȳ���
	public void print(double l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("�ѷ�: " + l);
	}
}





public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rect ob = new Rect();

		int w,h;

		System.out.println("����?");
		w = sc.nextInt();

		System.out.println("����?");
		h = sc.nextInt();

		ob.set(w,h);
		int a = ob.area();
		int l = ob.length();
		
		ob.print(a, l);
		ob.print();
		ob.print(a);
		ob.print(l);

		

	}

}
