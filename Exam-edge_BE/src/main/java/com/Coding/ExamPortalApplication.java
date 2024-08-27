package com.Coding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Coding.Entity.Role;
import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;
import com.Coding.Repo.RoleRepo;
import com.Coding.Repo.UserRepo;
import com.Coding.Repo.UserRoleRepo;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner
{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
	private UserRoleRepo userRoleRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code");

		User local = this.userRepo.findByUsername("admin");
		 if(local == null)
		 {
		
		//======== creating user(admin) without api========================================	
		
		 
			User admin = new User();
			admin.setUsername("admin");
			admin.setFirstname("admin");
			admin.setLastname("admin");
			admin.setEmail("admin@gmail.com");
			admin.setPhone("1234567891");
			admin.setProfile("profile.png");
			
			this.userRepo.save(admin);
		 
		
		//========  Role  ====================================================================================		
		
			Role role = new Role();
			role.setRoleId((long) 1);
			role.setRoleName("ROLE_ADMIN");
			
			this.roleRepo.save(role);
		
		//========= User_role ==================================================================================		
		
			UserRole user_role = new UserRole();
			user_role.setUserRoleId(1);
			user_role.setRole(role);
			user_role.setUser(admin);
			
			this.userRoleRepo.save(user_role);
		 }

	}
	
	

}
