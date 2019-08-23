package com.cloudsys.service;

import java.util.List;

import com.cloudsys.model.Customer;
import com.cloudsys.repository.CustomerRepository;
import com.cloudsys.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
