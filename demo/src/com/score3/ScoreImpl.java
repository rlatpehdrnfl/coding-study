package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;

		ScoreVO vo = new ScoreVO(); // Vo는 5개의 데이터를 저장할 수 있는 저장공간과 세터, 게터,to String이렇게 변수가 매 VO마다 존재

		System.out.print("학번?");// 111
		// String hak = sc.next();
		// vo,setHak(hak)
		vo.setHak(sc.next());

		System.out.println("이름?");// suzi
		vo.setName(sc.next());

		System.out.println("국어?");// 60
		vo.setKor(sc.nextInt());

		System.out.println("영어?");// 70
		vo.setEng(sc.nextInt());

		System.out.println("수학?");// 50
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return result;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo);

		}

	}

	@Override
	public void searchHak() {

		System.out.println("검색할 학번?");// 111
		String searchHak = sc.next(); // hak 이름이 똑같아도 여기 hak은 지역변수

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getHak().equals(searchHak)) {
				System.out.println(vo.toString());
				break;
			}

		}

	}

	@Override
	public void searchName() {

		System.out.println("검색할 이름?");// suzi
		String searchName = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getName().equals(searchName)) {
				System.out.println(vo.toString());

			}

		}

	}

	@Override
	public void deleteHak() {

		System.out.println("삭제할 학번?");
		String deleteHak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getHak().equals(deleteHak)) {
				lists.remove(vo);
				break;
			}

		}

	}

	@Override
	public void descSortTot() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo1.getTot() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void ascSortHak() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};

		Collections.sort(lists, comp);

		print();

	}

}
