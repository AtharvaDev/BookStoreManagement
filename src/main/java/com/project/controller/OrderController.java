package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.OrderDetails;
import com.project.service.OrderService;

@RestController
@RequestMapping("/orders")
@ComponentScan(basePackages = "com.project")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/test")
	public String test() {
		return "Inside OrderController";
	}
	
	@GetMapping("/")
	public List<OrderDetails> listAllOrders(){
		return service.listAllOrders();
	}
	
	@GetMapping("/{id}")
	public OrderDetails listAllOrders(@PathVariable int id){
		return service.listOrdersById(id);
	}
	
	@PostMapping("/")
	public OrderDetails addOrder(@RequestBody OrderDetails od) {
		return service.addOrder(od);
	}
	
	@PutMapping("/{id}")
	public OrderDetails updateOrder(@RequestBody OrderDetails od) {
		return service.updateOrder(od);
	}
}
