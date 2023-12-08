package com.day18;

import java.io.File;
import java.io.FileFilter;

//FileFilter
//특정 디스크내의 모든 폴더와 파일 리스트를 보여줌

class MyFileList implements FileFilter {

	private File f;// MyFileList는 f가 필수 //의존성 주입

	public MyFileList(String filePath) {
		f = new File(filePath);
	}

	public void result() {

		try {

			if (!f.exists()) {
				System.out.println("파일이 없습니다!");
				return;

			}

			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("파일크기: " + f.length());

			if (f.isDirectory()) {

				File[] lists = f.listFiles(this);

				System.out.println("\n폴더 내용...");

				for (int i = 0; i < lists.length; i++)
					System.out.println(lists[i].getName());
				int i = 0;
				System.out.println("\t" + lists[i].length());

			}

			System.out.println("디렉토리 구조...");
			File[] root = File.listRoots();
			for (int i = 0; i < root.length; i++) {
				System.out.println(root[i].getParent());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public boolean accept(File pathname) {

		return pathname.isFile() || pathname.isDirectory();
	}

}

public class Test12 {

	public static void main(String[] args) {

		MyFileList mf = new MyFileList("c:\\doc");
		mf.result();

	}

}
