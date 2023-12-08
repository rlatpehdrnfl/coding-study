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

			// 검증 조건
			// 1. 사용자가 입력한 문자열이 5~10자이내인지 검사
			// 2. 영문자(대소문자 구분x),숫자 혼합입력

			if (str.length() < 8 || str.length() > 15) {
				throw new Exception("문자열의 길이는 8~15자입니다");
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
				throw new Exception("영문자, 숫자 혼용만 가능합니다");
			}
		}

		public void passwordFormat(String str) throws Exception {

			String str2 = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("비밀번호 재확인");
			str2 = sc.next();

			if (!str.equals(str2)) {
				throw new Exception("비밀번호 입력 실패");
			}

			// 왜 이거 안되는지 알아오기
		}

	}

	@Override
	public void input() {

		NaverVO vo = new NaverVO();
		MyAuthenticator auth = new MyAuthenticator();

		while (true) {
			try {
				System.out.println("아이디?");
				vo.setID(sc.next());
				auth.inputFormat(vo.getID());
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		while (true) {
			try {

				System.out.println("비밀번호?");
				vo.setPW(sc.next());

				auth.passwordFormat(vo.getPW());
				break;

			} catch (Exception e) {

			}
		}

		try {

			System.out.println("이름?");
			String name = sc.next();

			if (name.length() < 2 || name.length() > 10) {
				throw new Exception("이름의 길이는 2~10자입니다");
			}

		} catch (Exception e) {

		}

		try {

			System.out.println("성별?");
			String gender = sc.next();
			vo.setGender(gender);

			char ch = gender.charAt(0);

			if (ch == 'w' || ch == 'W') {
				System.out.println("여자입니다");
			} else {
				System.out.println("남자입니다");
			}

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		System.out.println("생일?");
		vo.setBirth(sc.next());

		System.out.println("이메일?");
		vo.setEmail(sc.next());

		System.out.println("전화번호?");
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
		System.out.println("검색할 아이디?");
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