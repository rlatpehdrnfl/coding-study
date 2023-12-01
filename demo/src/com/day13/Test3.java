package com.day13;

//Interface

//추상클래스의 일종 정의(선언)만 있고 코딩이 없다
// public static final변수만 정의할 수 있다
//인터페이스를 구현(상속)하기 위해서는 implement를 사용한다
//하나이상의 인터페이스를 implements한 클래스는 인터페이스의 모든 메소드를 오버라이드(재정의)해야한다
//인터페이스가 다른 인터페이스를 상속받을 수 있으며 이때는 implement가 아닌 extends를 사용한다
//클래스와는 다르게 인터페이스는 다중 구현이 가능하다

interface Fruit {

	String Won = "원";// public static final이 생략됨 //인터페이스에서 선언된 변수는 자동으로 public static final로 간주

	int getPrice(); // public abstract 생략

	public String getName(); // abstract 생략

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {

		return 1000;
	}

	@Override
	public String getName() {

		return "사과";
	}

	public String getItems() {
		return "과일";

	}

}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();

		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);

		Fruit ob2 = ob1; // upcast
		System.out.println(ob2.getName());
		// System.out.println(ob2.getItem); //부모에서 자식에게 접근할 수 없삼

	}

}
