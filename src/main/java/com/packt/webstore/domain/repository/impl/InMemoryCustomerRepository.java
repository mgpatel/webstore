package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 12/12/15.
 */
@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

    public List<Customer> getAllCustomers(){

        List<Customer> listOfCustomers = new ArrayList<Customer>();

        Customer customer1 = new Customer("C1234", "John Steven");
        customer1.setAddress("26, Clarence Street, Sydney, NSW");

        Customer customer2 = new Customer("C2345", "Michael Marsh");
        customer2.setAddress("108, Victoria Road, Melbourn, VIC");

        Customer customer3 = new Customer("C3456", "Clair Manning");
        customer3.setAddress("1/12, Doll Street, Brisban, QLD");

        listOfCustomers.add(customer1);
        listOfCustomers.add(customer2);
        listOfCustomers.add(customer3);

        return listOfCustomers;
    }
}
