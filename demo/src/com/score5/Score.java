package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	private List<ScoreVO> lists = null;

	private String path = System.getProperty("user.dir");// demo ǥ��

	File f = new File(path, "\\data\\score.txt");

	public Score() {

		try {
			// ����ֳ�?
			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();

			}
			// �����ֳ�?
			if (f.exists()) {

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (List<ScoreVO>) ois.readObject();

				fis.close();
				ois.close();
			}

		} catch (Exception e) {

		}

	}

	public void input() {// �Է�

		try {

			Scanner sc = new Scanner(System.in);

			ScoreVO vo = new ScoreVO();

			System.out.println("�̸�?");
			vo.setName(sc.next());

			System.out.println("����?");
			vo.setBirth(sc.next());

			System.out.println("����??");
			vo.setScore(sc.nextInt());

			if (lists == null) {
				lists = new ArrayList<ScoreVO>();
			}

			lists.add(vo);

		} catch (Exception e) {

		}

	}

	public void writeFile() {// ��������

		try {

			if (lists != null) {

				FileOutputStream fos = new FileOutputStream(f);

				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();
				System.out.println("���� ���� �Ϸ�");
			}

		} catch (Exception e) {

		}

	}

	public void print() {// ���

		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
}
