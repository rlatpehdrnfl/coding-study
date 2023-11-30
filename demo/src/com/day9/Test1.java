package com.day9;

//this : Class �̸��� ����, Me
class Circle {

	private int r;

	// �����ִ� r�� set data�� �μ��� ����
	public void setData(int r) {// setData(Circle this,int r) //Circle�� ������ this
		this.r = r;
	}

	public double area() {// area(Circle this)

		return r * r * 3.14;

	}

	public void write(double a) { // write(Circle this,double a)
		System.out.println("������: " + r);
		System.out.println("����: " + a);
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
