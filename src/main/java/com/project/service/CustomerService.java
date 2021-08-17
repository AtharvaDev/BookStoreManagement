package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private ICustomerRepository CustomerRepo;
	
	@Override
	public Customer createCustomer(Customer c) {
		return CustomerRepo.save(c);
	}

	@Override
	public List<Customer> listCustomers() {
		return CustomerRepo.findAll();
	}

	//change return type to string
	@Override
	public void deleteCustomer(int id) {
		CustomerRepo.deleteById(id);
		//return "Customer with ${id} deleted"; 
	}

	@Override
	public Customer updateCustomer(Customer c) {
		return CustomerRepo.save(c);
	}

	@Override
	public Customer viewCustomer(int id) {
		return CustomerRepo.findById(id).get();
	}

	@Override
	public List<Customer> listAllCustomersByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
