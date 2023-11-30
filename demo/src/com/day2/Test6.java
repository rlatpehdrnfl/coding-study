package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int width, height;
		double area; //float
		
		System.out.print("width?");
		width = Integer.parseInt(br.readLine());
		
		System.out.print("height?");
		height = Integer.parseInt(br.readLine());
		
		area = (width * height) /2.0; //f주면 float으로도 인식 가능함
		
		System.out.printf("area = %g",area);
		
		//삼각형의 면적을 구하시오
		//밑변(width) : 10
		//높이(height) : 20
		//넓이(area) : xxx
		//넓이 = 밑변*높이/2
		
		// printf에서 쓰는 기호
		//%d : int
		//%s : String
		//%f : float
		//%g : double		

	}

}
