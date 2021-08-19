package com.project.service;

import java.util.List;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.Review;

public interface IReviewService {

	public List<Review> listAllReviews();
	public String addReview(Review review);
	public String deleteReview(int reviewID);
	public String updateReview(Review review,int reviewID);
	public Review viewReview(int reviewID);
	public List<Review> listAllReviewsByBook(Book book);
	public List<Review> listAllReviewsByCustomer(Customer c);
	public List<Book> listMostFavoredBooks();
	public List<Review> listAllReviewByCustomer(Customer customer);
}
