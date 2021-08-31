package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.project.entities.Customer;

public class repoTestByAD {
	
	
//	@Query("SELECT a FROM Customer a join BookOrder b on a.customerId = b.customer.customerId join OrderDetails c on b.orderId = c.BookOrder.orderId join Book d on c.Book.bookId = d.bookId where bookId =2")
//	@Query("Select a from Customer a join BookOrder b on a.customerId= b.customer.customerId where b.status LIKE %?1%")
//	@Query("Select od.bookOrder.customer from OrderDetails od where od.book.bookId=?1")
//	public List<Customer> listAllCustomersByBook(int bookID);
	
//	@Query("Select a from Customer a join BookOrder b on a.customerId= b.customer.customerId where b.status LIKE %?1%")
//	public List<Customer> listAllCustomersByBook(String abc);

//	@Query("Select c from Customer c where c.city LIKE %?1%")
//	public List<Customer> listAllCustomersByBook(String abc);
	
//	@Query("Select c from Customer c where c.email LIKE '%wef%'")
//	public List<Customer> listAllCustomersByBook();
	
//	@Query("Select c from Customer c where c.email LIKE %?1%")
//	public List<Customer> listAllCustomersByBook(String abc);

}
