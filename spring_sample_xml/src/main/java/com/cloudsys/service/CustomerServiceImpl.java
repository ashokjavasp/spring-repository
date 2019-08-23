package com.cloudsys.service;

import java.util.List;

import com.cloudsys.model.Customer;
import com.cloudsys.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository; 
	
	/**
	 * Default Constructor
	 */
	public CustomerServiceImpl() {
		
	}
	
	/**
	 * Constructor Injection to inject customerRepository
	 * @param customerRepository
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	/**
	 * Setter Injection to inject customerRepository
	 * @param customerRepository
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
