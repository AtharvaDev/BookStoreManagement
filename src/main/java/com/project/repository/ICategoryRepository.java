package com.project.repository;

import com.project.entities.Category;

public interface ICategoryRepository {

	public Category addCategory(String categoryName);
	public Category editCategory(Category cat);
	public Category viewAllCategories();
	public Category removeCategory(Category cat);
}
