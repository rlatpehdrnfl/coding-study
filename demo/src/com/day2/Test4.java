package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
// class�� �����ؼ� ��� but ������ ��� �Ұ����ϴ�.
	
	public static void main(String[] args) throws IOException {
		
		// IOException : ����ڿ��� ������ �߻��� �� �ִٴ� �� client���� �˷���
		// ����� ������ �����ϴ� ��.(���� ������~)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ����ڰ� �Է��� ���� �о ������ ���� ��ǰ
		
		// System.in (�ý����̶�� Ŭ���� �ȿ� ����ִ� �żҵ�. out�� ��� in�� ����)
		// System.in : Ű���带 ���� 1byte�� �Է¹���
		// InputStreamReader : System.in���� �о�� 1byte�� ����(2byte)�� ����
		// BufferedReader : ó���ӵ��� ���̴� �������
		
		int r;
		double area, length;
		
		System.out.print("������?");//10
		
		r = Integer.parseInt(br.readLine()); //����ȯ : ���ڸ� ���ڷ� �ٲٴ� ��
		// bufferedreader��� Ŭ���� �ȿ� readLine�̶�� �޼ҵ�.
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("������:" + r + ", ����:" + area);
		
		System.out.printf("������:%d, �ѷ�:%.2f",r,length);
		

	}

}
