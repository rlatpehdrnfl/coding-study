package com.day14;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static String[] city = { "����", "�λ�", "�뱸", "��õ", "����", "����", "���" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		// v.add(30);

		for (String str : city) {
			v.add(str);
		}
		String str;
		str = v.firstElement();
		System.out.println(str);

		str = v.lastElement();
		System.out.println(str);

		str = v.get(1);
		System.out.println(str);

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();

		for (String s : v) {// Ȯ�������� �迭���� ����� �� �ִ�
			System.out.println(s + " ");
		}
		System.out.println();

		// �ݺ��� (�������̽��� ����ҷε� ����) - �ܿ���
		Iterator<String> it = v.iterator();

		while (it.hasNext()) {// hasNext : ������ �־�?

			str = it.next();
			System.out.print(str + " ");

		}

		System.out.println("------------------");

		while (it.hasNext()) {

			str = it.next();
			System.out.print(str + " ");

		}
	}

}
