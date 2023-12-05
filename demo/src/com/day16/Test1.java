package com.day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {

		Set<String> string = new HashSet<String>();

		string.add("����");
		string.add("�λ�");
		string.add("����");

		System.out.println(string);

		Stack<String> str = new Stack<String>();

		str.push("����");
		str.push("�λ�");
		str.push("�뱸");

		System.out.println(string);

		while (!str.empty()) {// �����Ͱ� ������

			System.out.println(str.pop());// �� ������ �������� ��µ�
		}

		Queue<String> q = new LinkedList<String>();

		q.add("����");
		q.offer("�λ�");
		q.offer("�뱸");

		while (q.peek() != null) {
			System.out.println(q.poll());
		}

		String[] stri = { "��", "��", "��", "��", "��", "��" };

		for (String ss : stri) {
			System.out.println(ss + " ");
		}

		System.out.println();

		Arrays.sort(stri);// �迭�� �����ϴ� �޼ҵ尡 �ִ�
		for (String ss : stri) {
			System.out.println(ss + " ");
		}

	}

}
