package com.employeemanagement.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.employee.entity.User;
import com.employeemanagement.employee.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	//post: return user
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	
	
	//post: return list of user
	@PostMapping("/addUsers")
		public List<User> addUser(@RequestBody List<User> user) {
			return userservice.saveUsers(user);
		}
	
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return userservice.getUsers();
	}
	
	@GetMapping("/userById/{id}")
	public User findUserById(@PathVariable int id) {
		return userservice.getUserById(id);
	}
	
	@GetMapping("/userByUsername/{username}")
	public User findUserByUsername(@PathVariable String username) {
		return userservice.getUserByUsername(username);
	}
	
	//putt: update user
		@PutMapping("/updateUser")
		public User updateUser(@RequestBody User user) {
			return userservice.updateUser(user);
		}
		
	//delete: delete user
		@DeleteMapping("/deleteUser/{id}")
		public String deleteUser(@PathVariable int id) {
			return userservice.deleteUser(id);
		}
		
	
	
	
}
