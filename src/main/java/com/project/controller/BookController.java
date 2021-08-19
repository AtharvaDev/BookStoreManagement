package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Book;
import com.project.entities.Customer;
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
	public List<Book> listAllBooks(){
		return bookService.listAllBooks();
	}
	
	@GetMapping("/{bookID}")
	public Book viewBook(@PathVariable("bookID") int bookID) {
		return bookService.viewBook(bookID);
	}
	
	
	@PostMapping("/")
	public void addBook(@RequestBody Book b) {
		 bookService.createBook(b);
	}
	
	@PutMapping("/{bookID}")
	public String editBook(@RequestBody Book b,@PathVariable("bookID") int bookID) {
		return bookService.editBook(b, bookID);	
	}
	
	@DeleteMapping("/{bookID}")
	public String deleteBook(@PathVariable("bookID") int bookID) {
		return bookService.deleteBook(bookID);
	}
	
	
}
