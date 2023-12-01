package com.day12;

class Test {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("Super Class write()...");
		System.out.println("a : " + a + " , b : " + b);

	}
//super는 클래스 안에서만 사용 가능(super : 부모 생성자 호출)
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
		write();// 내거
	}

	public void print2() {
		System.out.println("Sub Class print2()...");
		super.write();// 부모꺼
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

		((Test) ob).write();// 자식 write()

	}
//!!!메서드만큼은 부모와 자식이 같은걸 가지고 있으면 자기걸 쓴다!!!\\
}

/*
 * int a; double b;
 * 
 * 
 * 
 * 
 * a=10; b=a; ---들어간다 -> 암시적형변환 b = (double)a ---들어간다 -> 강제형변환
 * 
 * a=b; ---안들어감 a = (int)b --들어감
 * 
 * --------------------------------------- Demo a;//자식 Test b;//부모
 * 
 * Test(부모) = Demo(자식) ----들어간다 -> UPCAST Test(부모) = (Test)Demo(자식) ----들어간다
 * //클래스는 자료형(명확하게 하기 위해서 형변환을 함)
 *
 * Demo(자식) = Test(부모) --- 안들어감 Demo(자식) = (Demo)Test(부모) ---들어감 ->DOWNCAST
 */
