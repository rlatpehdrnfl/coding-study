package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//직렬화
//메모리에 생성된 클래스의 인스턴스 변수의 현재 상태를 
//그대로 보존해서 파일에 저장하거나 네트워크를 통해 전달할 수 있는 기능
//장점은 객체의 내용의 입출력 형식에 구애받지 않고
//객체를 파일에 저장함으로써 영속성을 가질 수 있다
//implements Serializable로 구현하는데 메소드가 없다

public class Test13 {

	public static void main(String[] args) throws Exception {

		// 직렬화
		Hashtable<String, String> h = new Hashtable<String, String>();

		h.put("1", "배수지");
		h.put("2", "이이담");
		h.put("3", "유인나");

		FileOutputStream fos = new FileOutputStream("c:\\doc\\out5.txt");// String은 감싸줄 수 있음

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(h);// upcast
		oos.close();
		fos.close();

		System.out.println("파일로 내보냈습니다");
	}

}
