package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args)  {

		/*5. �ܰ� 15,800¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.

		�������� ������ �����ϴ�.
		10�� �̻� -> 10%
		20�� �̻� -> 15%
		30�� �̻� -> 20%
		�Ǹűݾ��� ����غ��ϴ�.
		��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��


		 */

		Scanner sc = new Scanner(System.in);

		int quantity,price;


		price = 15800;

		System.out.print("������ �Է��ϼ���");
		quantity = sc.nextInt();


		if(quantity<10) {
			price = (price * quantity);
		}
		if(quantity>=10) {			
			price = (price * quantity)/10;
		}if(quantity>=20) {
			price = (price * quantity)/15;
		}if(quantity>=30) 	 {
			price = (price * quantity)/20;
		}
		System.out.print("���� ����: " + quantity + "��, �Ǹ� �� �ݾ�: " + price + "��");







	}








}


