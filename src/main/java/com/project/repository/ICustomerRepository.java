package com.project.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ICustomerRepository extends  JpaRepository<Customer, Integer>{

//	public Customer createCustomer(Customer c);
//	public List<Customer> listCustomers();
//	public Customer deleteCustomer(Customer c);
//	public Customer updateCustomer(Customer c);
//	public Customer viewCustomer(Customer c);

}
