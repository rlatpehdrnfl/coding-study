package com.day13;

class SuperTest {

	public int a = 10, b = 20;

	public void write() {
		System.out.println("부모클래스 write()...");
	}

	public int hap() {
		return a + b; // 30

	}
}

class SubTest extends SuperTest {

	public int b = 100, c = 200;

	public void print() {
		System.out.println("자식클래스 print()...");
	}

	@Override
	public int hap() {
		return a + b + c;// 310
	}

}

public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();

		System.out.println(ob1.b);// 100

		// ob1.b

		SuperTest ob2 = (SuperTest) ob1; // upcast(상속관계에서만 실행) - 암시적 형변환

		System.out.println(ob2.b);// 20

		System.out.println("합: " + ob2.hap());// 오버라이드를 했다는 것은 절대 외부것(부모것)을 쓰지 않겠다는 의도...
		ob2.write();// 부모 / 자식이 write가 없기 때문에 부모것을 사용

		// 메서드는 무조건 자기 자신것을 쓴다

		// ob2.print();// 자식거라 부모가 자식거를 사용할 수 없다

		((SubTest) ob2).print();// downcast

	}

}
