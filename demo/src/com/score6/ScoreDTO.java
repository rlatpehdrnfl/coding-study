
package com.score6;

public class ScoreDTO { // DTO [Data Transfer Object] : 데이터를 DB에 전달해주는 역할

	// 사용자한테 5개 데이터 받았는데 어디에가 넣어야할지 모를땐 무조건 DTO!!! => 객체생성해야함

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	// 집어넣을 땐 위에 5개의 데이터
	// 꺼내올 땐 8개의 데이터
	private int tot;
	private int ave;
	private int rank;

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

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAve() {
		return ave;
	}

	public void setAve(int ave) {
		this.ave = ave;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {

		String str;
		str = String.format("%8s %8s %4d %4d %4d %4d %4d %4d", hak, name, kor, eng, mat, tot, ave, rank);

		return str;
	}

	public void setmovieNo(int int1) {
		// TODO Auto-generated method stub

	}

	public void setmovieName(String string) {
		// TODO Auto-generated method stub

	}

	public void setmovieGenre(String string) {
		// TODO Auto-generated method stub

	}

	public void setmovieTime(String string) {
		// TODO Auto-generated method stub

	}

	public void setmovieSub(String string) {
		// TODO Auto-generated method stub

	}

}
