package com.ust.User.dto;

import java.util.List;

import com.ust.User.model.UserModel;

public class RequestUser {

	private List<UserModel> user;
	private List<Labourer> labour;
	
	
	
	public RequestUser() {
		super();
	}
	public RequestUser(List<UserModel> user, List<Labourer> labour) {
		super();
		this.user = user;
		this.labour = labour;
	}
	public List<UserModel> getUser() {
		return user;
	}
	public void setUser(List<UserModel> user) {
		this.user = user;
	}
	public List<Labourer> getLabour() {
		return labour;
	}
	public void setLabour(List<Labourer> labour) {
		this.labour = labour;
	}
	
	
}
