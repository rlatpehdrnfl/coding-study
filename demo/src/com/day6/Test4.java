package com.day6;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;

		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length()!=14) {		//�迭 length�� ��ȣ�� ����. ��� �������� ������ ���� length�� ��ȣ�� ����
			System.out.println("�Է¿���");
			return;//stop
		}

		tot = 0;
		//index : 0 1 2 3 4 5 6 7 8 9 0 1 2 3
		//jumin : 9 4 1 0 1 0 - 2 0 8 7 6 5 4 
		//	chk = 2,3,4,5,6,7,  8,9,2,3,4,5	

		for(i=0;i<12;i++) {

			if(i>=6) {//�ֹι�ȣ ���ڸ�
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));


			}else {//�������
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));


			}
		}

		su = 11 - tot % 11;
		su = su % 10;

		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ");			
		}else {
			System.out.println("Ʋ�� �ֹι�ȣ");
		}

	}

	
}



/*
String str = "seoul Korea";
		//index :     01234567890

		System.out.println(str.substring(0, 3)); //������ �ε������� �׻� -1�� ��(seo)
		System.out.println(str.substring(6, 8)); //Ko
		System.out.println(str.substring(6)); //Korea
 */