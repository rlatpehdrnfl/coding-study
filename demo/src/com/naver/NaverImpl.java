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

	}

	@Override
	public String input() {

		int result = 0;

		NaverVO vo = new NaverVO();

		try {
			System.out.println("���̵�?");

			vo.setID(sc.next());

			MyAuthenticator auth = new MyAuthenticator();

			auth.inputFormat(vo.getID());

			System.out.println("��й�ȣ?");
			vo.setPW(sc.next());

			System.out.println("��й�ȣ Ȯ��?");
			String PW2 = sc.next();

			if (!vo.getPW().equals(PW2)) {
				throw new Exception("��й�ȣ�� Ȯ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");

			}

		} catch (Exception e) {
			System.out.println(e.toString());
			return "";
		}

		System.out.println("�̸�?");
		vo.setName(sc.next());

		System.out.println("����?");
		vo.setGender(sc.next());

		System.out.println("����?");
		vo.setBirth(sc.next());

		System.out.println("�̸���?");
		vo.setEmail(sc.next());

		System.out.println("��ȭ��ȣ?");
		vo.setTel(sc.next());

		lists.add(vo);
		return null;
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