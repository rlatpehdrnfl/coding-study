package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su,sum;  //su, sum���� �����Ⱚ
		char ch;
		
		while(true) {
			
			do {
				System.out.print("���ϴ� ��?[1~500]?"); //100e(10,13) //e100
				su = Integer.parseInt(br.readLine()); 	//e�� ���ּ� 100�� ����
				//br.readline()�� ���� �������� ����! e�� �� �о null. �̰� ���ڷ� �ٲٷ��ؼ� ������ ��
			}while(su<1||su>500);						//do while���� ������ ���϶��� �ڿ� (�ȵſ�!)���̤�
														//false�� ��������
		
			//�ʱ�ȭ�� �����۾��� ���ֱ� ���� �ϴ°� ����
			sum=0;
			for(int i=1;i<=su;i++) {
				sum = sum + i;
			}
			
			System.out.println("1~" + su + "������ ��: " + sum);
			
			
			System.out.print("����ҷ�[Y/N]?");//y,Y,n,N -> y,Y�϶��� �ݺ� �������϶��� ����
												 //y,e����(10,13)
			ch = (char)System.in.read();		 //e�� ���� �� ���� (BufferedReader�� ���� �� ����)
			
			if(ch!='y'&&ch!='Y') { ////�ϱ� : ������ �����̸� or�� �ƴ϶� and
				break;
			}
			
			System.in.skip(2); //e(10,13)�� ����� ����
			//�̷� ������ System.in.read()�� �� ������ ����
			
		}//end..while(true)
		
		
	}

}
