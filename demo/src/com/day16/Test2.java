package com.day16;

//Collection�� �⺻ ������ Ÿ���� object
//Collection�� ������ ��� ��������ִ���

class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}

public class Test2 {

	public static void main(String[] args) {

		String str;
		Integer it;

		Box b1 = new Box();

		b1.set("����");// String �� �Է�

		str = (String) b1.get();

		System.out.println(str);

		b1.set(10);// Integer �� �Է�
		it = (Integer) b1.get();

		Box<String> b2 = new Box<String>();
		b2.set("�λ�");
		str = b2.get();
		System.out.println(str);

		// b2.set(10);

		Box<Integer> b3 = new Box<Integer>();
		b3.set(30);
		it = b3.get();
		System.out.println(it);

		// b3.set("�뱸");

	}

}
