package com.day3;

public class Test1 {

	public static void main(String[] args) {
		
		float f =0; //0.0  -> �� 0.0�� ������ ����????
		double d =0;
		
		System.out.println(f); //-> ������� Ȯ�� //0.0
		
		
		//for(�ʱⰪ;�ִ밪(���ǰ�);������)
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
