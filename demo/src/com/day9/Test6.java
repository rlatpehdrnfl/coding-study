package com.day9;

class RectA {
	
	private int w,h;
	
	public RectA() {//기본 생성자
		
	}
	
	public RectA(int w, int h) {//오버로딩된 생성자
		this.w = w;
		this.h = h;
	}
	
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
	
	public void print(int a) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
	}
	//메소드 중복 정의(오버로딩)
	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
	
}



public class Test6 {

	public static void main(String[] args) {
		
		RectA ob1 = new RectA();
		ob1.set(10, 20);
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		ob1.print(a, l);
		
		System.out.println();
		
		RectA ob2 = new RectA(100, 200); //객체를 생성함과 동시에 초기화가 됨(필수조건을 넣어줌으로써 한번에 초기화가 되도록)
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
		
		System.out.println();

		ob2.set(11, 22);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
		
		
	}

}
