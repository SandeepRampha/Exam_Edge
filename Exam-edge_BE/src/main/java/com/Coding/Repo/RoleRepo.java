package com.Coding.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.Role;

@Repository

public interface RoleRepo extends JpaRepository<Role, Integer>
{

}
