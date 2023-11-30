package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String str;


		System.out.print("수를 입력하시오"); //30
		num = Integer.parseInt(br.readLine());


		//삼항연산자
		//조건?true:false
		str = num%2==0?"짝수":"홀수";
		// = 대입연산자 ==같다

		str = num>0?"양수":(num<0?"음수":"0");
		// str에서 기존의 짝수를 지우고 양수가 덮어 씌워짐 -> 마지막으로 양수 출력

		if(num>0) {
			str = "양수";
		}else if(num<0) {
			str = "음수";
		}else {
			str = "영";
		} 

		str = num%4==0 && num%100!=0 || num%400==0 ? "윤년" : "평년";
		//and(&&),or(||) / 항상 and부터 연산이 됨
		//윤년 평년은 암기~

		System.out.println(str);






	}

}
