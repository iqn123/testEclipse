package com.woniuxy.entities;

public class UserInfoChange {

	private Integer uid;
	private String upinfo;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUpinfo() {
		return upinfo;
	}
	public void setUpinfo(String upinfo) {
		this.upinfo = upinfo;
	}
	@Override
	public String toString() {
		return "UserInfoChange [uid=" + uid + ", upinfo=" + upinfo + "]";
	}
	
	
}
