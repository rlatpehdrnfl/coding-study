package com.day14;

import java.util.Vector;

//Collection Framework(�����) : �������̽�(����������ε� ���ȴ�)	
//�޼ҵ常 �ְų�~
//List, Vector, Set, Map, LinkedList, HashSet, TreeSet, Hashtable

// �迭
// ������ ����������
//���� �ø��ų� ���̰ų� ���� ����

//List(I) - Vector(Class) - ������ : ����ȭ ����
//List(I) - ArrayList(C) - ������ : ����ȭ ����x

public class Test5 {

	public static void main(String[] args) {

		// vector�� �⺻���� object
		Vector v = new Vector();

		v.add("����");// upcast
		v.add(30);
		// �ڷ����� �θ� ����. Inteager���� �� ��
		v.add('c');
		// ���ʹ� �⺻������ ���� 10�� �������
		String str;
		Integer i;
		Character c;

		str = (String) v.get(0); // downcast
		System.out.println(str);

		i = (Integer) v.get(1);// downcast
		System.out.println(i);

		c = (char) v.get(2);
		System.out.println(c);

		for (int n = 0; n < v.size(); n++) {

			Object ob = v.get(n);

			if (ob instanceof String) {
				str = (String) ob;
				System.out.println(str);
			} else if (ob instanceof Integer) {
				i = (Integer) ob;// downcasting
				System.out.println(i);
			} else if (ob instanceof Character) {
				c = (char) ob;
				System.out.println(c);
			}

		}

	}

}
