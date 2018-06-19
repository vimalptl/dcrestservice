package com.dc.rest.service;

import java.sql.SQLException;
import java.util.List;

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
    
    public List<Customer> findCustomerByName(String firstName, String lastName, String id) {
    	try {
			return customerMapper.getCustomerByName(lastName, firstName, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
	
}
