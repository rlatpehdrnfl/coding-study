package com.day17;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//TimerTask

public class Test9 extends Thread {

	private int num = 0;

	public Test9() {

		TimerTask task = new TimerTask() {// �߻�Ŭ������

			@Override
			public void run() {
				num = 1;// 5�ʸ��� �ʱ�ȭ�ؼ� 1�� �ٲٴ� ��

			}
		};

		Timer t = new Timer();
		Calendar d = Calendar.getInstance();

//		���� 0��0��0�� ���� �Ϸ翡 �ѹ��� �ݺ�
//		d.add(Calendar.DATE,1);
//		d.set(Calendar.HOUR,0);//12�� ���� //���� 1�ú��� �ϰ� ������ 13
//		d.set(Calendar.MINUTE,0);
//		d.set(Calendar.SECOND,0);
//		d.set(Calendar.MILLISECOND,0);
//		
//		t.schedule(task,d.getTime(),1000*60*60*24);//�и�������,��,��,��

		t.schedule(task, d.getTime(), 5000);// ���� ������ �ð����� 5�ʸ��� �� �۾�(num�� 1�� �ʱ�ȭ�ϴ� ��)�� ������

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
