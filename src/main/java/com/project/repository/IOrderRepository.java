package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Book;
import com.project.entities.BookOrder;
import com.project.entities.Customer;
import com.project.entities.OrderDetails;

public interface IOrderRepository extends JpaRepository<OrderDetails, Integer> {

//	public List<OrderDetails> listAllOrders();
//	public List<OrderDetails> listOrderByCustomer(Customer cs);
//	public OrderDetails viewOrderForCustomer(OrderDetails od);
//	public OrderDetails viewOrderForAdmin(OrderDetails od);
//	public OrderDetails cancelOrder(OrderDetails od);
//	public OrderDetails addOrder(OrderDetails od);
//	public OrderDetails updateOrder(OrderDetails od);
//	public List<OrderDetails> viewOrderByBook(Book book);
//	public List<Book> listBestSellingBook();

}
