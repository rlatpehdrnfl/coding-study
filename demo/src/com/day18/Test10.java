package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File 클래스 (파일을 만들 수 있는 능력x ;fileoutputstream얘는 파일 만들 수 있음) 

//파일및 폴더를 관리할 수 있도록 기능을 제공하는 클래스
//파일의 복사 변경 조작을 할 경우에만 사용되고 
//파일의 내용을 입출력 하기 위한 메소드는 없다

public class Test10 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");

		if (!f.exists()) {
			System.out.println("파일이 없다");
			return;
		}

		System.out.println("파일명: " + f.getName());
		System.out.println("파일 사이즈: " + f.length());// 파일의 길이
		System.out.println("파일경로1: " + f.getAbsolutePath());
		System.out.println("파일표준경로: " + f.getCanonicalFile());
		System.out.println("파일 만든날 : " + new Date(f.lastModified()));
		System.out.println("파일경로2: " + f.getParentFile());
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기 속성 : " + f.canWrite());
	}

}
