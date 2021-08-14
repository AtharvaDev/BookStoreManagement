package com.project.repository;

import java.util.List;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.Review;

public interface IReviewRepository {

	public List<Review> listAllReviews();
	public Review addReview(Review review);
	public Review deleteReview(Review review);
	public Review updateReview(Review review);
	public Review viewReview(Review review);
	public List<Review> listAllReviewsByBook(Book book);
	public List<Review> listAllReviewsByCustomer(Customer c);
	public List<Book> listMostFavoredBooks();
}
