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

		ScoreVO vo = new ScoreVO(); // Vo�� 5���� �����͸� ������ �� �ִ� ��������� ����, ����,to String�̷��� ������ �� VO���� ����

		System.out.print("�й�?");// 111
		// String hak = sc.next();
		// vo,setHak(hak)
		vo.setHak(sc.next());

		System.out.println("�̸�?");// suzi
		vo.setName(sc.next());

		System.out.println("����?");// 60
		vo.setKor(sc.nextInt());

		System.out.println("����?");// 70
		vo.setEng(sc.nextInt());

		System.out.println("����?");// 50
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

		System.out.println("�˻��� �й�?");// 111
		String searchHak = sc.next(); // hak �̸��� �Ȱ��Ƶ� ���� hak�� ��������

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

		System.out.println("�˻��� �̸�?");// suzi
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

		System.out.println("������ �й�?");
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

		// ������ Ŭ����
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

		// ������ Ŭ����
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
