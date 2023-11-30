package com.day13;

interface Test {

	public int total();// abstract�� ������

	public void write();// abstract�� ������

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() {
	}

	// ������ �����ε�
	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	// �޼ҵ�
	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + ", " + name + ", " + total());// �޼��忡�� �޼��� ȣ���� �� �ִ�
	}

	@Override
	public boolean equals(Object ob) {// �������̵� �߱� ������ object�� �Ⱦ����ڱ�� �� ///UPCAST
		// equals(ob2) - TestmImpl

		boolean flag = false;// ���������� �ʱⰪ�� �����Ⱚ

		if (ob instanceof TestImpl) {// instanceof ������ ����

			TestImpl t = (TestImpl) ob;// DOWNCAST ///t=ob2

			if (this.hak.equals(t.hak) && t.name.equals(this.name)) {// this�� ob1, t = ob2
				flag = true;//String�� .equals
			}

		}
		return flag;

	}

}

public class Test4 {

	public static void main(String[] args) {

		TestImpl ob1 = new TestImpl("111", "�����", 80, 90);
		TestImpl ob2 = new TestImpl("111", "�����", 100, 100);

		if (ob1.equals(ob2)) {// Object��(.equals �� ==�� ����) --> ����  //�������� .equals
			System.out.println("ob1�� ob2�� �����ι�...");
		} else {
			System.out.println("ob1�� ob2�� �ȵ����ι�...");
		}

		ob1.write();
		ob2.write();

	}

}
