package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.OrderDetails;
import com.project.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {

	@Autowired
	IOrderRepository OrderRepo;
	
	@Override
	public OrderDetails listOrdersById(int id) {
		return OrderRepo.findById(id).get();
	}
	
	@Override
	public List<OrderDetails> listAllOrders() {
		return OrderRepo.findAll();
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
	public String cancelOrder(int id) {
		 OrderRepo.deleteById(id);;
		 return "id deleted";
	}
	

	@Override
	public List<OrderDetails> viewOrderForCustomer(int id) {
		return OrderRepo.viewOrderForCustomer(id);
	}

	@Override
	public OrderDetails viewOrderForAdmin(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
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
