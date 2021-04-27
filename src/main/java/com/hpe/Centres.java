package com.hpe;

public class Centres {
	
	private String centreName;
	private String latitude;
	private String longitude;
	public String getCentreName() {
		return centreName;
	}
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @param centreName
	 * @param latitude
	 * @param longitude
	 */
	public Centres(String centreName, String latitude, String longitude) {
		super();
		this.centreName = centreName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	

}
