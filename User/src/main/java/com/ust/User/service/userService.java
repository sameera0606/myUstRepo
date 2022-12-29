package com.ust.User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.ust.User.dto.Labourer;
import com.ust.User.model.ResponseDto;
import com.ust.User.model.UserModel;
import com.ust.User.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userRepository;

	public UserModel createUser(UserModel user) {
		return userRepository.save(user);

	}

	public List<UserModel> getusers() {

		return userRepository.findAll();
	}

	

	public UserModel getUsersById(int userId) {

		return userRepository.findById(userId).orElse(null);
	}

	public UserModel updateUser(UserModel user) {

		Optional<UserModel> updateUser = userRepository.findById(user.getId());

		if (updateUser.isPresent()) {
			user.setId(user.getId());
			user.setUserName(user.getUserName());
			user.setLocation(user.getLocation());
			user.setMobileNumber(user.getMobileNumber());
			user.setRequirement(user.getRequirement());
		} else
			new UserModel();
		return userRepository.save(user);
	}

	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "user deleted";
	}

	public List<Labourer> getLabourDetails() {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/labour",
				List.class);
		// Labour labour = responseEntity.getBody();

		List<Labourer> labour = responseEntity.getBody();
		System.out.println(labour);
		System.out.println(responseEntity.getStatusCode());
		return labour;
	}

}
