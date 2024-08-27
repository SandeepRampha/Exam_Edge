package com.Coding.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;
import com.Coding.Exception.CustomException;
import com.Coding.Repo.RoleRepo;
import com.Coding.Repo.UserRepo;
import com.Coding.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private RoleRepo roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception 
	{
		// TODO Auto-generated method stub
		User local=this.userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("User is Already there!!");
			throw new Exception("User already present!!");
		}
		else {
			//User Creation
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

	//Fetching User By UserName
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Set<User> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByid(int id) throws Exception {
		Optional<User> user = this.userRepository.findById(id);
		if(user.isPresent())
		{
			return user.get();
		}
		else
		{
			 System.out.println("Message: There is no User with uid: "+id+" exists... ");
			
			 throw new CustomException(" Exception: There is no User with uid: "+id+" exists...");
//			 return user.get();
		}
		
	}

	@Override
public User updateUser(User user,Set<UserRole> user_roles) throws Exception {
		
		User local;
	
		
		if(this.userRepository.getByUnameAndNouid(user.getUsername(), user.getId()) != null)
		{
		 System.out.println("Message: User already present with username: "+user.getUsername()+" , try using different username !!");
		
		 throw new CustomException("Exception: User already present with username: "+user.getUsername()+" , try using different username !!");
		 
		}else {
		 //update user
			
			 for(UserRole ur:user_roles)
			 {
				 System.out.println(ur.getRole());
				 this.roleRepository.save(ur.getRole());
			 }
			 
			 user.getUserRoles().addAll(user_roles);			 
			 local = this.userRepository.save(user);
		 	}
		 	return local;

	 	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

	@Override
	public int login(User user) {
		
		User databaseUser=this.userRepository.findByUsername(user.getUsername());
		if(databaseUser!=null) {
			if(databaseUser.getPassword().equals(user.getPassword())) {
				return databaseUser.getId();
			}
		}
		return 0;
	}

}
