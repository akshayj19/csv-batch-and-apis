package com.example.demo.repository;

import com.example.demo.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@SpringBootTest
public class customerRepo {
    @Autowired
    private CustomerRepository customerRepository;


@Test
    void getinformation(){
        Customer customer = new Customer(121,"14","124","4","24","John","2/5/1999","Male","200000","9145136755","Pune","6","4/5/2020","4/5/2021","4/5/2024","ok");
        customerRepository.save(customer);
      List<Customer>  newResult= customerRepository.getinformation();
        assertThat(newResult);

    }
}
