package com.cloudsys.repository;

import java.util.ArrayList;
import java.util.List;

import com.cloudsys.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Bryan");
		customer.setLastName("John");
		customers.add(customer);
		return customers; 
		
	}

}
