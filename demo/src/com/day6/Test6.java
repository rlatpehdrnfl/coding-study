package com.day6;

public class Test6 {

	public static void main(String[] args) {

		int[][]  a = {{5,6,7},{3,4,5},{7,8,9}};
		int[][]  b = {{6,7,8},{1,2,3},{4,5,6}};
		int[][] sum = new int[3][3];
		
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				sum[i][j] = a[i][j] + b[i][j];
				
				System.out.printf("%4d",sum[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
