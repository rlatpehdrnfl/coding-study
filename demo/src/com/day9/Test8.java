package com.day9;

import java.util.Calendar;

//Call By Value
//stack ������ �����Ͱ� heap �������� �Ѿ
//Call By reference
//heap ������ �����ʹ� stack �������� �Ѿ �� ���´�� �ּҸ� �ְ�޴´�

class Test{
	
	public int x = 10;
	
	public void sub(int a) {
		x += a; // x = x + a
	}
	
}
public class Test8 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value
		int a = 20;
		
		System.out.println("sub()�޼ҵ� ���� �� x: " + ob.x);//10
		ob.sub(a);
		System.out.println("sub()�޼ҵ� ���� �� x: " + ob.x);//30

		//Call By Reference
		Test ob1;
		ob1 = ob;
		
		System.out.println(ob.x);
		System.out.println(ob1.x);
		
		//Calendar c1 = new Calendar();

		Calendar c1 = Calendar.getInstance();//11-24
		Calendar c2 = Calendar.getInstance();//11-24
		Calendar c3 = Calendar.getInstance();//11-24
		Calendar c4 = Calendar.getInstance();//11-24
		Calendar c5 = Calendar.getInstance();//11-24

		
		
		
	}

}







