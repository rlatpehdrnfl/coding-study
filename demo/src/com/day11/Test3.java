package com.day11;

//String의 자주쓰는 메소드
public class Test3 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String ss[] = s1.split(",");

		for (String s : ss)
			System.out.print(s + " ");
		System.out.println();

		String s2 = "seoul";
		String s3 = "Seoul";

		System.out.println(s2.equals(s3));// false
		// string은 무조건 .equals로 비교
		System.out.println(s2.equalsIgnoreCase(s3));// true

		//// index : 01234567890
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf("."));// 3 앞에서부터 점의 위치
		System.out.println(s4.lastIndexOf("."));// 7 뒤에서부터 점의 위치
		System.out.println(s4.indexOf("def"));// 4 일치되는 문자열의 인덱스 첫 번째를 가져다준다
		System.out.println(s4.indexOf("x"));// -1

		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);

		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll("\\s", "")); // \\s:공백 -> 중간에 있는 공백도 지워짐
		System.out.println(s7.replaceAll(" ", "")); // -> 중간에 있는 공백도 지워짐

		// index : 0123456
		char ch = "abcdefg".charAt(2);
		System.out.println(ch); // c

		System.out.println("abcdefg".startsWith("abc")); // abc로 시작하느냐 > true

		System.out.println("abcdefg".length()); // 7

		// 사전식 배열(ASCII값으로 비교)
		String s8 = "abcdefg";
		String s9 = "abcdbfg";

		System.out.println(s8.compareTo(s9)); // 문자열을 비교할 때 사용하는 메소드
		System.out.println(s9.compareTo(s8));

	}

}
