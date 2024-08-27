package com.Coding.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coding.Entity.Exam.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>
{

}
