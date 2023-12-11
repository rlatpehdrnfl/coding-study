package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test7 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String host;

		System.out.println("호스트[www.naver.com]: ");
		host = br.readLine();

		InetAddress ia = InetAddress.getByName(host);
		System.out.println("ip주소: " + ia.getHostAddress());
		System.out.println("호스트: " + ia.getHostName());

		// http://www.naver.com
		// http : protocol(통신규약), FTP,NNTP,SMTP,POP3
		// hyper text transfer protocol
		// naver.com : domain
		// www: host domain
		// DNS : 주소를 분해

	}

}
