package com.dc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.rest.model.Customer;
import com.dc.rest.service.CustomerService;

@ComponentScan
@RestController
@EnableAutoConfiguration
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers/customer/{custid}")
	public Customer retrieveCustomer(@PathVariable Integer custid) {
		return customerService.findByCustomerId(new Integer(custid));
	}
	

	@RequestMapping("/customers/customer/name/{custid}")
	public String retrieveCustomerName(@PathVariable Integer custid) {
		return customerService.findCustomerName(custid);
	}
	
	
}
