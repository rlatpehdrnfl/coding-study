package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규화 표현식
/*
 * c[a-z]* : c로 시작하는 영단어(c,c,cde)
 * c[a-z] : c로 시작하는 두개의 단어(ca,cf)
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

			// [\\w]+ : 한 글자 이상의 영,숫자
			// (\\,[\\ㅈ]+) : 괄호안에 있는 것은 반드시 한번은 사용
			// \\. : 도트는 반드시 와야함

			String pat = "[\\w]+@[\\w]+(\\.[\\w]+)";

			for (String ss : mail) {
				if (Pattern.matches(pat, ss)) {
					System.out.println(ss);
				}
			}

		}
	}
}
