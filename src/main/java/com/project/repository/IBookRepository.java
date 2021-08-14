package com.project.repository;

import java.util.List;

import com.project.entities.Book;

public interface IBookRepository {

	public Book findByTitle(String title);
	public List<Book> findByCategory(String cat);
	public List<Book> search(String keyword);
	public List<Book> listRecentlyAdded();
}
