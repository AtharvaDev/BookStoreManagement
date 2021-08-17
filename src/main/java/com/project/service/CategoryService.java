package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Category;
import com.project.repository.ICategoryRepository;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	private ICategoryRepository categoryRepo;

	@Override
	public Category addCategory(String categoryName) {
		return null;
	}

	@Override
	public Category editCategory(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category viewAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category removeCategory(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
