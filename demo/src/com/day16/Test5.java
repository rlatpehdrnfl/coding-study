package com.day16;

class MyException extends Exception {

	private static final long serialVersionUID = 1L;// 없어도 그만

	public MyException(String msg) {

		super(msg);// 부모의 오버로딩된 생성자를 찾아감
	}

}

public class Test5 {

	private int value;

	public void setValue(int value) throws MyException {

		if (value < 0) {
			throw new MyException("0보다 작으면 안된다...");
		} else {
			this.value = value;
		}
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Test5 ob = new Test5();

		try {

			ob.setValue(10);

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println(ob.getValue());

	}

}
