package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// ArrayList : List��� �������̽��� ������ Ŭ����, �����ε� ���� �� �ִ�
public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<String>();

		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");

		ListIterator<String> it = lists.listIterator();
		while (it.hasNext()) {// ������ ������
			System.out.print(it.next() + " ");
		}
		System.out.println("\n--------------");

		while (it.hasPrevious()) {// �����Ͱ� ������ ������� �о� �������ٰ� �������� �о �� ����
			System.out.print(it.previous() + " ");
		}

		System.out.println();

		List<String> lists1 = new ArrayList<String>();

		lists1.addAll(lists);
		lists1.add("��õ");

		int n = lists1.indexOf("�λ�");
		lists1.add(n + 1, "����");

		for (String s : lists1) {

			System.out.print(s + " ");
		}

		System.out.println();

		Iterator<String> it1 = lists1.iterator();
		while (it.hasNext()) {
			String str = it.next();

			if (str.startsWith("��")) {
				System.out.print(str + " ");
			}
		}

	}

}
