package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
		
		System.out.print("첫번째 수?");//10
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수?");//30
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d+%d=%d\t",num1,num2,num1+num2);
		// \t는 오른쪽으로 탭 하나 주는 것
		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		System.out.printf("%d*%d=%d\t",num1,num2,num1*num2);
		System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		System.out.printf("%d%%%d=%d\n",num1,num2,num1%num2); // % 나머지를 구하는 연산자, / 몫을 구하는 연산자
		// printf 사용중이기 때문에 %를 %%라고 적어야 나머지를 구할 수 있다. 
		
		System.out.println("num1>num2: " + (num1>num2));
		// 문자 옆에 +는 붙여쓰기! 
		// !!!!숫자를 부등호로 비교하면 숫자가 아니라 True/False(Boolean)가 나온다!!!!!!!!!!!!!!(후에 if문에 많이 사용됨)
		
		
		
		
		
	}

}
