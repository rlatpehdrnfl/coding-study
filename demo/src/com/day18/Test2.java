package com.day18;

import java.io.OutputStream;

//Stream
//�⺻ ����� ��Ʈ��
//out

public class Test2 {

	public static void main(String[] args) {

		try {

			OutputStream os = System.out;// System.inŰ����� �Է��� ���� �о, out�� �ܼ�â�� ����ִ� ����

			byte[] buffer = new byte[3];// 3�ھ� �������ٴ�

			buffer[0] = 65;
			buffer[1] = 97;
			buffer[2] = 122;

			os.write(buffer);// buffer : �����͸� �����ϴ� �������
			os.close();// Stream�� �� ���� close ����� ��

			System.out.println("�� ���̳�?");// �⺻ ����Ʈ�� ������ �� �ִ� ���Ա��� ����

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
//cahr ������ ���� ���ھ� ������
