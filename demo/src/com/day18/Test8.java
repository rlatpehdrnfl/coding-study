package com.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("c:\\doc\\test.txt");

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));// inputstreamreader�� �� ������ ����ڿ��� Ű�����
																				// �Է��� ����(1byte)�� �޾� 2byte�� ����� ���ؼ�

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// inputstreamreader�� �� ������ ����ڿ��� Ű�����
																					// �Է��� ����(1byte)�� �޾� 2byte�� ����� ���ؼ�

	}

}
