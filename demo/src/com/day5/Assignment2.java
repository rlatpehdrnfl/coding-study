package com.day5;

public class Assignment2 {

	public static void main(String[] args) {
		//2. 1���� 100������ ���� 3�� ����� ����
		//3�� ����� ���� : 33
		
		/*3�� ����� ��
		int n,sum=0;
		for(n=3;n<=100;n+=3) {
			sum+=n;
		}
		
		System.out.println("���: " + sum);
		*/
		
		
		int count=0;
				
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
		System.out.println(count);
		
		
		
	}

}
