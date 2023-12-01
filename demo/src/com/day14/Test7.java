package com.day14;

import java.util.Collections;
import java.util.Vector;

public class Test7 {
	private static String[] city = { "서울", "부산", "대구", "인천", "광주", "대전", "울산" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		System.out.println("벡터의 초기 용량 " + v.capacity());// v.size 데이터의 개수
		// 무조건 기본적으로 10개를 만들어놓음. 후에 추가하면 계속 늘어남

		for (String c : city) {
			v.add(c);
		}

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("데이터갯수: " + v.size() + "개");

		// 수정
		v.set(0, "Seoul");
		v.set(1, "Busan");
		for (String s : v) {
			System.out.print(s + " ");
		}
		// 삽입
		v.insertElementAt("대한민국", 0);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 검색
		int index = v.indexOf("대구");
		if (index != -1) {// 데이터가 있으면
			System.out.println("검색 성공: " + index);
		} else {
			System.out.println("검색 실패: " + index);
		}

		// 오름차순
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 내림차순
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 삭제
		v.remove("Busan");// 7
		for (String s : v) {
			System.out.print(s + " ");
		}

		// 용량 증가
		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));

		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");

		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");

		// 빈공간 삭제
		v.trimToSize();
		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");

		// 벡터내 모든 데이터 삭제
		v.clear();
		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");

		v.trimToSize();
		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");

		v.add("서울");
		System.out.println("벡터의 용량: " + v.capacity());
		System.out.println("데이터 갯수: " + v.size() + "개");
	}

}
