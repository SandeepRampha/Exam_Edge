package com.Coding.service;

import com.Coding.Entity.Role;
import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;

public interface UserRoleService {

	public UserRole getUser_roleFromUserAndRole(User user,Role role) throws Exception;
}
