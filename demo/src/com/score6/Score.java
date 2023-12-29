package com.score6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score { // 사용자한테 데이터 5개 받아내는 클래스

	ScoreDAO dao = new ScoreDAO();

	Scanner sc = new Scanner(System.in);

	// 입력
	public void insert() {

		ScoreDTO dto = new ScoreDTO(); // dto는 실행할때마다 새롭게 만들거니까 안에다가 만들어줘야함

		System.out.print("학번?");
		dto.setHak(sc.next());

		System.out.print("이름?");
		dto.setName(sc.next());

		System.out.print("국어?");
		dto.setKor(sc.nextInt());

		System.out.print("영어?");
		dto.setEng(sc.nextInt());

		System.out.print("수학?");
		dto.setMat(sc.nextInt());

		int result = dao.insertData(dto); // 5개의 데이터를 dto를 가지고 dao에 가서 실행 한후 1/0으로 반환
		// dto에 담겨있는게 dao로 옮겨 데이터베이스에 저장
		if (result != 0) {
			System.out.println("추가 성공!");
		} else {
			System.out.println("추가 실패!");
		}
	}

	// 수정
	public void update() {
		ScoreDTO dto = new ScoreDTO();

		System.out.println("수정할 학번?");
		dto.setHak(sc.next());

		System.out.print("국어?");
		dto.setKor(sc.nextInt());

		System.out.print("영어?");
		dto.setEng(sc.nextInt());

		System.out.print("수학?");
		dto.setMat(sc.nextInt());

		int result = dao.updateData(dto);

		if (result != 0) {
			System.out.println("수정 성공!");
		} else {
			System.out.println("수정 실패!");
		}

	}

	//
	public void delete() {

		try {

			System.out.print("삭제할 학번?");
			String hak = sc.next();

			int result = dao.deleteData(hak);// 학을 넘기면 삭제가 됨

			if (result != 0) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
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

		System.out.print("검색할 이름?");
		String name = sc.next();

		List<ScoreDTO> lists = dao.searchName(name); // name으로 select를 해서 lists로 돌려줌.

		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}

	public void searchHak() {

		System.out.print("검색할 학번?");
		String hak = sc.next();

		ScoreDTO dto = dao.searchHak(hak); // name으로 select를 해서 lists로 돌려줌.

		if (dto != null) { // 안에 뭐가있다면
			System.out.println(dto.toString()); // 그냥 어차피 하나 나오니까 그거 출력해~
		}
	}
}
