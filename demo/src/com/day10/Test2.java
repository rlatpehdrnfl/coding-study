package com.day10;

//상속(부모->자식)
/*1.부모꺼는 자식꺼
 *2.private로 선언한 것은 부모꺼
 *3.protected로 선언한 것은 상속이 가능(자식이 사용 가능)
 *4.!!내꺼(자식)는 내꺼다
 *5.부모와 내가 같은 객체를 가지고 있으면 내꺼쓴다
 */

class SuperA{
	
	private String title;
	private int area;
	
	public void set(String title,int area) {
		
		this.title = title;
		this.area = area;
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
	
}

class RectA extends SuperA {//SuperA가 부모 RectA가 자식
	
	private int w,h;
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w * h;
		set("사각형", a); //1.부모꺼는 자식꺼다
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		RectA r = new RectA(10, 20);
		
		r.rectArea();
		
		r.print();//1.부모꺼는 자식꺼다
		
	}

}
