package com.day2;

public class Test3 {

	public static void main(String[] args) {
		
		int r = 10;
		float area,length;
		
		area = r*r*3.14f; //double�� �ν��ϱ� ������ f�� float�̶�� ǥ������� �Ѵ�
		length = r*2*3.14f;
		
		System.out.println("������:" + r + ", ����:" + area);
		
		System.out.printf("������:%d, �ѷ�:%.2f",r,length); // printf������ �ڸ� �� ����(.2f/ ������ float������ ����)
		
	}

}
