package com.day17;

class MyThread1 extends Thread {// 스레드 구현하는 법1. 2.Runnable Interface

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

//스레드 메소드
	@Override
	public void run() {

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + ":" + name + i);// this는 Mythread

			i++;

			try {

				sleep(1000);// 1000은 1초

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}

public class Test1 {

	public static void main(String[] args) {// main도 스레드

		System.out.println("main 시작...");

		MyThread1 t1 = new MyThread1(100, "첫번째: ");
		MyThread1 t2 = new MyThread1(200, "두번째: ");

		t1.start();// 스레드가 실행(run()호출)
		t2.start();

		System.out.println("main 종료...");

	}
}

//스레드(Thread)
//
//  - 스레드 => 프로세스 내부에서 실행되는 명령 모임
//
//  - 단일스레드 : main 메소드만을 이용하여 프로그램을 작성
//
//    => main 메소드가 종료되면 프로그램도 종료된다.
//
//    => 명령이 하나의 흐름으로만 구성 : 동시에 명령을 실행할 수 없다.
//
//  - 다중스레드 : main 메소드뿐만 아니라 다른 메소드에서도 동시에 명령이 실행
//
//    => 실시간으로 데이타를 보여주는 프로그램을 만들때 사용
//
//    => 게임, 채팅, 주식프로그램 등
//
//    => 모든 스레드가 종료되어야지만 프로그램도 종료된다.
//
//  - 다중스레드 프로그램 작성 방법
//
//   1. java.lang 패키지의 Thread 클래스를 사용하는 방법
//
//      1) Thread 클래스를 상속 받는 자식클래스를 작성한다.
//
//      2) Thread 클래스에 선언된 run() 메소드를 오버라이딩 한다.
//
//         => main() 메소드와 동시에 실행될 수 있는 명령을 작성 
//
//         => main 스레드와 별개로 실행되는 스레드를 작성
//    
//      3) 자식클래스를 이용하여 객체를 생성한다. => 스레드 생성
//
//      4) 객체를 이용하여 start()메소드를 호출한다. => run() 메소드가 호출되면서 스레드가 실행
//
//      ※ run()메소드로 호출하면 일반 메소드 호출과 동일하다.     
//
//   2. java.lang 패키지의 Runnable 인터페이스를 사용하는 방법   
//
//      => java에서는 다중상속을 지원하지 않으므로 Thread 클래스를 상속받지 못하는 경우가 있다.
//         이럴 경우에는 Runnable 인터페이스를 상속 받아 사용한다.
//
//      1) Runnable 인터페이스를 상속 받는 자식클래스를 작성한다.
//
//      2) Runnable 인터페이스에 선언된 run() 메소드를 오버라이딩 한다.
//
//      3) 자식클래스를 이용하여 객체를 생성한다. 
//
//      4) 자식클래스로 만든 객체를 활용하여 Thread 객체를 생성한다. => Thread 생성
//
//      5) Thread 객체를 이용하여 start()메소드를 호출한다.
//
//  - Thread 실행 우선순서 지정
//
//    => Thread객체.setPriority(int newPRIORITY)메소드를 이용
//
//  - Thread 제어
//
//    => start() 메소드 : Thread 실행
//
//    => stop() 메소드 : Thread 중지
//
//    => destroy() 메소드 : Thread 소멸 
//
//    => sleep() 메소드 : 1/1000초 단위로 실행속도를 조절할 수 있다.
//
//    => suspend() 메소드 : 스레드을 일시 정지 - wait() 메소드
//
//    => resume() 메소드 : suspend() 메소드로 중지된 스레드를 다시 실행한다. - notify() 메소드 
//
//
//● 스레드 동기화
//
//  - 다중스레드 프로그램의 문제점
//
//    => 스레드는 독립적으로 명령을 실행하는데 이 때 각각의 스레드가 동시에 공유된 데이타에 접근할 
//       경우 데이타 처리에 오작동이 발생할 수 있다.
//
//  - 동기화 => 스레드가 공유된 데이타를 처리할 경우 먼접 접근한 스레드가 다른 스레드의 접근을
//              차단하기 위해 Lock를 걸어주는 기능
//
//  - 동기화 방법
//
//    1) 공유된 데이타를 처리하는 메소드를 동기화 시키는 방법
//
//       형식) synchronized 반환형 메소드명(매개변수,...)
//             {
//                  공유데이타를 처리하는 명령;
//             }
//
//    2) 공유된 데이타를 처리하는 메소드를 호출하는 영역을 동기화 시키는 방법
//
//       형식) synchronized(객체명)   => 공유된 데이타를 포함하고 있는 객체 
//             {
//                   객체명.메소드명(값,..);//공유된 데이타를 처리하는 메소드
//             }
