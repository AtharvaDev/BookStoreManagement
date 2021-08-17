package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

	public Category addCategory(String categoryName);
	public Category editCategory(Category cat);
	public Category viewAllCategories();
	public Category removeCategory(Category cat);
}
