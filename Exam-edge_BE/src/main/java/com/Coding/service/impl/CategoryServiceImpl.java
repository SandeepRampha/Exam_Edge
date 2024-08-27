package com.Coding.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Coding.Entity.Exam.Category;
import com.Coding.Repo.CategoryRepo;
import com.Coding.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepo catRepo;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return this.catRepo.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return this.catRepo.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		// TODO Auto-generated method stub
		return  new LinkedHashSet<>(this.catRepo.findAll());
	}

	@Override
	public Category getCategory(int catid) {
		// TODO Auto-generated method stub
		return this.catRepo.findById(catid).get();
	}

	@Override
	public void deleteCategory(int catid) {
		// TODO Auto-generated method stub
		this.catRepo.deleteById(catid);
	}
	
	

}
