package com.day12;

//�߻� Ŭ����
//�޸��� ������� Ŭ������ �̸� ����(����)
//�޼ҵ带 �������ؼ� ����Ѵ�
//�߻� Ŭ���� �ȿ��� �ݵ�� �Ѱ� �̻��� �߻� �޼ҵ尡 �־�� �Ѵ�

abstract class ShapeClass {

	abstract void draw();

}

class Circ extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("���� �׸���...");

	}// �޼��� �����ǿ������̵� �ؾ���

}

class Rect extends ShapeClass {

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}

}

class Tri extends ShapeClass {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");

	}
}

public class Test4 {

	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tri t = new Tri();

		c.draw();
		r.draw();
		t.draw();

	}

}
