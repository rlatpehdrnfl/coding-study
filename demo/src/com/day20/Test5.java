package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//����ȭ ǥ����
/*
 * c[a-z]* : c�� �����ϴ� ���ܾ�(c,c,cde)
 * c[a-z] : c�� �����ϴ� �ΰ��� �ܾ�(ca,cf)
 * c[a-zA-Z0-9] : ca,cA,c9
 *  
 */
public class Test5 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "ca", "c.", "c0", "car", "combat", "count", "date",
				"disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}

		}

		System.out.println("------------");
		p = Pattern.compile("c[a-z]+");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}
		}
		System.out.println("------------");
		p = Pattern.compile("c.");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);

			}
			System.out.println("------------");

			String[] mail = { "aaa@aaa.com", "@@aaa.co.kr", ".bbb@.com", "aaa@vvv.co.kr", "sss.co.kr", "abc@abc" };

			// [\\w]+ : �� ���� �̻��� ��,����
			// (\\,[\\��]+) : ��ȣ�ȿ� �ִ� ���� �ݵ�� �ѹ��� ���
			// \\. : ��Ʈ�� �ݵ�� �;���

			String pat = "[\\w]+@[\\w]+(\\.[\\w]+)";

			for (String ss : mail) {
				if (Pattern.matches(pat, ss)) {
					System.out.println(ss);
				}
			}

		}
	}
}
