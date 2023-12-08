package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<NaverVO>();

	Scanner sc = new Scanner(System.in);

	class MyAuthenticator {

		public void inputFormat(String str) throws Exception {

			// ���� ����
			// 1. ����ڰ� �Է��� ���ڿ��� 5~10���̳����� �˻�
			// 2. ������(��ҹ��� ����x),���� ȥ���Է�

			if (str.length() < 8 || str.length() > 15) {
				throw new Exception("���ڿ��� ���̴� 8~15���Դϴ�");
			}

			int eng = 0;
			int num = 0;

			// str = "a1b2c3"
			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
					eng++;

				} else if (ch >= '0' && ch <= '9')
					num++;

			}

			if (eng == 0 || num == 0) {
				throw new Exception("������, ���� ȥ�븸 �����մϴ�");
			}
		}

		public void passwordFormat(String str) throws Exception {

			String str2 = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("��й�ȣ ��Ȯ��");
			str2 = sc.next();

			if (!str.equals(str2)) {
				throw new Exception("��й�ȣ �Է� ����");
			}

			// �� �̰� �ȵǴ��� �˾ƿ���
		}

	}

	@Override
	public void input() {

		NaverVO vo = new NaverVO();
		MyAuthenticator auth = new MyAuthenticator();

		while (true) {
			try {
				System.out.println("���̵�?");
				vo.setID(sc.next());
				auth.inputFormat(vo.getID());
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		while (true) {
			try {

				System.out.println("��й�ȣ?");
				vo.setPW(sc.next());

				auth.passwordFormat(vo.getPW());
				break;

			} catch (Exception e) {

			}
		}

		try {

			System.out.println("�̸�?");
			String name = sc.next();

			if (name.length() < 2 || name.length() > 10) {
				throw new Exception("�̸��� ���̴� 2~10���Դϴ�");
			}

		} catch (Exception e) {

		}

		try {

			System.out.println("����?");
			String gender = sc.next();
			vo.setGender(gender);

			char ch = gender.charAt(0);

			if (ch == 'w' || ch == 'W') {
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("�����Դϴ�");
			}

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println("����?");
		vo.setBirth(sc.next());

		System.out.println("�̸���?");
		vo.setEmail(sc.next());

		System.out.println("��ȭ��ȣ?");
		vo.setTel(sc.next());

		lists.add(vo);

	}

	@Override
	public void print() {

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {

			NaverVO vo = it.next();

			System.out.println(vo.toString());
		}
	}

	@Override
	public void search() {
		System.out.println("�˻��� ���̵�?");
		String searchID = sc.next();

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (vo.getID().equals(searchID)) {
				System.out.println(vo.toString());

			}

		}

	}

}