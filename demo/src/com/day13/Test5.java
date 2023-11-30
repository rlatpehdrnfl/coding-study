package com.day13;

import java.util.Scanner;

interface FruitA {

	String Won = "원"; // public static abstract

	public int getPrice();

	public String getName();

}

interface ItemFruit extends FruitA {

	public String getItems();

}

class Orange implements ItemFruit {

	@Override
	public int getPrice() {

		return 1000;
	}

	@Override
	public String getName() {

		return "오렌지";
	}

	@Override
	public String getItems() {

		return "과일";
	}

}

class Apple implements ItemFruit {

	@Override
	public int getPrice() {

		return 2000;
	}

	@Override
	public String getName() {

		return "사과";
	}

	@Override
	public String getItems() {

		return "과일";
	}

}

public class Test5 {

	public void packing(ItemFruit ob) {

		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Test5 t = new Test5();// 패킹을 쓰기 위해서는 객체를 생성해야 함/인스턴스 메소드기 때문

		System.out.println("1.사과 2.오렌지?");// 1,2
		int n = sc.nextInt();

		if (n == 1) {
			t.packing(new Apple());
		} else if (n == 2) {
			t.packing(new Orange());
		}

		/*
		 * // Orange ob2 = new Orange(); ItemFruit ob; // ob1 = ob2;
		 * 
		 * ob = new Orange();
		 * 
		 * System.out.println(ob.getItems()); System.out.println(ob.getName());
		 * System.out.println(ob.getPrice() + FruitA.Won);
		 * 
		 * ob = new Apple(); System.out.println(ob.getItems());
		 * System.out.println(ob.getName()); System.out.println(ob.getPrice() +
		 * FruitA.Won);
		 * 
		 * int a; a = 10; System.out.println(a);// 10
		 * 
		 * a = 20; System.out.println(a);// 20
		 */

	}

}
