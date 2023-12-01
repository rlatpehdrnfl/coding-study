package com.day14;

import java.util.Vector;

//Collection Framework(방법들) : 인터페이스(저장공간으로도 사용된다)	
//메소드만 있거나~
//List, Vector, Set, Map, LinkedList, HashSet, TreeSet, Hashtable

// 배열
// 갯수가 정해져있음
//갯수 늘리거나 줄이거나 하지 못함

//List(I) - Vector(Class) - 느리다 : 동기화 지원
//List(I) - ArrayList(C) - 빠르다 : 동기화 지원x

public class Test5 {

	public static void main(String[] args) {

		// vector는 기본값이 object
		Vector v = new Vector();

		v.add("서울");// upcast
		v.add(30);
		// 자료형은 부모가 없음. Inteager값이 들어간 것
		v.add('c');
		// 벡터는 기본적으로 방이 10개 만들어짐
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
