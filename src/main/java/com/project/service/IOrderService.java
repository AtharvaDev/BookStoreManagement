package com.project.service;

import java.util.List;

import com.project.entities.Book;
import com.project.entities.Customer;
import com.project.entities.OrderDetails;

public interface IOrderService {

	public List<OrderDetails> listAllOrders();
	public OrderDetails listOrdersById(int id);
	public List<OrderDetails> viewOrderForCustomer(int id);
	public OrderDetails viewOrderForAdmin(OrderDetails od);
	public String cancelOrder(int id);
	public OrderDetails addOrder(OrderDetails od);
	public OrderDetails updateOrder(OrderDetails od);
	public List<OrderDetails> viewOrderByBook(Book book);
	public List<Book> listBestSellingBook();

}
