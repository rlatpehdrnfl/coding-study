package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {

	public static void main(String[] args) throws IOException{
		//1. ������ �Է¹޾Ƽ� ¦��, Ȧ���� �����ؼ� ���
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su=0;
		String str;
				
		System.out.println("������ �Է��ϼ���");
		su = Integer.parseInt(br.readLine());
				
		if(su%2==0); {
		str = "¦���Դϴ�";
		}
		if(su%2!=0); {
		str = "Ȧ���Դϴ�";
		}
		
		System.out.println(su + ":" + str);
		
		
		
		

	}

}
