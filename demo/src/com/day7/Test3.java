
package com.day7;

class SubClass{ //class�� ������̱� ������ class�� ���� �� ����
// main�� ������ �ٸ� Ŭ������ public�� ���� �ȵ�
	
	int a,b;

}

public class Test3 {

	public static void main(String[] args) {

		//�ϳ��� ���Ͽ� Ŭ������ ������ ���� �� ����
		
		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);

		ob1.a = 10;
		ob1.b = 20;
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
		
		System.out.println("ob2.a: " + ob2.a);	
		System.out.println("ob2.b: " + ob2.b);
		
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("ob2.a: " + ob2.a);	//��ü�� �ι� �����ϸ� ��������� ���� ����
		System.out.println("ob2.b: " + ob2.b);
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
	}

}
//Com ob = new Com();
//Stack ���� : ���� ���� �͵� / Com ob
//Heap ���� : ŭ������ �͵� / new Com ob();
// �޸� ������ Heap������ �� ŭ
//���� Ŭ������ ������ �����Ҷ� ������ �ִ� �޼ҵ�� heap���� �� �޼ҵ� ������ ����
//�޼ҵ�� ���ʸ����� �Ȱ��� �۾� ������ 1���� ����� �������� ���