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

		System.out.println("이름?");
		vo.setName(sc.next());

		System.out.println("생일?");
		vo.setBirth(sc.next());

		System.out.println("점수?");
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
					// 파일에서 읽어온 데이터 출력
					for (DdataVO vo : ob) {
						System.out.println(vo.toString());
					}
				}
			} catch (Exception e) {
				// 파일의 끝에 도달한 경우
			}

			ois.close();
			fis.close();

		} catch (Exception e) {
			// 파일 읽기 실패 시 예외 처리
			e.printStackTrace();
		}
	}

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\doc\\Ddata.txt");// String은 감싸줄 수 있음

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);
			oos.close();
			fos.close();

			System.out.println("파일로 내보냈습니다");

		} catch (Exception e) {

		}

	}

}
