package com.nano.iphoto.entity;

public class User {

	private int userID;
	private String name;
	private String pwd;
	private int state;
	private int gender;
	private String logo;
	private int integral;

	public User() {
		super();
	}

	public User(int userID, String name, String pwd, int state, int gender,
			String logo, int integral) {
		super();
		this.userID = userID;
		this.name = name;
		this.pwd = pwd;
		this.state = state;
		this.gender = gender;
		this.logo = logo;
		this.integral = integral;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", pwd=" + pwd
				+ ", state=" + state + ", gender=" + gender + ", logo=" + logo
				+ ", integral=" + integral + "]";
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

}
