package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4 {

	public static void main(String[] args) throws IOException {

		//4. �⵵�� �Է¹ް�, �������� �ƴ����� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String str;
		
		System.out.print("���� �Է��Ͻÿ�"); 
		num = Integer.parseInt(br.readLine());

		
		str = num%4==0 && num%100!=0 || num%400==0 ? "����" : "���";
		
		System.out.println(str);

		
		

	}

}
