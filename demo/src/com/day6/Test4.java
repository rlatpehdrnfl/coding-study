package com.day6;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;

		System.out.print("주민번호[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length()!=14) {		//배열 length만 괄호가 없음. 모든 곳에서의 개수를 세는 length는 괄호가 있음
			System.out.println("입력오류");
			return;//stop
		}

		tot = 0;
		//index : 0 1 2 3 4 5 6 7 8 9 0 1 2 3
		//jumin : 9 4 1 0 1 0 - 2 0 8 7 6 5 4 
		//	chk = 2,3,4,5,6,7,  8,9,2,3,4,5	

		for(i=0;i<12;i++) {

			if(i>=6) {//주민번호 뒷자리
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));


			}else {//생년월일
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));


			}
		}

		su = 11 - tot % 11;
		su = su % 10;

		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("정확한 주민번호");			
		}else {
			System.out.println("틀린 주민번호");
		}

	}

	
}



/*
String str = "seoul Korea";
		//index :     01234567890

		System.out.println(str.substring(0, 3)); //마지막 인덱스에서 항상 -1을 함(seo)
		System.out.println(str.substring(6, 8)); //Ko
		System.out.println(str.substring(6)); //Korea
 */