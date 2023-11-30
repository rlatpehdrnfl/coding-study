package com.day10;

//���(�θ�->�ڽ�)
/*1.�θ𲨴� �ڽĲ�
 *2.private�� ������ ���� �θ�
 *3.protected�� ������ ���� ����� ����(�ڽ��� ��� ����)
 *4.!!����(�ڽ�)�� ������
 *5.�θ�� ���� ���� ��ü�� ������ ������ ��������
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

class RectA extends SuperA {//SuperA�� �θ� RectA�� �ڽ�
	
	private int w,h;
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w * h;
		set("�簢��", a); //1.�θ𲨴� �ڽĲ���
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		RectA r = new RectA(10, 20);
		
		r.rectArea();
		
		r.print();//1.�θ𲨴� �ڽĲ���
		
	}

}
