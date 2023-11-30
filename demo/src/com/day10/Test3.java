package com.day10;

//���(�θ�->�ڽ�)
/*1.�θ𲨴� �ڽĲ�
 *2.private�� ������ ���� �θ�
 *3.protected�� ������ ���� ����� ����(�ڽ��� ��� ����)
 *4.!!����(�ڽ�)�� ������
 *5.�θ�� ���� ���� ��ü�� ������ ������ ��������
 */

class SuperB{
	
	private String title;
	protected int area;  //3.protected�� ������ ���� ����� ����(�ڽ��� ��� ����)
	
	public void set(String title) {
		
		this.title = title;
	}
	
	public void print() {
		System.out.println(title + ":" + area);
	}
	
}

class RectB extends SuperB {//SuperA�� �θ� RectA�� �ڽ�
	
	private int w,h;
	
	public RectB(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		area = w * h;
		set("�簢��"); //1.�θ𲨴� �ڽĲ���
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		RectB r = new RectB(10, 20);
		
		r.rectArea();
		//r.area = 500 //3.protected�� ������ ���� ����� ����(�ڽ��� ��� ����)
		r.print();//1.�θ𲨴� �ڽĲ���
		
	}

}
