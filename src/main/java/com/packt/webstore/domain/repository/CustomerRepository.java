package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * Created by Mayank on 12/12/15.
 */
public interface CustomerRepository {

    List<Customer> getAllCustomers();
}
