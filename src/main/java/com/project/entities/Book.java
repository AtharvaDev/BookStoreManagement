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
@Table(name = "book")
public class Book {
	
	@Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title;
	private String author;
	
//	@OneToOne(targetEntity = Category.class)
//	@JoinColumn(name="categoryId")
//	private Category category;

	@Enumerated(EnumType.STRING)
	private CategoryEnum category;

=======
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	private String title;
	private String author;
	
	@OneToOne
	private Category category;
>>>>>>> parent of 0fe533d (enum added)
	private String description;
	private String isbn;
	private double price;
	private LocalDate publishDate;
	private LocalDate lastUpdatedOn;
	
	public Book() {}

	public Book(int bookId, String title, String author, Category category, String description, String isbn,
			double price, LocalDate publishDate, LocalDate lastUpdatedOn) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.description = description;
		this.isbn = isbn;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public LocalDate getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", description=" + description + ", isbn=" + isbn + ", price=" + price + ", publishDate="
				+ publishDate + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
}
