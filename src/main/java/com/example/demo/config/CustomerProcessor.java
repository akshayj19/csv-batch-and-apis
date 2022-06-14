package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.entities.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        // TODO Auto-generated method stub
        return customer;
    }

}
