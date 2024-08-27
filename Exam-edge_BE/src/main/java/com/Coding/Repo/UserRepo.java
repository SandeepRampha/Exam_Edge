package com.Coding.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.User;

@Repository

public interface UserRepo extends JpaRepository<User, Integer>
{
	public User findByUsername(String username);
	
	@Query("select u from User u where u.username = :username and u.Id != :Id")
	public User getByUnameAndNouid(@Param("username") String username,@Param("Id") int i);

}
