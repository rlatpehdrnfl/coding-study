package com.day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File Ŭ���� (������ ���� �� �ִ� �ɷ�x ;fileoutputstream��� ���� ���� �� ����) 

//���Ϲ� ������ ������ �� �ֵ��� ����� �����ϴ� Ŭ����
//������ ���� ���� ������ �� ��쿡�� ���ǰ� 
//������ ������ ����� �ϱ� ���� �޼ҵ�� ����

public class Test10 {

	public static void main(String[] args) throws IOException {

		File f = new File("c:\\doc\\test.txt");

		if (!f.exists()) {
			System.out.println("������ ����");
			return;
		}

		System.out.println("���ϸ�: " + f.getName());
		System.out.println("���� ������: " + f.length());// ������ ����
		System.out.println("���ϰ��1: " + f.getAbsolutePath());
		System.out.println("����ǥ�ذ��: " + f.getCanonicalFile());
		System.out.println("���� ���糯 : " + new Date(f.lastModified()));
		System.out.println("���ϰ��2: " + f.getParentFile());
		System.out.println("�б�Ӽ�: " + f.canRead());
		System.out.println("���� �Ӽ� : " + f.canWrite());
	}

}
