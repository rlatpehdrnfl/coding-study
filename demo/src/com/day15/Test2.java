package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map <key, value>

//Map(I) - Hashtable(C) : Vector�� ����
//Map(I) - HashMap(C) : ArrayList�� ����
//Map(I) - TreeMap(C) : �����ؼ� ���
//key�� �ߺ����� ���� �� ����(key�� ������ Ÿ���� Set(�÷���)�̶�� �������̽��̱� ����/Set�� �ߺ����� �� ����)
//Map�� Iterator�� ����(Set�� Iterator�� ������)
//put(key,value) : �߰�
//get(key) : ��������

public class Test2 {

	public static String name[] = { "�����", "���̴�", "���γ�", "�ڽ���", "����" };// value
	public static String tel[] = { "111-111", "222-222", "333-333", "111-111", "555-555" };// key, key�� �Ȱ����� ������(�ڽ�����
																							// �������)

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<String, String>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}

		System.out.println(h);

		String str;

		str = h.get("111-111");// key�� �ָ� value�� �ش�!!!!!!!!!!!!

		if (str == null) {// String�� (�����ͳ��� ��)equals�� ���ؾ� ��. ������ null�� Ȯ���Ҷ��� ==����.

			System.out.println("�ڷ����");

		} else {
			System.out.println(str);
		}

		if (h.containsKey("222-222")) {// Ű�� �ִ��� Ȯ���ϴ� ��

			System.out.println("222-222Ű�� �ִ�");
		}

		if (h.contains("���̴�")) {// value�ֳ� - class�� ������
			System.out.println("�̴��� �־��!");
		}

		h.remove("222-222");

		if (h.containsKey("222-222")) {

			System.out.println("222-222Ű�� �ִ�");
		} else {
			System.out.println("222-222Ű�� ����");
		}

		Iterator<String> it = h.keySet().iterator();// ����

		while (it.hasNext()) {

			String key = it.next();// key�� ����
			String value = h.get(key);// value�� ����

			System.out.println(key + ":" + value);
		}

	}

}
