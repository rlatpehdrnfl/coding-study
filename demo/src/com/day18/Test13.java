package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//����ȭ
//�޸𸮿� ������ Ŭ������ �ν��Ͻ� ������ ���� ���¸� 
//�״�� �����ؼ� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� ������ �� �ִ� ���
//������ ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
//��ü�� ���Ͽ� ���������ν� ���Ӽ��� ���� �� �ִ�
//implements Serializable�� �����ϴµ� �޼ҵ尡 ����

public class Test13 {

	public static void main(String[] args) throws Exception {

		// ����ȭ
		Hashtable<String, String> h = new Hashtable<String, String>();

		h.put("1", "�����");
		h.put("2", "���̴�");
		h.put("3", "���γ�");

		FileOutputStream fos = new FileOutputStream("c:\\doc\\out5.txt");// String�� ������ �� ����

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(h);// upcast
		oos.close();
		fos.close();

		System.out.println("���Ϸ� �����½��ϴ�");
	}

}
