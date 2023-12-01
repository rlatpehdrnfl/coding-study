package com.day12;

//추상클래스
//Selection Sort 정렬

abstract class SortInt {

	private int[] value;

	protected abstract void sorting();// 추상메소드

	public void sort(int[] value) {
		this.value = value;// 여기서의 this는 SortInt클래스의 인스턴스 변수 value

		sorting();// 추상 메소드 호출
	}

	public int length() {// 배열 갯수 확인하는 메소드 : 배열이 할당되지 않았다면 아래의 블록을 실행
		// 배열이 할당되었다면 배열의 길이를 반환
		if (value == null) {
			return 0;// 0이 false
		}
		return value.length;// 배열은 length에 괄호가 없음

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
	protected final void swap(int i, int j) { // final :이 메소드는 하위 클래스에서 재정의 할 수 없음
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

	public void print() {

		if (value == null) {
			return; // 현재 메소드를 종료하고 호출한 곳으로 돌아가는 역할
		}
		for (int su : value) {// 배열의 각 요소를 'su'에 순서대로 대입하여 반복

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
