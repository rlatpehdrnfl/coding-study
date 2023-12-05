package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map <key, value>

//Map(I) - Hashtable(C) : Vector와 동일
//Map(I) - HashMap(C) : ArrayList와 동일
//Map(I) - TreeMap(C) : 정렬해서 출력
//key는 중복값을 가질 수 없음(key의 데이터 타입이 Set(컬렉션)이라는 인터페이스이기 때문/Set은 중복값을 못 가짐)
//Map은 Iterator가 없다(Set의 Iterator를 빌려씀)
//put(key,value) : 추가
//get(key) : 가져오기

public class Test2 {

	public static String name[] = { "배수지", "이이담", "유인나", "박신혜", "고문영" };// value
	public static String tel[] = { "111-111", "222-222", "333-333", "111-111", "555-555" };// key, key가 똑같으면 수정됨(박신혜로
																							// 덮어씌워짐)

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<String, String>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]);
		}

		System.out.println(h);

		String str;

		str = h.get("111-111");// key를 주면 value를 준다!!!!!!!!!!!!

		if (str == null) {// String은 (데이터끼리 비교)equals로 비교해야 함. 하지만 null을 확인할때는 ==가능.

			System.out.println("자료없음");

		} else {
			System.out.println(str);
		}

		if (h.containsKey("222-222")) {// 키가 있는지 확인하는 것

			System.out.println("222-222키가 있다");
		}

		if (h.contains("이이담")) {// value있냐 - class로 저장함
			System.out.println("이담이 있어요!");
		}

		h.remove("222-222");

		if (h.containsKey("222-222")) {

			System.out.println("222-222키가 있다");
		} else {
			System.out.println("222-222키가 없다");
		}

		Iterator<String> it = h.keySet().iterator();// 공식

		while (it.hasNext()) {

			String key = it.next();// key를 꺼냄
			String value = h.get(key);// value를 꺼냄

			System.out.println(key + ":" + value);
		}

	}

}
