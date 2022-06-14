package com.example.demo.repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PolicyRepository extends JpaRepository<Policy,Integer> {
    //@Query("select p.policyId,count(c.customerId) from Customer c inner join c.policies p on c.policyId = p.policyId group by p.policyId")
    //List<Customer> getCustomersByPolicyId();
//@Query("from Policy")
    List<Policy> findByPolicyId(int policyId);

    @Query("select policyId from Policy where policyCount >= 5")
    List<Integer> getPolicyIdOfPolicyCountMoreThenFive();
}