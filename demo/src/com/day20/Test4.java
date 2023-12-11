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

			System.out.println("클래스[java.lang,String]명: ");

			String str = br.readLine();

			Class cls = Class.forName(str);//////// 이것만 기억하면 됨

			// 생성자
			System.out.println("생성자...");
			Constructor[] c = cls.getConstructors();
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}

			// 필드
			System.out.println("필드...");
			Field[] f = cls.getFields();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i]);
			}

			// 메소드
			System.out.println("메소드...");
			Method[] m = cls.getMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i]);
			}

		} catch (Exception e) {

		}

	}

}
