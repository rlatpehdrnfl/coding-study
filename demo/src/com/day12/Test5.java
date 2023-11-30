package com.day12;

//추상클래스
//Selection Sort 정렬

abstract class SortInt {

	private int[] value;

	protected abstract void sorting();// 추상메소드

	public void sort(int[] value) {
		this.value = value;

		sorting();
	}

	public int length() {// 배열 갯수 확인하는 메소드
		if (value == null) {
			return 0;// 0이 false
		}
		return value.length;// 배열은 length에 가로가 없음

	}

	protected final int compare(int i, int j) {

		if (value[i] == value[j]) {
			return 0;
		} else if (value[i] > value[j]) {
			return 1;
		} else {
			return -1;
		}

	}

	// 자리바꿈
	protected final void swap(int i, int j) {
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

	public void print() {

		if (value == null) {
			return;
		}
		for (int su : value) {

			System.out.printf("%4d", su);
		}
		System.out.println();
	}
}

class SortTest extends SortInt {

	@Override
	protected void sorting() {

		// Selection Sort //메소드는 부모가 가지고 있더라도 내거를 쓴다
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {

				if (compare(i, j) > 0) {
					swap(i, j);
				}

			}
		}

	}
}

public class Test5 {

	public static void main(String[] args) {

		int[] data = { 50, 30, 60, 20, 10 };

		SortTest ob = new SortTest();

		ob.sort(data);
		ob.print();

	}

}
