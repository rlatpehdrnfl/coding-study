package com.day7;

public class Test2 {

	public static void main(String[] args) {
		
		Com ob = new Com();
		
		ob.input();
		int area = ob.area();
		int length = ob.length();

		ob.print(area, length);
		
		ob.input();


		length = ob.length();
		ob.print(area, length);
		
		
		
	}

}
