package com.day12;

class Test {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("Super Class write()...");
		System.out.println("a : " + a + " , b : " + b);

	}
//super�� Ŭ���� �ȿ����� ��� ����(super : �θ� ������ ȣ��)
}

class Demo extends Test {

	protected int b = 30, c = 40;

	@Override
	public void write() {
		System.out.println("Sub class write()...");
		System.out.println("a : " + a + " , b : " + b + ", c: " + c);
		System.out.println("super.b: " + super.b);// 20
	}

	public void print1() {
		System.out.println("Sub Class print1()...");
		write();// ����
	}

	public void print2() {
		System.out.println("Sub Class print2()...");
		super.write();// �θ�
	}

}

public class Test1 {

	public static void main(String[] args) {
		Demo ob = new Demo();

		ob.write();
		System.out.println("------------");
		ob.print1();
		System.out.println("------------");
		ob.print2();

		System.out.println("ob.b: " + ob.b);// 30

		// UPCAST
		System.out.println("((Test)ob).b: " + ((Test) ob).b);// 20

		((Test) ob).write();// �ڽ� write()

	}
//!!!�޼��常ŭ�� �θ�� �ڽ��� ������ ������ ������ �ڱ�� ����!!!\\
}

/*
 * int a; double b;
 * 
 * 
 * 
 * 
 * a=10; b=a; ---���� -> �Ͻ�������ȯ b = (double)a ---���� -> ��������ȯ
 * 
 * a=b; ---�ȵ� a = (int)b --��
 * 
 * --------------------------------------- Demo a;//�ڽ� Test b;//�θ�
 * 
 * Test(�θ�) = Demo(�ڽ�) ----���� -> UPCAST Test(�θ�) = (Test)Demo(�ڽ�) ----����
 * //Ŭ������ �ڷ���(��Ȯ�ϰ� �ϱ� ���ؼ� ����ȯ�� ��)
 *
 * Demo(�ڽ�) = Test(�θ�) --- �ȵ� Demo(�ڽ�) = (Demo)Test(�θ�) ---�� ->DOWNCAST
 */
