package com.day9;

//������,static,�ʱ�ȭ��

public class Test7 {

	int a = 5;//�ν��Ͻ� ��

	{//�ʱ�ȭ �� : new�� ������ �ڵ����� ������ �ǰ� �ѹ� ����Ǹ� �ٽô� �������� ����
		System.out.println("�ʱ�ȭ ��a: " + a);
		a = 10;
		System.out.println("�ʱ�ȭ ��a: " + a);
	}

	static int b;

	static { // static ����� new�� ������ �ʾƵ� �ڵ����� �޸𸮿� �ö�
		b= 10;
		System.out.println("static ��b: " + b);
	}

	final int C;//������� : �빮�ڷ� ��, ����� �׻� ����� �� ������ �ʱ�ȭ�� �ؾ� ��

	public Test7() {
		System.out.println("������...");
		C = 100;
		System.out.println("C: " + C);
	}
	
	
	
	public static void main(String[] args) {

		Test7 ob1 = new Test7();
		
		Test7 ob2 = new Test7();

		
		
		
	}

}
