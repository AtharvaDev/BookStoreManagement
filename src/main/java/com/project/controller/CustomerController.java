package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Customer;
import com.project.service.CustomerService;

@RestController
@RequestMapping("/customer")	
@CrossOrigin(origins = "http://127.0.0.1:5500/")
@ComponentScan(basePackages = "com.project")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/test")
	public String test() {
		return "Inside CustomerController";
	}
	
	@GetMapping("/")
	public List<Customer> listCustomers() {
		return service.listCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer viewCustomer(@PathVariable("id") int id) {
		return service.viewCustomer(id);
	}
	
	@PostMapping("/")
//	in post mapping data is added in json format through postman after that you must convert it to java object this conversion of json to java object is managed by RequestBody annotation
	public Customer createCustomer(@RequestBody Customer customer) {
		return service.createCustomer(customer);	
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);	
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		 service.deleteCustomer(id);
		return id+" deleted";
	}
	
	@GetMapping("/book/{bookID}")
	public List<Customer> listAllCustomersByBook(@PathVariable("bookID") int bookID) {
		return service.listAllCustomersByBook(bookID);
	}

}