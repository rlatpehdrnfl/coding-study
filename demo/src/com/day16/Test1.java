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

		string.add("서울");
		string.add("부산");
		string.add("서울");

		System.out.println(string);

		Stack<String> str = new Stack<String>();

		str.push("서울");
		str.push("부산");
		str.push("대구");

		System.out.println(string);

		while (!str.empty()) {// 데이터가 있으면

			System.out.println(str.pop());// 들어간 순서의 역순으로 출력됨
		}

		Queue<String> q = new LinkedList<String>();

		q.add("서울");
		q.offer("부산");
		q.offer("대구");

		while (q.peek() != null) {
			System.out.println(q.poll());
		}

		String[] stri = { "나", "다", "가", "마", "사", "바" };

		for (String ss : stri) {
			System.out.println(ss + " ");
		}

		System.out.println();

		Arrays.sort(stri);// 배열을 정렬하는 메소드가 있다
		for (String ss : stri) {
			System.out.println(ss + " ");
		}

	}

}
