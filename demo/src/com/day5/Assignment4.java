package com.day5;

import java.util.Iterator;

public class Assignment4 {

	public static void main(String[] args) {


		// ��Ʈ : �ٱ��� for���� 2�� ���ƾ� �Ѵ�
		//        2~5,6~9���� ������� ��


		for(int a = 2;a <= 9;a+=4 )
			
			for (int j = 1; j <=9; j++) {

				for (int i = a; i <=a+3; i++) {

					int k = i * j;

					System.out.printf("%2d x %2d = %2d \t", i, j, k);
				}
				System.out.println();
			}
		System.out.println();
		
	}
}

/*

for (int i = 2; i <= 9; i += 4) {
    // 4�ܾ� ���
    for (int j = 1; j <= 9; j++) {
        for (int k = i; k < i + 4 && k <= 9; k++) {
            System.out.printf("%d x %d = %2d\t", k, j, k * j);
        }
        System.out.println();
    }
    System.out.println(); // �� 4�ܸ��� �� �� ����
}
}
}

		*/