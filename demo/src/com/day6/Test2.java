package com.day6;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		//1~45까지의 수중 6개의 난수를 발생시켜 크기순으로 정렬(LOTTO)

		Random rd = new Random();		//new가 들어가있으면 객체생성(메모리 할당 받았다)
		int[] num = new int[6];

		int i,j,n,temp;

		n=0;

		while(n<6) {					//몇번을 반복해야하는지 몰라서 while문 쓰는 것

			num[n] = rd.nextInt(45)+1;

			for(i=0;i<n;i++) {//난수가 똑같은 값이 나올 때 새로운 값이 나오게 함

				if(num[i]==num[n]) {
					n--;
					break;

				}
			}
			n++;
		}

		//정렬
		for(i=0;i<num.length-1;i++) {			//selection sort 공식은 두 줄 정도 암기

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

					
				}
			}
		}

		//출력
		for(int su : num) {
			System.out.printf("%4d",su);  //랜덤은 중복이 발생할 수 있음
		}


	}

}
