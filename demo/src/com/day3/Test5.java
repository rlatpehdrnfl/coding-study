package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {


		//���
		//if,for,while,do-while,switch

		/*
	 	if(����){ 
		�۾�
		}
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int num = 0;
		String str = "";
		//Ŭ������ �ʱⰪ�� null

		System.out.print("���Է�?"); //123
		num = Integer.parseInt(br.readLine());
		
		/*
		//���� if��
		if(num%2==0) {
			str = "¦��";
		}

		if(num%2!=0) {
			str = "Ȧ��";
		}
		
		//���� ���� ��� ����
		
		System.out.println(num + ":" + str);

		*/
		
		
		//if~else��
		if(num%2==0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		//������ �ɸ��� �ؿ� �ִ� ���� �������� �ʴ´�
		//���� ���� if������ �ӵ��� ������
		//���� �ϳ��� �����ϴ� �۾��� 2���� �� -> else�� �� ���� ��� ����
		
		
		System.out.println(num + ":" + str);

	}
}



