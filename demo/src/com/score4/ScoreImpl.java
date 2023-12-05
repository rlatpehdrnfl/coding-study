package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;//����

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();

	Scanner sc = new Scanner(System.in);
	private String hak;// key

	@Override
	public void input() {

		System.out.println("�й�? ");// 111
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("�й��� �����մϴ�. �߰� ����~");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.println("����?");
		vo.setKor(sc.nextInt());

		System.out.println("����?");
		vo.setEng(sc.nextInt());

		System.out.println("����?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);// list.add(vo)�� �Ȱ��� ����

		System.out.println("�߰� ����!");

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
			return true;// ���� ������ true ������ false
		}

		return false;
	}

	@Override
	public void delete() {

		System.out.println("������ �й�?");
		hak = sc.next();

		if (searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("�����Ǿ����ϴ�");
		} else {
			System.out.println("�������� �ʴ� �й��Դϴ�");
		}

	}

	@Override
	public void update() {

		System.out.print("������ �й�?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("�������� �ʴ� �й��Դϴ�. ������ �� �����ϴ�.");
			return;
		}
//������ ������ �򰥸��� �ȵ�
		ScoreVO vo = hMap.get(hak);// �����͸� �״�� �������°� �ƴ϶� �ּҸ� ������ ��/Call by reference

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		System.out.println(hak + " �й� ���� ���� �Ϸ�.");
		// �̸��� null

	}

	@Override
	public void findHak() {

		System.out.print("�˻��� �й�?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("�й��� �����ϴ�");
			return;
		} else {
			ScoreVO vo = hMap.get(hak);
			System.out.println(hak + " " + vo.toString());

		}

	}

	@Override
	public void findName() {
		// �̸��� �������� �ʽ��ϴ�

		System.out.println("�˻��� �̸�?");// suzi
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
			System.out.println("�̸��� �����ϴ�.");
		}
	}

}