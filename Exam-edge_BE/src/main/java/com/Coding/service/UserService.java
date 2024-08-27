package com.Coding.service;

import java.util.List;
import java.util.Set;

import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;

public interface UserService {

	//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//get user by userName
	public User getUser(String username);
	
	// get user by uId
	public User getUserByid(int i) throws Exception;

	//Delete by UserId
	public void deleteUser(int userId);
	
	// update user
	public User updateUser(User user,Set<UserRole> user_roles) throws Exception;
	
	// get all users
	public List<User> getAllUsers();
	
	// get all admins
	public Set<User> getAllAdmins();
	
	public int login(User user);
}
