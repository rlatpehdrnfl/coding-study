package com.day8;

import java.util.Scanner;

class Jumsu {

	String name;
	int kor,eng,mat;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸�? ���� ���� ����?");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

	}

	private String panjung(int score) {

		String pan = "";

		switch (score) {

		case (10):

		case 9:
			pan = "��";break;

		case 8 :
			pan = "��"; break;

		case 7:
			pan = "��";break;

		case 6 :
			pan = "��"; break;

		default:
			pan = "��";

		}
		return pan;
	}
	
	public void print() {
		System.out.printf("%6s %4d(%s) %4d(%s) %4d(%s),%4d,%4d",
				name,kor,panjung(kor),eng,panjung(eng),
				mat,panjung(mat),(kor+eng+mat),(kor+eng+mat)/3);
		
	}
}

public class Test1{

	public static void main(String[] args) {

		Jumsu ob = new Jumsu();

		ob.input();
		ob.print();

	}


}

//�޼��忡�� �޼��带 ȣ���� �� �ִ�





