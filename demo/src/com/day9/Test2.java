package com.day9;

//static
//��ü�� 1000�� �����ص� �޸� ������ �ѹ��� �����Ѵ�
//��ü�� �������� �ʾƵ� �޸𸮿� �ö󰣴�

public class Test2 {
	
	public static int a = 10;
	//Ŭ���� ����, �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �ε�(ctrl + f11)�Ǵ� ���� �޸� �Ҵ��� �̷������ 
	//���� �����  [Ŭ�����̸�.��ü�̸�]���� ���� �����ϴ�
	//�� new�� ���� �޸� �Ҵ��� ���� �ʾƵ� ����� �����ϴ�
	
	private int b = 20; 
	//instance ������ new�� ���ؼ� ��ü�� ������ ��
	//������ �����ϰ� ������ Ŭ������ �޼ҵ忡�� ������ ���������� 
	//Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�
	
	public void write() {//instance �޼ҵ�
		System.out.println("class����: " + a);
		System.out.println("instance ����: " + b);
	}
	
	public static void print( ) {//class �޼ҵ�
		System.out.println("class����: " + a);
		//System.out.println("instance ����: " + b);//instance������ ����� �ȵ�
	}

	public static void main(String[] args) {
		
		System.out.println("class����: " + a);//10
		//System.out.println("instance����: " + b);
		System.out.println("class����: " + Test2.a);//10 -> �̷��� ���°� ����!
		
		//write();
		print();
		
		Test2.print();
		
		Test2 ob = new Test2(); //new�� �������ν� �� �޸� ������ �ö�
		
		System.out.println("instance����: " + ob.b);
		System.out.println("class ����: " + a);
		ob.write();
		
		ob.print();
		
		//���� ��ư�� �����ٴ� ���� Test2.class�� ����Ǵ� ��(��ü ������ new) �׷��� Ŭ���� ������ �ε���
		
		//static Ư¡ : �޸� ������ �ڵ����� �ö󰣴�(instance������ new�� �����߸� �ö� �� ����)
		
		System.out.println("--------------------");
		
		Test2 ob1 = new Test2();
		ob1.a = 100;
		ob1.b = 200;
		
		ob.write();
		ob1.write();
		
		System.out.println("--------------------");

		
		Test2 ob2 = new Test2();

		ob.write();
		ob1.write();
		ob2.write();
	}

}
