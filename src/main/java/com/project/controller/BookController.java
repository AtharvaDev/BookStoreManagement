package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Book;
import com.project.entities.OrderDetails;
import com.project.service.BookService;



@RestController
@RequestMapping("/books")
@ComponentScan(basePackages = "com.project")
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/test")
	public String test() {
		return "Inside BooksController";
	}
	
	@GetMapping("/")
	public List<Book> listAllOrders(){
		return bookService.listAllBooks();
	}
	
	@PostMapping("/")
	public void addBook(@RequestBody Book b) {
		 bookService.createBook(b);
	}
	
	
}
