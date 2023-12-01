package com.score3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>();

	@Override
	public int input() {

		int result = 0;

		Scanner sc = new Scanner(System.in);

		ScoreVO vo = new ScoreVO();

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

			System.out.printf("%5s %6s %4d %4d %4d %4d %4d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(),
					vo.getMat(), (vo.getKor() + vo.getEng() + vo.getMat()),
					(vo.getKor() + vo.getEng() + vo.getMat()) / 3);

		}

	}

}
