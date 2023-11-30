package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su,sum;  //su, sum에는 쓰레기값
		char ch;
		
		while(true) {
			
			do {
				System.out.print("원하는 수?[1~500]?"); //100e(10,13) //e100
				su = Integer.parseInt(br.readLine()); 	//e를 없애서 100만 저장
				//br.readline()은 엔터 전까지만 읽음! e를 못 읽어서 null. 이걸 숫자로 바꾸려해서 오류가 남
			}while(su<1||su>500);						//do while문의 조건을 붙일때는 뒤에 (안돼요!)붙이ㅣ
														//false면 빠져나옴
		
			//초기화는 연산작업을 해주기 전에 하는게 좋음
			sum=0;
			for(int i=1;i<=su;i++) {
				sum = sum + i;
			}
			
			System.out.println("1~" + su + "까지의 합: " + sum);
			
			
			System.out.print("계속할래[Y/N]?");//y,Y,n,N -> y,Y일때만 반복 나머지일때는 종료
												 //y,e엔터(10,13)
			ch = (char)System.in.read();		 //e를 지울 수 없음 (BufferedReader는 지울 수 있음)
			
			if(ch!='y'&&ch!='Y') { ////암기 : 양쪽이 부정이면 or가 아니라 and
				break;
			}
			
			System.in.skip(2); //e(10,13)를 지우기 위해
			//이런 문제는 System.in.read()일 때 문제가 생김
			
		}//end..while(true)
		
		
	}

}
