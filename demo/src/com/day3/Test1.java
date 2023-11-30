package com.day3;

public class Test1 {

	public static void main(String[] args) {
		
		float f =0; //0.0  -> 왜 0.0을 넣으면 에러????
		double d =0;
		
		System.out.println(f); //-> 출력차이 확인 //0.0
		
		
		//for(초기값;최대값(조건값);증가값)
		for(int i =1;i<=100000;i++) {//i=i+1			
			
			f = f + 100000;
			d = d + 100000;
			
			
		}
		
		System.out.println("float: " + (f/100000));
		System.out.println("double: " + (d/100000));

		
		int a = 10;
		float b = a;
		
		a=(int)b; 
		
		System.out.println(b);  //10.0
		
		
 		
		
	}

}
