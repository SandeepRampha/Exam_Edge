package com.Coding.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.outcome.Userqna;

@Repository

public interface UserqnaRepo extends JpaRepository<Userqna, Integer>
{

}
