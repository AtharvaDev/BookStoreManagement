package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.OrderDetails;
import com.project.repository.IBookRepository;
import com.project.repository.IOrderRepository;


public class OrderService implements IOrderService{

	@Autowired
	IOrderRepository OrderRepo;
	
// Not needed for now
	public OrderDetails listOrdersById(int id) {
		return OrderRepo.findById(id).get();
	}
	
	@Override
	public List<OrderDetails> listAllOrders() {
		return OrderRepo.findAll();
	}

	@Override
	public List<OrderDetails> listOrderByCustomer(Customer cs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails viewOrderForCustomer(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails viewOrderForAdmin(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails cancelOrder(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails addOrder(OrderDetails od) {
		return OrderRepo.save(od);
	}

	@Override
	public OrderDetails updateOrder(OrderDetails od) {
		return OrderRepo.save(od);
	}

	@Override
	public List<OrderDetails> viewOrderByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listBestSellingBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
