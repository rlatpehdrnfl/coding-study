package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
		
		System.out.print("ù��° ��?");//10
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ��?");//30
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d+%d=%d\t",num1,num2,num1+num2);
		// \t�� ���������� �� �ϳ� �ִ� ��
		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		System.out.printf("%d*%d=%d\t",num1,num2,num1*num2);
		System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		System.out.printf("%d%%%d=%d\n",num1,num2,num1%num2); // % �������� ���ϴ� ������, / ���� ���ϴ� ������
		// printf ������̱� ������ %�� %%��� ����� �������� ���� �� �ִ�. 
		
		System.out.println("num1>num2: " + (num1>num2));
		// ���� ���� +�� �ٿ�����! 
		// !!!!���ڸ� �ε�ȣ�� ���ϸ� ���ڰ� �ƴ϶� True/False(Boolean)�� ���´�!!!!!!!!!!!!!!(�Ŀ� if���� ���� ����)
		
		
		
		
		
	}

}
