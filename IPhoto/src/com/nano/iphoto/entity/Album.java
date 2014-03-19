package com.nano.iphoto.entity;

public class Album {
	
	private int albumID;
	private int type;
	private String name;
	private int userID;
	private int state;
	
	public Album() {
		super();
	}
	
	public Album(int albumID, int type, String name, int userID,
			int state) {
		super();
		this.albumID = albumID;
		this.type = type;
		this.name = name;
		this.userID = userID;
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "Album [albumID=" + albumID + ", type=" + type + ", name="
				+ name + ", userID=" + userID + ", state=" + state + "]";
	}
	
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	

}
