package com.day14;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static String[] city = { "서울", "부산", "대구", "인천", "광주", "대전", "울산" };

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

		for (String s : v) {// 확장포문은 배열에서 사용할 수 있다
			System.out.println(s + " ");
		}
		System.out.println();

		// 반복자 (인터페이스는 저장소로도 쓰임) - 외우자
		Iterator<String> it = v.iterator();

		while (it.hasNext()) {// hasNext : 데이터 있어?

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
