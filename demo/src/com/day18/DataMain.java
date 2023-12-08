package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataMain {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("c:\\doc\\data.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new DataVO("�����", 100));
			oos.writeObject(new DataVO("���̴�", 200));
			oos.writeObject(new DataVO("���γ�", 300));
			oos.writeObject(new DataVO("�ڽ���", 400));
			oos.writeObject(new DataVO("����", 500));

			oos.close();
			fos.close();// ����ȭ ��

			System.out.println("������ ���� �Ϸ�");

			// ������ȭ

			FileInputStream fis = new FileInputStream("c:\\doc\\data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			DataVO ob = null;

			try {

				while (true) {

					ob = (DataVO) ois.readObject();

					if (ob == null) {
						break;
					}
					System.out.println(ob.toString());
				}

			} catch (Exception e) {

			}

			ois.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
