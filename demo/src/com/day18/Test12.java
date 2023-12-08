package com.day18;

import java.io.File;
import java.io.FileFilter;

//FileFilter
//Ư�� ��ũ���� ��� ������ ���� ����Ʈ�� ������

class MyFileList implements FileFilter {

	private File f;// MyFileList�� f�� �ʼ� //������ ����

	public MyFileList(String filePath) {
		f = new File(filePath);
	}

	public void result() {

		try {

			if (!f.exists()) {
				System.out.println("������ �����ϴ�!");
				return;

			}

			System.out.println("������: " + f.getAbsolutePath());
			System.out.println("����ũ��: " + f.length());

			if (f.isDirectory()) {

				File[] lists = f.listFiles(this);

				System.out.println("\n���� ����...");

				for (int i = 0; i < lists.length; i++)
					System.out.println(lists[i].getName());
				int i = 0;
				System.out.println("\t" + lists[i].length());

			}

			System.out.println("���丮 ����...");
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
