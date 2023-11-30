package com.day2;

public class Test3 {

	public static void main(String[] args) {
		
		int r = 10;
		float area,length;
		
		area = r*r*3.14f; //double로 인식하기 때문에 f로 float이라고 표시해줘야 한다
		length = r*2*3.14f;
		
		System.out.println("반지름:" + r + ", 넓이:" + area);
		
		System.out.printf("반지름:%d, 둘레:%.2f",r,length); // printf에서만 자를 수 있음(.2f/ 오로지 float에서만 가능)
		
	}

}
