package com.day18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamReader

//1byte문자를 2byter Stream으로 변환해 주는 Stream

public class Test4 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("문자열?");

		Reader rd = new InputStreamReader(System.in);
		Writer wr = new OutputStreamWriter(System.out);

		while ((data = rd.read()) != -1) {
			wr.write(data);
			wr.flush();// 데이터가 꽉 찰때까지 기다렸다가 꽉 차면 내보냄. 그래서 flush 써줘야 함 그래야 buffer가 꽉차지 않아도 내보내짐
		}
	}

}
