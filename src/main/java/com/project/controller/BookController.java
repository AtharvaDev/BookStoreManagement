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
import com.project.entities.Review;
import com.project.service.BookService;
import com.project.service.ReviewService;



@RestController

@ComponentScan(basePackages = "com.project")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	ReviewService reviewService;

	@GetMapping("/books/test")
	public String test() {
		return "Inside BooksController";
	}
	
	@GetMapping("/reviews/test1")
	public String test1() {
		return "Inside ReviewsController";
	}
	
	@GetMapping("/books")
	public List<Book> listAllBooks(){
		return bookService.listAllBooks();
	}
	
	@GetMapping("/books/{bookID}")
	public Book viewBook(@PathVariable("bookID") int bookID) {
		return bookService.viewBook(bookID);
	}
	
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book b) {
		 bookService.createBook(b);
	}
	
	@PutMapping("/books/{bookID}")
	public String editBook(@RequestBody Book b,@PathVariable("bookID") int bookID) {
		return bookService.editBook(b, bookID);	
	}
	
	@DeleteMapping("/books/{bookID}")
	public String deleteBook(@PathVariable("bookID") int bookID) {
		return bookService.deleteBook(bookID);
	}
	
	//review methods
	
	@GetMapping("/reviews")
	public List<Review> listAllReviews(){
		return reviewService.listAllReviews();
	}
	
	
	@GetMapping("/reviews/{reviewID}")
	public Review viewReview(@PathVariable("reviewID") int reviewID) {
		return reviewService.viewReview(reviewID);
	}
	
	@PostMapping("/reviews")
	public void addReviews(@RequestBody Review review) {
		reviewService.addReview(review);
	}
	
	@PutMapping("/reviews/{reviewID}")
	public String updateReview(@RequestBody Review review,@PathVariable("reviewID") int reviewID) {
		return reviewService.updateReview(review, reviewID);	
	}
	
	@DeleteMapping("/reviews/{reviewID}")
	public String deleteReview(@PathVariable("reviewID") int reviewID) {
		return reviewService.deleteReview(reviewID);
	}
	
	
	
}
