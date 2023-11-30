package com.day12;

//Singleton
//객체를 계속해서 생상하는것이 아니라 하나의 객체만 생성하고 공유해서 사용
//calendar now = new getInstance();
///스테틱

class Sing {

	private static Sing ob;

	public static Sing getInstance() {
		if (ob == null) {
			ob = new Sing();

		}
		return ob;
	}
//==주소 비교
}

public class Test2 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();

		if (ob1 == ob2) {
			System.out.println("동일한 객체!!");
		} else {
			System.out.println("안 동일한 객체");
		}
	}

}
