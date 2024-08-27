package com.Coding.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Coding.Entity.Role;
import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;
import com.Coding.helper.UserNotFoundException;
import com.Coding.service.UserRoleService;
import com.Coding.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRoleService user_roleServ;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) throws Exception
	{
		user.setProfile("default.png");
		Set<UserRole> roles = new HashSet<>();
		
		Role role = new Role();
		role.setRoleId(45L);
		role.setRoleName("Normal User");
		
		UserRole userRole = new UserRole();    	 
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
	}
	
	@GetMapping("/userid/{userid}")
	public User getUserDetails(@PathVariable("userid") int userId) throws Exception
	{
		return this.userService.getUserByid(userId);
	}
	
	@GetMapping("/username/{username}")
	public User getUser(@PathVariable("username") String username) 
	{
		return userService.getUser(username);
	}

	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		
		return this.userService.getAllUsers();
	}
	
	//delete the user by id
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) 
	{
		userService.deleteUser(userId);
	}
	
	//Get Role 
	@GetMapping("/roles/{userId}")
    public Set<UserRole> getRolesByUserId(@PathVariable("userId") int userId) throws Exception {
        User user = userService.getUserByid(userId);
        return user.getUserRoles();
    }

	//Update the user by id
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) throws Exception
	{	
		Role roleAdmin = new Role();
		roleAdmin.setRoleId((long) 1);
		roleAdmin.setRoleName("ROLE_Admin");
		
		
		Role roleNormal = new Role();
		roleNormal.setRoleId((long) 2);
		roleNormal.setRoleName("ROLE_NORMAL");
		
		UserRole user_role = new UserRole();
		
		Role role = new Role();
		if(user.getUsername() == "admin" || user.getUsername().equals("admin"))
		{
			role = roleAdmin;
		}
		else {
			role = roleNormal;
		}
	
			UserRole local = this.user_roleServ.getUser_roleFromUserAndRole(user,role);
		
		user_role.setUserRoleId(local.getUserRoleId());
		user_role.setUser(user);
		user_role.setRole(role);
		
		Set<UserRole> user_roles = new HashSet<>();
		user_roles.add(user_role);
		
		return this.userService.updateUser(user, user_roles);
		
	}
	
	@PostMapping("/login")
	public int login(@RequestBody User user) {
		return this.userService.login(user);
	}
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> exceptionHandler(UserNotFoundException ex){
		return new ResponseEntity<>("User not found: " + ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
