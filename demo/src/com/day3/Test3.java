package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String str;


		System.out.print("���� �Է��Ͻÿ�"); //30
		num = Integer.parseInt(br.readLine());


		//���׿�����
		//����?true:false
		str = num%2==0?"¦��":"Ȧ��";
		// = ���Կ����� ==����

		str = num>0?"���":(num<0?"����":"0");
		// str���� ������ ¦���� ����� ����� ���� ������ -> ���������� ��� ���

		if(num>0) {
			str = "���";
		}else if(num<0) {
			str = "����";
		}else {
			str = "��";
		} 

		str = num%4==0 && num%100!=0 || num%400==0 ? "����" : "���";
		//and(&&),or(||) / �׻� and���� ������ ��
		//���� ����� �ϱ�~

		System.out.println(str);






	}

}
