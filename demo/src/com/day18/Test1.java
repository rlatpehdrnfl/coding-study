package com.day18;

import java.io.IOException;

//Stream

//�⺻ ����½�Ʈ��
//in
public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("���ڿ� �Է�: ");// abc123
		while ((data = System.in.read()) != -1) {// -1�� �����Ͱ� ������ �̶�� ��
			char ch = (char) data;

			System.out.print(ch);
		}

	}

}
//String�� ���ļ� �� �� ����
