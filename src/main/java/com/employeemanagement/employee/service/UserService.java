package com.employeemanagement.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.employee.entity.User;
import com.employeemanagement.employee.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepository;
	
	//Get: return user by username
			public User getUserByUsername(String username){
				return userrepository.findByUsername(username);
			}
	
	/*
	//Post: Save single user
	public User saveUser(User user) {
		
		return userrepository.save(user);
	}
	
	//Post : save list of user
	public List<User> saveUsers(List<User> users) {
		
		return userrepository.saveAll(users);
	}
	
	//Get: return all users
	public List<User> getUsers(){
		return userrepository.findAll();
	}
	
	//Get: return user by id
	public User getUserById(int id){
		return userrepository.findById(id).orElse(null);
	}
	
	
		
	//delete
		public String deleteUser(int id) {
			userrepository.deleteById(id);
			return "User removed !!" +id;
		}
		
	// Put:  Update user
	public User updateUser(User user) {
		User existingUser=userrepository.findById(user.getId()).orElse(null);
		existingUser.setEmail(user.getEmail());
		existingUser.setId(user.getId());
		existingUser.setPassword(user.getPassword());
		existingUser.setUsername(user.getUsername());
		return userrepository.save(existingUser);
	}
	*/	
		
}
