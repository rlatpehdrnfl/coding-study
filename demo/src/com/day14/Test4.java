package com.day14;

//����Ŭ����4(Annoymous, �͸���,������ Ŭ����)
//Ŭ������ ���ϰ�, �Ǵ� �Ű����� �ڸ��� �����
//�޸��� ���� ���̱� ���� 

public class Test4 {

	public Object getTitle() {

		return new Object() {// ���� ����� �ڸ��� Ŭ������ ����

			@Override
			public String toString() {
				return "�͸��� Ŭ����";
			}
		};
	}

	public static void main(String[] args) {// �߻�Ŭ������ �������̽��� �����ϰų� ��ӹ����� ������ �������̵� �϶�� �������� ����

		Test4 ob = new Test4();
		System.out.println(ob.getTitle());

	}

}
