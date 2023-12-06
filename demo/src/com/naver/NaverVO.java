package com.naver;

public class NaverVO {

	private String ID;
	private String PW;
	private String PW2;
	private String Name;
	private String Gender;
	private String Birth;
	private String Email;
	private String Tel;

	@Override
	public String toString() {
		return "NaverVO [ID=" + ID + ", PW=" + PW + ", Name=" + Name + ", Gender=" + Gender + ", Birth=" + Birth
				+ ", Email=" + Email + ", Tel=" + Tel + "]";
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public String getPW2() {
		return PW2;
	}

	public void setPW2(String pW2) {
		PW2 = pW2;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}
}
