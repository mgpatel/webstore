package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * Created by Mayank on 12/12/15.
 */
public interface CustomerService {

    List<Customer> getAllCustomers();
}
