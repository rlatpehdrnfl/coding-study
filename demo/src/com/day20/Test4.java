package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Ŭ����[java.lang,String]��: ");

			String str = br.readLine();

			Class cls = Class.forName(str);//////// �̰͸� ����ϸ� ��

			// ������
			System.out.println("������...");
			Constructor[] c = cls.getConstructors();
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}

			// �ʵ�
			System.out.println("�ʵ�...");
			Field[] f = cls.getFields();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i]);
			}

			// �޼ҵ�
			System.out.println("�޼ҵ�...");
			Method[] m = cls.getMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i]);
			}

		} catch (Exception e) {

		}

	}

}
