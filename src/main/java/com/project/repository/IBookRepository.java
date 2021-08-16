package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Book;
import com.project.entities.BookOrder;

@Repository
public interface IBookRepository {

//	public Book findByTitle(String title);
//	public List<Book> findByCategory(String cat);
//	public List<Book> search(String keyword);
//	public List<Book> listRecentlyAdded();
}
