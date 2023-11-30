package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args)  {

		/*5. 단가 15,800짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.

		할인율은 다음과 같습니다.
		10개 이상 -> 10%
		20개 이상 -> 15%
		30개 이상 -> 20%
		판매금액을 계산해봅니다.
		예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원


		 */

		Scanner sc = new Scanner(System.in);

		int quantity,price;


		price = 15800;

		System.out.print("수량을 입력하세요");
		quantity = sc.nextInt();


		if(quantity<10) {
			price = (price * quantity);
		}
		if(quantity>=10) {			
			price = (price * quantity)/10;
		}if(quantity>=20) {
			price = (price * quantity)/15;
		}if(quantity>=30) 	 {
			price = (price * quantity)/20;
		}
		System.out.print("구입 수량: " + quantity + "개, 판매 총 금액: " + price + "원");







	}








}


