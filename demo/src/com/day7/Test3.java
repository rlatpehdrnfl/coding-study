
package com.day7;

class SubClass{ //class는 예약어이기 때문에 class는 만들 수 없음
// main을 제외한 다른 클레스는 public을 쓰면 안됨
	
	int a,b;

}

public class Test3 {

	public static void main(String[] args) {

		//하나의 파일에 클레스를 여러개 만들 수 있음
		
		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);

		ob1.a = 10;
		ob1.b = 20;
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
		
		System.out.println("ob2.a: " + ob2.a);	
		System.out.println("ob2.b: " + ob2.b);
		
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("ob2.a: " + ob2.a);	//객체를 두번 생성하면 저장공간은 따로 쓴다
		System.out.println("ob2.b: " + ob2.b);
		
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob1.b: " + ob1.b);
		
	}

}
//Com ob = new Com();
//Stack 영역 : 자주 쓰는 것들 / Com ob
//Heap 영역 : 큼지막한 것들 / new Com ob();
// 메모리 공간이 Heap영역이 더 큼
//같은 클레스를 여러번 생성할때 가지고 있는 메소드는 heap영역 안 메소드 영역에 있음
//메소드는 수십만개를 똑같은 작업 별도로 1개만 만들어 공용으로 사용