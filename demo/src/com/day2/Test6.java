package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int width, height;
		double area; //float
		
		System.out.print("width?");
		width = Integer.parseInt(br.readLine());
		
		System.out.print("height?");
		height = Integer.parseInt(br.readLine());
		
		area = (width * height) /2.0; //f�ָ� float���ε� �ν� ������
		
		System.out.printf("area = %g",area);
		
		//�ﰢ���� ������ ���Ͻÿ�
		//�غ�(width) : 10
		//����(height) : 20
		//����(area) : xxx
		//���� = �غ�*����/2
		
		// printf���� ���� ��ȣ
		//%d : int
		//%s : String
		//%f : float
		//%g : double		

	}

}
