package com.day2;

public class Test2 {

	public static void main(String[] args) {

		// �ڹ��� �������� �ڷ����� 8��(+2 String, object)
		//���� : �ݵ�� �̸��� �־�� ��, ù���� �ҹ��ڷ�
		int a; //����(������, -21��~21��)����, 4byte
		int b;
		a = 10; // �����ʱ�ȭ : ������ ���ʷ� ���� ����� �� ������ �����Ǵ� ��
				// �̶� ���� ���� �ʱⰪ�̶�� �Ѵ�.
		b = 3;
		
		//=�� �����ʿ� �ִ� �� �������� ����
		
		
		int c,d;
		
		c = a + b;
		d = a / b;  // ���� ���ϴ� �� : / 
		
		System.out.println(a);
		//System.out.println(b); // ������ ���� ���� �� ����
		//�ʱ�ȭ : ���� ���� �� ���� �ִ� �۾�
		System.out.println(c);
		
		System.out.println(a + "+" + b + "=" + c );
		System.out.println(a + "/" + b + "=" + d );
		
		// printf ���Ĵ�� ����ϴ� ��
		System.out.printf("%d + %d = %d%n",a,b,c); // %d,%n : printf������ ��� , %n = \n : ����

		System.out.printf("%d - %d = %d",a,b,(a-b));
	}
}
