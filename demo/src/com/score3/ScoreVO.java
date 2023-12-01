package com.score3;

public class ScoreVO {// Value Object

	// DB와 연동하면 DTO. 안하면 VO
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;

//	public ScoreVO() {}
//
//	public ScoreVO(String hak, String name, int kor, int eng, int mat) {
//		this.hak = hak;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//	}

	public void set(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
//
//	public void setHak(String hak) {
//		this.hak = hak;
//	}
//
//	public String getHak() {
//		return hak;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//
//	public int getKor() {
//		return kor;
//	}
//
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public void setMat(int mat) {
//		this.mat = mat;
//	}
//
//	public int getMat() {
//		return mat;
//	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}