package com.summerSchool.firstProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.summerSchool.firstProject.Services.UserService;
import com.summerSchool.firstProject.data.User;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String findUserByUsernameWithRequestParam(@RequestParam String username) throws Exception {
		return userService.getUserByUsername(username).toString();

	}

	@PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@RequestBody User newUser) throws Exception {
		userService.createUser(newUser);

	}

	//@Modifying
	@DeleteMapping(value = "/deleteUser/{username}")
	public void deleteUser(@PathVariable(value = "username") String username) throws Exception {
		userService.deleteUser(username);

	}
	/*
	@PostMapping(value = "/verifyUser")
	public void verifyUser( @RequestParam String username, @RequestParam String password) throws Exception {
		
		 userService.verifyUser(newUser);

	}*/
	
}
