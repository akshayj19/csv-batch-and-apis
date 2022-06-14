package com.example.demo.repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Policy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PolicyRepositoryTest {
    @Autowired
private CustomerRepository customerRepository;
    @Autowired
    private PolicyRepository policyRepository;
@Test
    void getPolicyIdOfPolicyCountMoreThenFive() {

        List<Customer> customers =customerRepository.findAll();
        Policy policy= new Policy(21,"11","121","1","6","LifeLongPolicy","3","LifeInsurance");
        List<Integer> actualResult = policyRepository.getPolicyIdOfPolicyCountMoreThenFive();
        assertThat(actualResult);
    }
}