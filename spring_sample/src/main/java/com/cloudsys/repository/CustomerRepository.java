package com.cloudsys.repository;

import java.util.List;

import com.cloudsys.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}