package com.day17;

//동기화

class MyThread8 implements Runnable {

	private int bank = 10000;

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // bank = bank - m;

		return m;// 인출 잔액
	}

	@Override
	public void run() {

		int moneyNeed = 6000;// 인출할 금액
		int money;
		String msg = "";

		try {

			synchronized (this) {// 동기화 작업 : 스레드끼리 하나의 데이터를 나눠서 사용할 때 점유하려는 것을 막기 위해서 씀

				if (getBank() >= moneyNeed) {

					money = drawMoney(moneyNeed);
					msg = "인출 성공!";

				} else {

					money = 0;
					msg = "인출실패!";

				}
			}

			System.out.println(Thread.currentThread().getName() + msg + ", 인출금액" + money + ", 잔고: " + getBank());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();

		Thread ob1 = new Thread(ob);// 객체 생성하면 은행 2개 그래서 ob를 넣어주면 은행1개를 털어줌
		Thread ob2 = new Thread(ob);

		ob1.start();
		ob2.start();

	}

}
