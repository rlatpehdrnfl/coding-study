package com.day3;

import java.io.BufferedReader;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// throws IOException
		//�Ѱ��� ���ڸ� �Է¹��� �� ����
		// char ch = 'a';//97�̶�� ��ȣ, ��ȣ�� �Է�
		// �ϳ��� �ƽ�Ű ���� �� �� ����
		
		// System.out.println(ch);//a
		// System.out.println(Integer.toString(ch));//97
		
		char ch,result;
		
		System.out.print("�Ѱ��� ����");//a(97(��ȣ))
		//���� ����ȯ
		ch = (char)System.in.read();   //-> int �������� ����.
		//System.in : Ű����� �Է��� �ϳ��� 1byte���ڸ� �Է¹���
				
		System.out.println(ch);
		/////////System.out.println(Integer.toString(ch));

		result = ch>=65 && ch<=90 ? (char)(ch+32) : (ch>='a' && ch<='z'?(char)(ch-32):ch);
				// char�� ����Ÿ�Կ� ���� -> (char)������ ��ȯ �� �ϴ°���?
		
		System.out.println(ch + "->" + result);
		
		//���� : Ŀ���� ������ �̵� : CR + Ŀ���� �������� �̵� : LF

		
	
	}

}
