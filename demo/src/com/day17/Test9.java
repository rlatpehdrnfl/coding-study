package com.day17;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//TimerTask

public class Test9 extends Thread {

	private int num = 0;

	public Test9() {

		TimerTask task = new TimerTask() {// 추상클래스임

			@Override
			public void run() {
				num = 1;// 5초마다 초기화해서 1로 바꾸는 애

			}
		};

		Timer t = new Timer();
		Calendar d = Calendar.getInstance();

//		내일 0시0분0초 부터 하루에 한번씩 반복
//		d.add(Calendar.DATE,1);
//		d.set(Calendar.HOUR,0);//12시 정각 //오후 1시부터 하고 싶으면 13
//		d.set(Calendar.MINUTE,0);
//		d.set(Calendar.SECOND,0);
//		d.set(Calendar.MILLISECOND,0);
//		
//		t.schedule(task,d.getTime(),1000*60*60*24);//밀리세컨즈,초,분,시

		t.schedule(task, d.getTime(), 5000);// 내가 시작한 시간부터 5초마다 이 작업(num을 1로 초기화하는 것)을 실행해

	}

	@Override
	public void run() {

		while (true) {

			System.out.println(num++);

			try {
				sleep(1000);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {

		// Test9 ob = new Test9();

		// ob.start();

		new Test9().start();

	}

}
