package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "orderDetails")
public class OrderDetails {

	//About to comment this variable
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int orderDetailsId;
	
	@OneToOne(targetEntity = Book.class)
	@JoinColumn(name="bookId")
	private Book book;
	
	@OneToOne(targetEntity = BookOrder.class)
	@JoinColumn(name="orderId")
	private BookOrder bookOrder;
	private int quantity;
	private double subtotal;
	
	public OrderDetails() {}

	public OrderDetails(//int orderDetailsId,
			Book book, BookOrder bookOrder, int quantity, double subtotal) {
	
		//this.orderDetailsId = orderDetailsId;
		this.book = book;
		this.bookOrder = bookOrder;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

//	public int getOrderDetailsId() {
//		return orderDetailsId;
//	}
//
//	public void setOrderDetailsId(int orderDetailsId) {
//		this.orderDetailsId = orderDetailsId;
//	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookOrder getBookOrder() {
		return bookOrder;
	}

	public void setBookOrder(BookOrder bookOrder) {
		this.bookOrder = bookOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "OrderDetails [book=" + book + ", bookOrder=" + bookOrder + ", quantity=" + quantity + ", subtotal="
				+ subtotal + "]";
	}


	
}
