package com.day3;

import java.util.Scanner;

//Scanner : �ܶ������� ����( , ��)�� ����� ����
// �⺻���� : ����

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner �� BufferedReader�� ���ǰ
		
		String name;
		int kor;
		
		System.out.print("�̸�?"); //����
		name = sc.next();
				// next�� ��ȯ���� String
				// �о�� �Լ��� next()
		
		System.out.print("����?"); //100
		kor = sc.nextInt();
		
		String pan="";
		
		// else if ������ �������̰� �۾��� �������� ��
		
		if(kor>=90) {
			pan = "��";
		}else if(kor>=80) {
			pan = "��";
		}else if(kor>=70) {
			pan = "��";
		}else if(kor>=60) {
			pan = "��";
		}else {
			pan = "��";
		}
		//else�� ó���ϱ� ������ pan�� �ʱ�ȭ���� �ʾƵ� �������� �� ����
		//���� �� ū ����-�������� �������
		//������ ������ ������ �ؿ� �ִ� ���� ���~
		//else�� �ֱ� ������ �ʱ�ȭ���� �ʾƵ� �������� �� ����(��ġ�� ������ �ʱ�ȭ�س�����)
		
		System.out.println(name + ":" + pan);
		

	}

}
