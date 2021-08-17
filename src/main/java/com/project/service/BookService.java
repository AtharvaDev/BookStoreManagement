package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.repository.IBookRepository;

@Service
public class BookService implements IBookService{

	@Autowired
	private IBookRepository bookRepo;
	@Override
	public String createBook(Book b) {
		 bookRepo.save(b);
		 return "Book added";
	}

	@Override
	public List<Book> listAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public String deleteBook(int bookID) {
		 bookRepo.deleteById(bookID);
		 return "Book got deleted";
		
	}

	@Override
	public String editBook(Book b ,int bookID ) {
		if(bookRepo.existsById(bookID)) {
			bookRepo.save(b);
			return"Book got Updated";
		}else {
			return "No such Book exist with this"+bookID+"ID";
		}
		
	}

	@Override
	public Book viewBook(int bookID) {
		
		return bookRepo.findById(bookID).get();
	}

	@Override
	public List<Book> listBooksByCategory(String cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
