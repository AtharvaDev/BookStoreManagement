package com.project.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="bookOrder")
public class BookOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@OneToOne()
	private Customer customer;
	private LocalDate orderDate;
	private double orderTotal;
	private String status;
	
	@OneToOne()
	private Address ShippingAddress;
	private String paymentMethod;
	private String recipientName;
	private String recipientPhone;
	
	public BookOrder() {}
	public BookOrder(int orderId, Customer customer, LocalDate orderDate, double orderTotal, String status,
			Address shippingAddress, String paymentMethod, String recipientName, String recipientPhone) {
		
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.status = status;
		ShippingAddress = shippingAddress;
		this.paymentMethod = paymentMethod;
		this.recipientName = recipientName;
		this.recipientPhone = recipientPhone;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	@Override
	public String toString() {
		return "BookOrder [orderId=" + orderId + ", customer=" + customer + ", orderDate=" + orderDate + ", orderTotal="
				+ orderTotal + ", status=" + status + ", ShippingAddress=" + ShippingAddress + ", paymentMethod="
				+ paymentMethod + ", recipientName=" + recipientName + ", recipientPhone=" + recipientPhone + "]";
	}
	
	
}
