package com.day11;

//Wrapper클래스
//자료형을 참조형 데이터로 사용할 수 있게 함
//자료형: boolean,byte,char,short,int,long,float,double
//참조형 자료형: Boolean,Byte,Character,Short,Integer,Long,Float,Double

//같은 자료형일때
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
