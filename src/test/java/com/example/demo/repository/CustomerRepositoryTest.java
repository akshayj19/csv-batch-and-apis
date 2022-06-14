package com.example.demo.repository;

import com.example.demo.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

@Test
    void getdetails() {
        Customer customers = new Customer(121,"14","124","4","24","John","2/5/1999","Male","40000","9145136755","Pune","3","4/5/2020","4/5/2021","4/5/2024","ok");
        customerRepository.save(customers);
        List<Customer> actualResult= customerRepository.getinformation();
        assertThat(actualResult);



    }
}