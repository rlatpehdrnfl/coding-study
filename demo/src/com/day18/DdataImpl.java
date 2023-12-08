package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DdataImpl implements Ddata {

	private List<DdataVO> lists = new ArrayList<DdataVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {

		int result = 0;

		DdataVO vo = new DdataVO();

		System.out.println("�̸�?");
		vo.setName(sc.next());

		System.out.println("����?");
		vo.setBirth(sc.next());

		System.out.println("����?");
		vo.setScore(sc.nextInt());

		lists.add(vo);

	}

	@Override
	public void print() {

//		Iterator<DdataVO> it = lists.iterator();
//
//		while (it.hasNext()) {
//
//			DdataVO vo = it.next();
//
//			System.out.println(vo.toString());
//		}

		try {
			FileInputStream fis = new FileInputStream("c:\\doc\\Ddata.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<DdataVO> ob;

			try {
				while ((ob = (List<DdataVO>) ois.readObject()) != null) {
					// ���Ͽ��� �о�� ������ ���
					for (DdataVO vo : ob) {
						System.out.println(vo.toString());
					}
				}
			} catch (Exception e) {
				// ������ ���� ������ ���
			}

			ois.close();
			fis.close();

		} catch (Exception e) {
			// ���� �б� ���� �� ���� ó��
			e.printStackTrace();
		}
	}

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\doc\\Ddata.txt");// String�� ������ �� ����

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);
			oos.close();
			fos.close();

			System.out.println("���Ϸ� �����½��ϴ�");

		} catch (Exception e) {

		}

	}

}
