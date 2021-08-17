package com.project.service;

import java.util.List;

import com.project.entities.Book;
import com.project.entities.Customer;

public interface ICustomerService {


	public Customer createCustomer(Customer c);
	public List<Customer> listCustomers();
	public void deleteCustomer(int id);
	public Customer updateCustomer(Customer c);
	public Customer viewCustomer(int id);
	
//	waiting
	public List<Customer> listAllCustomersByBook(Book book);
	
}
