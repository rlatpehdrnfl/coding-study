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

			oos.writeObject(new DataVO("배수지", 100));
			oos.writeObject(new DataVO("이이담", 200));
			oos.writeObject(new DataVO("유인나", 300));
			oos.writeObject(new DataVO("박신혜", 400));
			oos.writeObject(new DataVO("고문영", 500));

			oos.close();
			fos.close();// 직렬화 끝

			System.out.println("데이터 저장 완료");

			// 역직렬화

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
