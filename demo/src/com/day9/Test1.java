package com.day9;

//this : Class 이름의 대명사, Me
class Circle {

	private int r;

	// 여기있는 r은 set data의 인수의 변수
	public void setData(int r) {// setData(Circle this,int r) //Circle의 변수가 this
		this.r = r;
	}

	public double area() {// area(Circle this)

		return r * r * 3.14;

	}

	public void write(double a) { // write(Circle this,double a)
		System.out.println("반지름: " + r);
		System.out.println("넓이: " + a);
	}
}

public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();

		ob.setData(100); // setData(10,100);
		double result = ob.area(); // area(10)
		ob.write(result); // write(10,result)

		ob.setData(20);
		result = ob.area();
		ob.write(result);

	}

}
