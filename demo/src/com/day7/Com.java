package com.day7;

import java.util.Scanner;

public class Com {

	int w,h;//instance ����, ��������, default�� �ʱ�ȭ�Ǿ� ����
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����?");
		w = sc.nextInt();
		
		System.out.println("����?");
		h = sc.nextInt();
		
		//return;//stop�� �ǹ�, void�� ���� ����ϴ°� ����
		
	}
	
	public int area( ) {
		
		int result;
		
		result = w*h;  //����
		
		return result;
 		
	}
	
	public int length( ) {
		
	return (w+h)*2; //�ѷ�
		
	}
	/*public int length( ) {
		
		int result;
		
		result = (w+h)*2;
		
		return result;
		
	}
*/
	public void print(int area,int length) { //int a : �μ�, �Ű�����
		
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + length);
	}
	
	
	
}
