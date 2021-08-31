package com.project.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.BookStoreManagementApplication;
import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService  {

    private static final Logger logger = LogManager.getLogger(CustomerService.class);

	@Autowired
	private ICustomerRepository repo;

	@Override
	public List<Customer> listCustomers() {
		logger.trace("inside service listCustomers");
		List<Customer> a = null;
		try {
			a = repo.findAll();
//			int b = 1/0;
		} catch (Exception e) {
			logger.error("Something went wrong in service layer of listCustomers: "+ e);
		}
		return a;
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
	public List<Customer> listAllCustomersByBook(int bookID) {
		// TODO Auto-generated method stub
		return repo.listAllCustomersByBook(bookID);
//		return null;
	}

}