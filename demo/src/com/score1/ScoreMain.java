package com.score1;

public class ScoreMain {

	public static void main(String[] args) {

		//객체 생성
		Score ob = new Score();
		
		ob.set();
		//외부에서 접근 가능 but 에러 생김
		//ob.inwon;
		ob.input();
		//ob.ranking();
		ob.print();

	}

}
