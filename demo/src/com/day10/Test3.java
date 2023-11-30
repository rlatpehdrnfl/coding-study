package com.day10;

//상속(부모->자식)
/*1.부모꺼는 자식꺼
 *2.private로 선언한 것은 부모꺼
 *3.protected로 선언한 것은 상속이 가능(자식이 사용 가능)
 *4.!!내꺼(자식)는 내꺼다
 *5.부모와 내가 같은 객체를 가지고 있으면 내꺼쓴다
 */

class SuperB{
	
	private String title;
	protected int area;  //3.protected로 선언한 것은 상속이 가능(자식이 사용 가능)
	
	public void set(String title) {
		
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
	
}

class RectB extends SuperB {//SuperA가 부모 RectA가 자식
	
	private int w,h;
	
	public RectB(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		area = w * h;
		set("사각형"); //1.부모꺼는 자식꺼다
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		RectB r = new RectB(10, 20);
		
		r.rectArea();
		//r.area = 500 //3.protected로 선언한 것은 상속이 가능(자식이 사용 가능)
		r.print();//1.부모꺼는 자식꺼다
		
	}

}
