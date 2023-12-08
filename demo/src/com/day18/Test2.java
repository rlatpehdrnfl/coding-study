package com.day18;

import java.io.OutputStream;

//Stream
//기본 입출력 스트림
//out

public class Test2 {

	public static void main(String[] args) {

		try {

			OutputStream os = System.out;// System.in키보드로 입력한 글자 읽어냄, out은 콘솔창에 띄워주는 역할

			byte[] buffer = new byte[3];// 3자씩 내보내겟다

			buffer[0] = 65;
			buffer[1] = 97;
			buffer[2] = 122;

			os.write(buffer);// buffer : 데이터를 저장하는 저장공간
			os.close();// Stream은 다 쓰면 close 해줘야 함

			System.out.println("나 보이냐?");// 기본 디폴트로 내보낼 수 있는 출입구가 막힘

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
//cahr 형태의 문자 한자씩 내보냄
