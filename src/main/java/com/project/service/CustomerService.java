package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService  {

	@Autowired
	private ICustomerRepository repo;

	@Override
	public List<Customer> listCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer viewCustomer(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Customer createCustomer(Customer c) {
		return repo.save(c);
	}

	@Override
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		return repo.save(c);
	}

	@Override
	public List<Customer> listAllCustomersByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}