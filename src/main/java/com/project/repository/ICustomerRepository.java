package com.project.repository;

import java.util.List;

import com.project.entities.Customer;

public interface ICustomerRepository {

	public Customer createCustomer(Customer c);
	public List<Customer> listCustomers();
	public Customer deleteCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	public Customer viewCustomer(Customer c);

}
