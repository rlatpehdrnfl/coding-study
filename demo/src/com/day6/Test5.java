package com.day6;

public class Test5 {

	public static void main(String[] args) {
		
		//�迭�� �迭
		int[][] arr = new int[6][6];
		
		int i,j,n;
		
		n=0;
		
		for(i=0;i<5;i++) {
			
			for(j=0;j<5;j++) {
				
				//System.out.println(i + ":" + j);
				
				n++;
				arr[i][j] = n;
				
				arr[i][5] += n;
				arr[5][j] += n;
				arr[5][5] += n;
				
			}
			
		}
		
		//���
		for(i=0;i<arr.length;i++) {
			
			for(j=0;j<arr.length;j++) {
				
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
