package com.example.demo.repository;

import com.example.demo.dto.PolicyResponse;
import com.example.demo.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("from Customer where policyPayPeriod =3 AND policyPremiumAmount<=50000 order by policyHolderName")
    List<Customer> getdetails();
@Query("from Customer where creationDate like '%2015'")
   List<Customer> findByCreationDate();
List<Customer> findByPolicyId(int policyId);
    @Query(" from Customer where policyPremiumAmount >= 100000 AND policyPayPeriod =6 ")
    List<Customer> getinformation();

    @Query(value="SELECT MAX(policyPremiumAmount) ,SUM(policyPremiumAmount) FROM Customer policyPremiumAmount ")
    List<Customer> getbig();

    @Query("SELECT new com.example.demo.dto.PolicyResponse (c.policyHolderName, p.policyName) FROM Customer c JOIN c.policies p")
    public List<PolicyResponse> getJoinInformation();

    @Query("select p.policyId,count(c.customerId) from Customer c inner join c.policies p on c.policyId = p.policyId group by p.policyId")
   List<Integer> getCustomersByPolicyId();

    @Query("select policies from Customer")
    List<Policy> getAllPolicy();
    }

  // @Query("from Customer where set groupId=:groupId AND officeId=:officeId AND branchId=:branchId AND policyCount>=10 FROM Customer c JOIN c.policies p")
  //  public List<Customer>updateCustomer();





