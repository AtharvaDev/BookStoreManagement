package com.project.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;
	
	@OneToOne(targetEntity = Book.class)
	@JoinColumn(name="bookId")
	private Book book;
	
	@OneToOne(targetEntity = Customer.class)
	@JoinColumn(name="customerId")
	private Customer customer;
	private String headLine;
	private String comment;
	private double rating;
	private LocalDate reviewOn;
	
	public Review() {	}

	public Review(int reviewId, Book book, Customer customer, String headLine, String comment, double rating,
			LocalDate reviewOn) {
	
		this.reviewId = reviewId;
		this.book = book;
		this.customer = customer;
		this.headLine = headLine;
		this.comment = comment;
		this.rating = rating;
		this.reviewOn = reviewOn;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalDate getReviewOn() {
		return reviewOn;
	}

	public void setReviewOn(LocalDate reviewOn) {
		this.reviewOn = reviewOn;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", book=" + book + ", customer=" + customer + ", headLine=" + headLine
				+ ", comment=" + comment + ", rating=" + rating + ", reviewOn=" + reviewOn + "]";
	}

}
