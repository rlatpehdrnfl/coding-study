package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test7 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String host;

		System.out.println("ȣ��Ʈ[www.naver.com]: ");
		host = br.readLine();

		InetAddress ia = InetAddress.getByName(host);
		System.out.println("ip�ּ�: " + ia.getHostAddress());
		System.out.println("ȣ��Ʈ: " + ia.getHostName());

		// http://www.naver.com
		// http : protocol(��űԾ�), FTP,NNTP,SMTP,POP3
		// hyper text transfer protocol
		// naver.com : domain
		// www: host domain
		// DNS : �ּҸ� ����

	}

}
