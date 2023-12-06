package com.day17;

//������ �����ֱ�

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("������ ����...");

			System.out.println("�켱����: " + this.getPriority());// this�� ��������
			System.out.println("������ �̸� : " + this.getName());// �⺻�� ������ 5

			sleep(500);

			setPriority(2);
			System.out.println("����� �켱����: " + getPriority());

			System.out.println("������ ����...");

		} catch (Exception e) {

		}

	}

}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();// ���� ������(main)�� �̸��� ����ִ� ��
		Thread t2 = new MyThread6();

		System.out.println("���� ������ �켱����: " + t1.getPriority());
		System.out.println("���� ������ �̸�: " + t1.getName());
		System.out.println("t2 ������ ������ ����: " + t2.isAlive());// ����ֳİ� ����°�

		t2.start();

		System.out.println("t2�켱����: " + t2.getPriority());

		t2.setPriority(1);

		try {

			Thread.sleep(100);// main �� 0.1�� ����!!

			System.out.println("t2 ����ֳ�?: " + t2.isAlive());

			Thread.sleep(1000);// main�� �� 1�� ����!

			System.out.println("1�� �� t2����ֳ�?: " + t2.isAlive());

			t2.join();// main ��ٷ�

			System.out.println("t2����ֳ�?: " + t2.isAlive());

		} catch (Exception e) {

		}

	}

}
