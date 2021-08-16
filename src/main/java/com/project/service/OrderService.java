package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.OrderDetails;
import com.project.repository.IBookRepository;
import com.project.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {
	
	@Autowired
	IOrderRepository repo;

	@Override
	public List<OrderDetails> listAllOrders() {
		return repo.findAll();
		
	}
	
	public OrderDetails listOrdersById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public OrderDetails addOrder(OrderDetails od) {
		return repo.save(od);
	}
	
	@Override
	public OrderDetails cancelOrder(OrderDetails od) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public OrderDetails updateOrder(OrderDetails od) {
		return repo.save(od);
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
