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

	private String path = System.getProperty("user.dir");// demo 표시

	File f = new File(path, "\\data\\score.txt");

	public Score() {

		try {
			// 경로있냐?
			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();

			}
			// 파일있냐?
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

	public void input() {// 입력

		try {

			Scanner sc = new Scanner(System.in);

			ScoreVO vo = new ScoreVO();

			System.out.println("이름?");
			vo.setName(sc.next());

			System.out.println("생일?");
			vo.setBirth(sc.next());

			System.out.println("점수??");
			vo.setScore(sc.nextInt());

			if (lists == null) {
				lists = new ArrayList<ScoreVO>();
			}

			lists.add(vo);

		} catch (Exception e) {

		}

	}

	public void writeFile() {// 파일저장

		try {

			if (lists != null) {

				FileOutputStream fos = new FileOutputStream(f);

				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();
				System.out.println("파일 저장 완료");
			}

		} catch (Exception e) {

		}

	}

	public void print() {// 출력

		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
}
