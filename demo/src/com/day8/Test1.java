package com.day8;

import java.util.Scanner;

class Jumsu {

	String name;
	int kor,eng,mat;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름? 국어 영어 수학?");
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
			pan = "수";break;

		case 8 :
			pan = "우"; break;

		case 7:
			pan = "미";break;

		case 6 :
			pan = "양"; break;

		default:
			pan = "가";

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

//메서드에서 메서드를 호출할 수 있다





