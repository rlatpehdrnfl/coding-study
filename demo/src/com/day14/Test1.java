package com.day14;

//����Ŭ����1(inner class)
//Ŭ���� �ȿ� Ŭ������ ��

class Outer1 {

	static int a = 10; // ����ƽ ����
	int b = 20; // �տ� protected�� �����Ǿ� ���� /�ν��Ͻ�����

	// Outer1�� ��ü�� ������ �ȵǸ� Inner1�� ��ü�������� �ȵ�
	// Outer1�� ��ü�� �����ƴٰ� �ؼ� Inner1�� ��ü�� ������ ���� �ƴϴ�

	// Nested Class
	public class Inner1 {// ��ü �����ϴ� 2���� ����� ����(���� ����/�ۿ��� ����)

		int c = 30;

		public void write() {

			System.out.println(a);// �� ������ �ȳ���?
			System.out.println(b);// ������� ���Ŀ;� ��
			System.out.println(c);
		}

	}

	public void print() {
		Inner1 ob = new Inner1();
		ob.write();

	}

}

public class Test1 {

	public static void main(String[] args) {

		// �ۿ��� ����
		Outer1 out = new Outer1();// �⺻

		out.print();// ù��° ���

		Outer1.Inner1 in = out.new Inner1();// �ι�° ���
		in.write();

	}

}
