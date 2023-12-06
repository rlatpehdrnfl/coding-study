package com.day17;

//����ȭ

class MyThread8 implements Runnable {

	private int bank = 10000;

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // bank = bank - m;

		return m;// ���� �ܾ�
	}

	@Override
	public void run() {

		int moneyNeed = 6000;// ������ �ݾ�
		int money;
		String msg = "";

		try {

			synchronized (this) {// ����ȭ �۾� : �����峢�� �ϳ��� �����͸� ������ ����� �� �����Ϸ��� ���� ���� ���ؼ� ��

				if (getBank() >= moneyNeed) {

					money = drawMoney(moneyNeed);
					msg = "���� ����!";

				} else {

					money = 0;
					msg = "�������!";

				}
			}

			System.out.println(Thread.currentThread().getName() + msg + ", ����ݾ�" + money + ", �ܰ�: " + getBank());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();

		Thread ob1 = new Thread(ob);// ��ü �����ϸ� ���� 2�� �׷��� ob�� �־��ָ� ����1���� �о���
		Thread ob2 = new Thread(ob);

		ob1.start();
		ob2.start();

	}

}
