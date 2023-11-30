package com.day11;

public class Test2 {

	public static void main(String[] args) {

		// StringBuffer

		StringBuffer sb = new StringBuffer();
		// append : 문자열 누적!
		sb.append("서울");
		sb.append("부산");

		System.out.println(sb);

		String str = sb.toString();
		System.out.println(sb);

		// Integer : wrapper class/int안에 들어가있는 것을 바꾸기 위해서//메소드는 클래스만 가지고 있음
		// int와 똑같음
		int a = 24;
		System.out.println(a);
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(a, 2));
		System.out.println(Integer.toString(a, 16));

	}

}
