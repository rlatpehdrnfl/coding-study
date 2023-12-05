package com.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// ArrayList : List라는 인터페이스를 구현한 클래스, 역으로도 꺼낼 수 있다
public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<String>();

		lists.add("서울");
		lists.add("부산");
		lists.add("대구");

		ListIterator<String> it = lists.listIterator();
		while (it.hasNext()) {// 데이터 있으면
			System.out.print(it.next() + " ");
		}
		System.out.println("\n--------------");

		while (it.hasPrevious()) {// 데이터가 있으면 순서대로 읽어 내려갔다가 역순으로 읽어낼 수 있음
			System.out.print(it.previous() + " ");
		}

		System.out.println();

		List<String> lists1 = new ArrayList<String>();

		lists1.addAll(lists);
		lists1.add("인천");

		int n = lists1.indexOf("부산");
		lists1.add(n + 1, "광주");

		for (String s : lists1) {

			System.out.print(s + " ");
		}

		System.out.println();

		Iterator<String> it1 = lists1.iterator();
		while (it.hasNext()) {
			String str = it.next();

			if (str.startsWith("부")) {
				System.out.print(str + " ");
			}
		}

	}

}
