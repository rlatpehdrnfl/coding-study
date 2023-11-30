package com.day11;

//String�� ���־��� �޼ҵ�
public class Test3 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String ss[] = s1.split(",");

		for (String s : ss)
			System.out.print(s + " ");
		System.out.println();

		String s2 = "seoul";
		String s3 = "Seoul";

		System.out.println(s2.equals(s3));// false
		// string�� ������ .equals�� ��
		System.out.println(s2.equalsIgnoreCase(s3));// true

		//// index : 01234567890
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf("."));// 3 �տ������� ���� ��ġ
		System.out.println(s4.lastIndexOf("."));// 7 �ڿ������� ���� ��ġ
		System.out.println(s4.indexOf("def"));// 4 ��ġ�Ǵ� ���ڿ��� �ε��� ù ��°�� �������ش�
		System.out.println(s4.indexOf("x"));// -1

		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");
		System.out.println(s6);

		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll("\\s", "")); // \\s:���� -> �߰��� �ִ� ���鵵 ������
		System.out.println(s7.replaceAll(" ", "")); // -> �߰��� �ִ� ���鵵 ������

		// index : 0123456
		char ch = "abcdefg".charAt(2);
		System.out.println(ch); // c

		System.out.println("abcdefg".startsWith("abc")); // abc�� �����ϴ��� > true

		System.out.println("abcdefg".length()); // 7

		// ������ �迭(ASCII������ ��)
		String s8 = "abcdefg";
		String s9 = "abcdbfg";

		System.out.println(s8.compareTo(s9)); // ���ڿ��� ���� �� ����ϴ� �޼ҵ�
		System.out.println(s9.compareTo(s8));

	}

}
