package com.day11;

//WrapperŬ����
//�ڷ����� ������ �����ͷ� ����� �� �ְ� ��
//�ڷ���: boolean,byte,char,short,int,long,float,double
//������ �ڷ���: Boolean,Byte,Character,Short,Integer,Long,Float,Double

//���� �ڷ����϶�
//Auto-Boxing : stack -> Heap
//Auto-unboxing : heap -> stack

public class Test5 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);

		num1 = n1;
		n2 = num2;
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);

	}
}
