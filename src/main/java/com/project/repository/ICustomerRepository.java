package com.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.entities.Book;
import com.project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ICustomerRepository extends  JpaRepository<Customer, Integer>{

//	public Customer createCustomer(Customer c);
//	public List<Customer> listCustomers();
//	public Customer deleteCustomer(Customer c);
//	public Customer updateCustomer(Customer c);
//	public Customer viewCustomer(Customer c);
	
	@Query("Select od.bookOrder.customer from OrderDetails od where od.book.bookId=?1")
	public List<Customer> listAllCustomersByBook(int bookID);
	


}
