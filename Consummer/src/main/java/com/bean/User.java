package com.bean;

import java.io.Serializable;

public class User implements Serializable{

	private String userId;
	private Integer userAge;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}


}
