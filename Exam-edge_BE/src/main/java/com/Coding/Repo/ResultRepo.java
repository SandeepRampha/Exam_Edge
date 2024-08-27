package com.Coding.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.outcome.Result;

@Repository

public interface ResultRepo extends JpaRepository<Result, Integer>{

	
	@Query(value ="Select * from Result where resultid=( select max(resultid) from Result)",nativeQuery  = true)
	Result findCurrentResult();

//	@Query("select q from Quiz q where q.category = :category")
//	Set<Quiz> findByCategory(@Param("category")Category category);

	
	public List<Result> findByUid(int uid);
	
	public void deleteByUid(int uid);
	
}