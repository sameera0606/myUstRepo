package com.ust.User.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class UserModel {
	    @Id
	    @GeneratedValue
	    private int id;
	 
	    @NotNull
	    private String userName;
	    
	    @Email(message = "invalid email address")
	    private String email;
	    @NotNull
	    private String location;
	    
	    @NotNull(message = "mobileNumber is invalid")
	    @Size(min = 10, max = 10, message="invalid mobile number")
	    private String mobileNumber;
	    
	    @NotNull
	    private String requirement;
	    
	    public UserModel()
	    {
	    	
	    }
	    
		public UserModel(int id,String email, String userName, String location, String mobileNumber, String requirement) {
			super();
			this.id = id;
			this.userName = userName;
			this.email=email;
			this.location = location;
			this.mobileNumber = mobileNumber;
			this.requirement = requirement;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getRequirement() {
			return requirement;
		}
		public void setRequirement(String requirement) {
			this.requirement = requirement;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
	
	
}
