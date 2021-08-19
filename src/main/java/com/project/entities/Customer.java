package com.project.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	private String email;
	private String fullName;
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	private String mobileNumber;
	private LocalDate registerOn;
	private String userType;

	public Customer() {
	}


	public Customer(String email, String fullName, String password, Address address, String mobileNumber,
			LocalDate registerOn, String userType) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.registerOn = registerOn;
		this.userType = userType;
	}

	public Customer(int customerId, String email, String fullName, String password, Address address,
			String mobileNumber, LocalDate registerOn, String userType) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.registerOn = registerOn;
		this.userType = userType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getRegisterOn() {
		return registerOn;
	}

	public void setRegisterOn(LocalDate registerOn) {
		this.registerOn = registerOn;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", fullName=" + fullName + ", password="
				+ password + ", address=" + address + ", mobileNumber=" + mobileNumber + ", registerOn=" + registerOn
				+ ", userType=" + userType + "]";
	}

}
