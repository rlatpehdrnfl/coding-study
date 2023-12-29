package com.score6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score { // ��������� ������ 5�� �޾Ƴ��� Ŭ����

	ScoreDAO dao = new ScoreDAO();

	Scanner sc = new Scanner(System.in);

	// �Է�
	public void insert() {

		ScoreDTO dto = new ScoreDTO(); // dto�� �����Ҷ����� ���Ӱ� ����Ŵϱ� �ȿ��ٰ� ����������

		System.out.print("�й�?");
		dto.setHak(sc.next());

		System.out.print("�̸�?");
		dto.setName(sc.next());

		System.out.print("����?");
		dto.setKor(sc.nextInt());

		System.out.print("����?");
		dto.setEng(sc.nextInt());

		System.out.print("����?");
		dto.setMat(sc.nextInt());

		int result = dao.insertData(dto); // 5���� �����͸� dto�� ������ dao�� ���� ���� ���� 1/0���� ��ȯ
		// dto�� ����ִ°� dao�� �Ű� �����ͺ��̽��� ����
		if (result != 0) {
			System.out.println("�߰� ����!");
		} else {
			System.out.println("�߰� ����!");
		}
	}

	// ����
	public void update() {
		ScoreDTO dto = new ScoreDTO();

		System.out.println("������ �й�?");
		dto.setHak(sc.next());

		System.out.print("����?");
		dto.setKor(sc.nextInt());

		System.out.print("����?");
		dto.setEng(sc.nextInt());

		System.out.print("����?");
		dto.setMat(sc.nextInt());

		int result = dao.updateData(dto);

		if (result != 0) {
			System.out.println("���� ����!");
		} else {
			System.out.println("���� ����!");
		}

	}

	//
	public void delete() {

		try {

			System.out.print("������ �й�?");
			String hak = sc.next();

			int result = dao.deleteData(hak);// ���� �ѱ�� ������ ��

			if (result != 0) {
				System.out.println("���� ����!");
			} else {
				System.out.println("���� ����!");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void selectAll() {

		List<ScoreDTO> lists = dao.getList();

		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}

	}

	public void searchName() {

		System.out.print("�˻��� �̸�?");
		String name = sc.next();

		List<ScoreDTO> lists = dao.searchName(name); // name���� select�� �ؼ� lists�� ������.

		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}

	public void searchHak() {

		System.out.print("�˻��� �й�?");
		String hak = sc.next();

		ScoreDTO dto = dao.searchHak(hak); // name���� select�� �ؼ� lists�� ������.

		if (dto != null) { // �ȿ� �����ִٸ�
			System.out.println(dto.toString()); // �׳� ������ �ϳ� �����ϱ� �װ� �����~
		}
	}
}
