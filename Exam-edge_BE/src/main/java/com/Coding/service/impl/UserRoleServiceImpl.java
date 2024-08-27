package com.Coding.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Coding.Entity.Role;
import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;
import com.Coding.Repo.UserRoleRepo;
import com.Coding.service.UserRoleService;
import com.Coding.service.UserService;

@Service
public class UserRoleServiceImpl implements UserRoleService
{
	@Autowired
	private UserRoleRepo user_roleRepo;
	
	@Autowired
	private UserService userServ;

	@Override
	public UserRole getUser_roleFromUserAndRole(User user, Role role) throws Exception {
		User local = userServ.getUserByid(user.getId());
		return this.user_roleRepo.getByUAndR(local, role);
	}

}
