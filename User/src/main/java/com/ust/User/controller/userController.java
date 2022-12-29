package com.ust.User.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.User.dto.Labourer;
import com.ust.User.model.UserModel;
import com.ust.User.service.userService;

@RestController
@RequestMapping("api/user")
public class userController {

	@Autowired
	private userService userService;

	@PostMapping("/register")
	public UserModel addUser(@RequestBody UserModel user) {
		return userService.createUser(user);

	}

	@GetMapping("/show/users")
	public List<UserModel> getallusers(){
	return userService.getusers();

	}

	@GetMapping("/show/users/{id}")
	public UserModel getUsersById(@PathVariable int id) {
	return userService.getUsersById(id);

	}

	@PutMapping("/update/user")
	public UserModel updateUser(@RequestBody UserModel user) {
	return userService.updateUser(user);

	}

	@DeleteMapping("/delete/user/{id}")
	public String deleteUserById(@PathVariable int id) {
	return userService.deleteUserById(id);

	}
	@GetMapping("/getLabour")
	public List<Labourer> getLabour() {
		return userService.getLabourDetails();
	}

}
