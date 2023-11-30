package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException { //에러처리 br.readLine, System.in.read()
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째 수?"); //50
		num1 = sc.nextInt();
		
		System.out.print("두번재 수?"); //50
		num2 = sc.nextInt();
				
		System.out.print("연산자[+,-,*,/]");//+
		oper = (char)System.in.read();
		
		switch(oper) {
		

		case '+':
			System.out.printf("%d&c%d=%d\t",num1,oper,num2,(num1+num2));break; //캐릭터의 값을 받는 것은 %c
		case'-':
			System.out.printf("%d-%d=%d\n",num1,num2,(num1-num2));break;
		case '*':
			System.out.printf("%d*%d=%d\t",num1,num2,(num1*num2));break;
		case'/':
			System.out.printf("%d/%d=%d\n",num1,num2,(num1/num2));break;
		
			
		}
		

	}

}
