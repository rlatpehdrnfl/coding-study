package com.day9;

import java.util.Scanner;

//������
//�޸𸮸� �Ҵ� ������ ���
//�����ڴ� Ŭ������ �̸��� ����!!
//���ϰ��� ���� ������ property(��ȯ��void, int...)�� ����!!
//property�� �޼ҵ常 ������ �ִ�
//�ߺ����ǰ� �����ϴ�
//��ü����,!!���� �ʱ�ȭ!!
//������ �ȿ��� ������ ȣ���� �����ϴ�
//�� ���� ���ο����� �����ϴ�


public class Test5 {

	private int x;
	
	public void set(int x) {
		this.x = x;
	}
	
	public Test5() {
		
		//this(200); //this�� Ŭ���� �̸�
		System.out.println("�⺻ ������");
		
	}
	//������ �޸� �Ҵ�, ���� �ʱ�ȭ �� �� ���
	
	
	public Test5(int x) {
		this(); // �����ڿ��� �����ڸ� ȣ���� ���� ������ �� ����
		System.out.println("�����ε��� ������...");
		this.x = x;
		System.out.println("x: " + this.x);
	}
	
	public void print() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Test5 ob1 = new Test5();
		ob1.set(10);
		ob1.print();

		Test5 ob2 = new Test5(100);
		ob2.print();
		
		
		//Scanner sc = new Scanner();
		
				
	}

}
