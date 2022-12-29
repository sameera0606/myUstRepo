package com.ust.User.model;

import com.ust.User.dto.Labourer;

public class ResponseDto {

	
	private UserModel userModel;
	private Labourer labourer;
	
	
	public UserModel getUserModel() {
		return userModel;
	}
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
	public Labourer getLabourer() {
		return labourer;
	}
	public void setLabourer(Labourer labourer) {
		this.labourer = labourer;
	}
	
	
}
