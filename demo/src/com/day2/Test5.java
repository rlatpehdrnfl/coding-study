package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		
		///����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		// Ŭ����(String)�� name �ƹ��͵� �ȵ�� ���� (null����)
		int kor, eng, tot;
		// int �ڷ����� �����Ⱚ�� �� ����
		float ave;
		
		/// �Է�
		System.out.print("�̸��� ����?"); //����
		name = br.readLine();
		// readLine() : String���� �ǵ��� ��
		
		
		//System.out.println(name);
		
		System.out.print("����������?"); //60
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("����������?"); //80
		eng = Integer.parseInt(br.readLine());
		
		///����
		tot = kor + eng;
		// ���α׷��� ������ �Ʒ��� ����Ǳ� ������ tot ���� �̸� �����س��ƾ� ��.
		
		ave = tot/2.0f;
		//Java�� �Ǽ��� �����ϸ� double�� �����ϱ� ������ float���� ������ ave�� float�̶�� �˷��ֱ� ���� f��� ����.
		
		///���
		System.out.printf("%s�� ���� ������ %d�̰� ����� %.2f�Դϴ�.",name,tot,ave);
		
	}

}
