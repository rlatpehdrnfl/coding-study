package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;//정렬

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();

	Scanner sc = new Scanner(System.in);
	private String hak;// key

	@Override
	public void input() {

		System.out.println("학번? ");// 111
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("학번이 존재합니다. 추가 실패~");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.println("국어?");
		vo.setKor(sc.nextInt());

		System.out.println("영어?");
		vo.setEng(sc.nextInt());

		System.out.println("수학?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);// list.add(vo)와 똑같은 개념

		System.out.println("추가 성공!");

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();
			ScoreVO vo = hMap.get(key);
			System.out.println(key + " " + vo.toString());

		}

	}

	@Override
	public boolean searchHak(String hak) {
		if (hMap.containsKey(hak)) {
			return true;// 값이 있으면 true 없으면 false
		}

		return false;
	}

	@Override
	public void delete() {

		System.out.println("삭제할 학번?");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("존재하지 않는 학번입니다");
		}

	}

	@Override
	public void update() {

		System.out.print("수정할 학번?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("존재하지 않는 학번입니다. 수정할 수 없습니다.");
			return;
		}
//참조의 개념을 헷갈리면 안됨
		ScoreVO vo = hMap.get(hak);// 데이터를 그대로 가져오는게 아니라 주소만 가져온 것/Call by reference

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		System.out.println(hak + " 학번 정보 수정 완료.");
		// 이름에 null

	}

	@Override
	public void findHak() {

		System.out.print("검색할 학번?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("학번이 없습니다");
			return;
		} else {
			ScoreVO vo = hMap.get(hak);
			System.out.println(hak + " " + vo.toString());

		}

	}

	@Override
	public void findName() {
		// 이름이 존재하지 않습니다

		System.out.println("검색할 이름?");// suzi
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();

		boolean flag = false;

		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			if (vo.getName().equals(name)) {
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("이름이 없습니다.");
		}
	}

}