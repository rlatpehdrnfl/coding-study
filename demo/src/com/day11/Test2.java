package com.day11;

public class Test2 {

	public static void main(String[] args) {

		// StringBuffer

		StringBuffer sb = new StringBuffer();
		// append : ���ڿ� ����!
		sb.append("����");
		sb.append("�λ�");

		System.out.println(sb);

		String str = sb.toString();
		System.out.println(sb);

		// Integer : wrapper class/int�ȿ� ���ִ� ���� �ٲٱ� ���ؼ�//�޼ҵ�� Ŭ������ ������ ����
		// int�� �Ȱ���
		int a = 24;
		System.out.println(a);
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(a, 2));
		System.out.println(Integer.toString(a, 16));

	}

}
