package com.day10;

//String

//String�� �ڷ����� �ƴϴ�(Ŭ����)
//�����ϴ� ���� ����ϰ� ����ϴ� �󵵴� ���� ������ �ڷ���ó�� ���
//String�� �Һ��� ��Ģ�� ������ �ִ�
public class Test7 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");

		System.out.println("ob1 == ob2: " + (ob1 == ob2));// true
		System.out.println("ob1 == ob3: " + (ob1 == ob3));// false : �ּ����� ����
		System.out.println("ob1.equls(ob3): " + ob1.equals(ob3));// true : ���빰�� ����(�ڷ��� �䳻)//����� String�� equals

		ob2 = "korea";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false
		// String�� �ѹ� ����� ���� ��ĥ���� ���� ������ �ȵ�

		ob2 = "japan";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// false

		ob2 = "Seoul";
		System.out.println("ob1 == ob2: " + (ob1 == ob2));// true

		System.out.println(ob2);// Seoul
		System.out.println(ob2.toString());// Seoul

		/*
		 * String a = "A"; a = "AA"; a = "AAA";
		 * 
		 * a="AX5000"
		 */
	}

}
