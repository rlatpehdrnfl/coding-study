package com.day7;

import java.util.Scanner;

class Hap{

	int su, sum; //�żҵ� �ٱ� Ŭ���� �ȿ� ���� �ν��Ͻ� �����̱� ������ 0�� �� ����

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ϳ��Է�?");//100
		su = sc.nextInt();

	}

	public int cnt( ) {

		for(int i=1;i<=su;i++) {
			sum+=i; // sum = sum + i
		}
		return sum;

	}

	public void print(int i) {
		System.out.println("�հ�: " + i);
	}

}

public class Test4 {

	public static void main(String[] args) {

		Hap ob = new Hap();
		
		ob.input();
		int sum = ob.cnt();
		ob.print(sum);

	}

}
//main�� �ִ� ������ public�� �־�� �Ѵ�