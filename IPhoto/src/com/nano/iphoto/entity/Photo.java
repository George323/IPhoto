package com.nano.iphoto.entity;

public class Photo {
	private int photoID;
	private int albumID;
	private String suffix;
	private int state;

	public Photo() {
		super();
	}

	public Photo(int photoID, int albumID, String suffix, int state) {
		super();
		this.photoID = photoID;
		this.albumID = albumID;
		this.suffix = suffix;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Photo [photoID=" + photoID + ", albumID=" + albumID
				+ ", suffix=" + suffix + ", state=" + state + "]";
	}

	public int getPhotoID() {
		return photoID;
	}

	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}

	public int getAlbumID() {
		return albumID;
	}

	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
