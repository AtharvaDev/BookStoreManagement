package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.Review;
import com.project.repository.IReviewRepository;

@Service
public class ReviewService implements IReviewService {

	@Autowired
	private IReviewRepository reviewRepo;
	
	@Override
	public List<Review> listAllReviews() {
	
		return reviewRepo.findAll();
	}

	@Override
	public String addReview(Review review) {
		reviewRepo.save(review);
		return "Review is added";
	}

	@Override
	public String deleteReview(int reviewID) {
	    reviewRepo.deleteById(reviewID);
		return "Review got deleted with ID"+reviewID;
	}

	@Override
	public String updateReview(Review review ,int reviewID) {
		if(reviewRepo.existsById(reviewID)) {
			reviewRepo.save(review);
			return "Review got updated";
		}else {
			return "No such review exist with this"+reviewID+"ID";
		}
		
		
	}

	@Override
	public Review viewReview(int reviewID) {
		return reviewRepo.findById(reviewID).get();
	}

	@Override
	public List<Review> listAllReviewsByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> listAllReviewsByCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listMostFavoredBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> listAllReviewByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
