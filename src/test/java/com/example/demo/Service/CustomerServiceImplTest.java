package com.example.demo.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PolicyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CustomerServiceImplTest {
@Mock
    private CustomerRepository customerRepository;
@Mock
private PolicyRepository policyRepository;

    private CustomerServiceImpl CustomerSerivice;

    @BeforeEach
    void setUp() {
        this.CustomerSerivice= new CustomerServiceImpl(this.customerRepository);
       //this.CustomerSerivice= new CustomerServiceImpl(this.policyRepository);
    }


    @Test
    void getCustomers() {

        CustomerSerivice.getCustomers();
        verify(customerRepository).getdetails();



    }


    @Test
    void getNewDetails() {
        CustomerSerivice.getNewDetails();
        verify(customerRepository).getinformation();

    }

    @Test
    void updatePolicyPremiumAmount() {
        CustomerSerivice.updatePolicyPremiumAmount();
        verify(policyRepository).getPolicyIdOfPolicyCountMoreThenFive();
    }
}