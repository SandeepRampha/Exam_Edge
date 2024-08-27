package com.Coding.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.Role;
import com.Coding.Entity.User;
import com.Coding.Entity.UserRole;

@Repository

public interface UserRoleRepo extends JpaRepository<UserRole, Integer>{

	
	@Query("SELECT ur FROM UserRole ur WHERE ur.user = :user AND ur.role = :role")
    UserRole getByUAndR(@Param("user") User user, @Param("role") Role role);
}
