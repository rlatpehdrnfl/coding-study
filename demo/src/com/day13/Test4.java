package com.day13;

interface Test {

	public int total();// abstract가 생략됨

	public void write();// abstract가 생략됨

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() {
	}

	// 생성자 오버로딩
	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	// 메소드
	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + ", " + name + ", " + total());// 메서드에서 메서드 호출할 수 있다
	}

	@Override
	public boolean equals(Object ob) {// 오버라이드 했기 때문에 object꺼 안쓰고자기거 씀 ///UPCAST
		// equals(ob2) - TestmImpl

		boolean flag = false;// 지역변수의 초기값은 쓰레기값

		if (ob instanceof TestImpl) {// instanceof 가면을 벗김

			TestImpl t = (TestImpl) ob;// DOWNCAST ///t=ob2

			if (this.hak.equals(t.hak) && t.name.equals(this.name)) {// this는 ob1, t = ob2
				flag = true;//String의 .equals
			}

		}
		return flag;

	}

}

public class Test4 {

	public static void main(String[] args) {

		TestImpl ob1 = new TestImpl("111", "배수지", 80, 90);
		TestImpl ob2 = new TestImpl("111", "배수지", 100, 100);

		if (ob1.equals(ob2)) {// Object꺼(.equals 는 ==와 같다) --> 내꺼  //내가만든 .equals
			System.out.println("ob1과 ob2는 동일인물...");
		} else {
			System.out.println("ob1과 ob2는 안동일인물...");
		}

		ob1.write();
		ob2.write();

	}

}
