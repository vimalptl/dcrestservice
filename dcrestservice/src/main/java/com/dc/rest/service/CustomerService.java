package com.dc.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dc.rest.mapper.CustomerMapper;
import com.dc.rest.model.Customer;

@Component
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

    public Customer findByCustomerId(int custId) {
    	Customer cust = customerMapper.findByCustomerId(custId);
    	return cust;
    }
    
    public String findCustomerName(int custId) {
    	return customerMapper.findCustomerName(custId);
    }	
	
}
