package com.day9;

//static
//객체를 1000번 생성해도 메모리 공간은 한번만 생성한다
//객체를 생성하지 않아도 메모리에 올라간다

public class Test2 {
	
	public static int a = 10;
	//클래스 변수, 또는 클래스 메소드는 클래스가 로딩(ctrl + f11)되는 순간 메모리 할당이 이루어지며 
	//접근 방법은  [클래스이름.객체이름]으로 접근 가능하다
	//즉 new를 통해 메모리 할당을 받지 않아도 사용이 가능하다
	
	private int b = 20; 
	//instance 변수는 new를 통해서 객체를 생성한 후
	//접근이 가능하고 동일한 클래스의 메소드에서 접근이 가능하지만 
	//클래스 메소드에서는 접근이 불가능하다
	
	public void write() {//instance 메소드
		System.out.println("class변수: " + a);
		System.out.println("instance 변수: " + b);
	}
	
	public static void print( ) {//class 메소드
		System.out.println("class변수: " + a);
		//System.out.println("instance 변수: " + b);//instance변수는 출력이 안됨
	}

	public static void main(String[] args) {
		
		System.out.println("class변수: " + a);//10
		//System.out.println("instance변수: " + b);
		System.out.println("class변수: " + Test2.a);//10 -> 이렇게 쓰는게 정석!
		
		//write();
		print();
		
		Test2.print();
		
		Test2 ob = new Test2(); //new를 만남으로써 다 메모리 상으로 올라감
		
		System.out.println("instance변수: " + ob.b);
		System.out.println("class 변수: " + a);
		ob.write();
		
		ob.print();
		
		//시작 버튼을 누른다는 것은 Test2.class가 실행되는 것(객체 생성은 new) 그래서 클래스 시작은 로딩임
		
		//static 특징 : 메모리 공간에 자동으로 올라간다(instance변수는 new를 만나야만 올라갈 수 있음)
		
		System.out.println("--------------------");
		
		Test2 ob1 = new Test2();
		ob1.a = 100;
		ob1.b = 200;
		
		ob.write();
		ob1.write();
		
		System.out.println("--------------------");

		
		Test2 ob2 = new Test2();

		ob.write();
		ob1.write();
		ob2.write();
	}

}
