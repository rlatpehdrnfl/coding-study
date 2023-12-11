package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {

	public static String replaceAll(String str, String oldStr, String newString) {
		if (str == null) {
			return null;
		}

		Pattern p = Pattern.compile(oldStr);// ����

		Matcher m = p.matcher(str);

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, newString);
		}

		m.appendTail(sb);
		return sb.toString();

	}

	public static void main(String[] args) {

		String str = "�츮���� ���ѹα� ���ѵ��� ���� ������ �Ǿ�...";

		String s = Test6.replaceAll(str, "����", "����");

		System.out.println(s);

	}

}
