package com.meda.service;

import java.util.List;

import com.meda.model.Customer;
import com.meda.repository.CustomerRepository;
import com.meda.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements  CustomerService {
	
	private CustomerRepository customerRepository =new HibernateCustomerRepositoryImpl();
  
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}
}
