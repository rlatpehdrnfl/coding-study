package com.day14;

import java.util.Collections;
import java.util.Vector;

public class Test7 {
	private static String[] city = { "����", "�λ�", "�뱸", "��õ", "����", "����", "���" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		System.out.println("������ �ʱ� �뷮 " + v.capacity());// v.size �������� ����
		// ������ �⺻������ 10���� ��������. �Ŀ� �߰��ϸ� ��� �þ

		for (String c : city) {
			v.add(c);
		}

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("�����Ͱ���: " + v.size() + "��");

		// ����
		v.set(0, "Seoul");
		v.set(1, "Busan");
		for (String s : v) {
			System.out.print(s + " ");
		}
		// ����
		v.insertElementAt("���ѹα�", 0);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// �˻�
		int index = v.indexOf("�뱸");
		if (index != -1) {// �����Ͱ� ������
			System.out.println("�˻� ����: " + index);
		} else {
			System.out.println("�˻� ����: " + index);
		}

		// ��������
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ��������
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ����
		v.remove("Busan");// 7
		for (String s : v) {
			System.out.print(s + " ");
		}

		// �뷮 ����
		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));

		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");

		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");

		// ����� ����
		v.trimToSize();
		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");

		// ���ͳ� ��� ������ ����
		v.clear();
		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");

		v.trimToSize();
		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");

		v.add("����");
		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("������ ����: " + v.size() + "��");
	}

}
