package com.project.service;

import java.util.List;

import com.project.entities.Book;

public interface IBookService {

	
	public String createBook(Book b);
	public List<Book> listAllBooks();
	public String deleteBook(int bookID);
	public String editBook(Book b,int bookID);
	public Book viewBook(int bookID);
	public List<Book> listBooksByCategory(String cat);
	public List<Book> listBestSellingBook();
}
