package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		//System.out.print("�̸� ���� ���� ����");//���� 50 70 60

		System.out.print("�̸�,����,����,����");//����,50,70,60
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		// ����ȭ ǥ���� \\s : ���� �� ĭ -> ��ǥ ������ ������ ������ �ȵȴ�...
		//-> , �� ���� ������ ����� ��!
		
		
				
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		//null�� ������ �ٲ� �� ����
		
		
		System.out.println(name + ":" + (kor+eng+mat) + "��");
		
		
		
		
		

	}

}
