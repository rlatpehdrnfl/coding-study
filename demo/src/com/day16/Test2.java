package com.day16;

//Collection은 기본 데이터 타입이 object
//Collection의 구조가 어떻게 만들어져있는지

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

		b1.set("서울");// String 값 입력

		str = (String) b1.get();

		System.out.println(str);

		b1.set(10);// Integer 값 입력
		it = (Integer) b1.get();

		Box<String> b2 = new Box<String>();
		b2.set("부산");
		str = b2.get();
		System.out.println(str);

		// b2.set(10);

		Box<Integer> b3 = new Box<Integer>();
		b3.set(30);
		it = b3.get();
		System.out.println(it);

		// b3.set("대구");

	}

}
