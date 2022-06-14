package com.example.demo.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Policy;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PolicyRepository policyRepository;

    List<Customer> list;

    private CustomerService CustomerSerivice;

    @Override
    public List<Customer> getCustomers() {
        // TODO Auto-generated method stub
        return customerRepository.getdetails();

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
       this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomer(int customerId) {
        return customerRepository.getReferenceById(customerId);
    }

    @Override
    public List<Customer> getNewDetails() {
        return customerRepository.getinformation();
    }



    @Override
    public String deleteById(int policyId) {
        int counter = 0;
       List<Customer> customers= customerRepository.findByCreationDate();
       for(Customer c:customers) {
           if (c.getPolicyId() == policyId) {
               customerRepository.deleteById(c.getCustomerId());
               ++counter;
           }
       }
        return "no of the customer record deleted are: " + counter;
    }

    @Override
    public List<Customer> getmaximum() {
        return customerRepository.getbig();
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }


    public String updatePolicyCount(){

       List<Policy> policyList=policyRepository.findAll();


    for (Policy p : policyList) {
        List<Customer> customer = customerRepository.findByPolicyId(p.getPolicyId());
        p.setPolicyCount(customer.size());//21//1

    }
   policyRepository.saveAll(policyList);


       return "policy Count Successfully updated";
    }

    public String updatePolicyPremiumAmount(){
        List<Integer>  policyIdFromTable= policyRepository.getPolicyIdOfPolicyCountMoreThenFive();
        List<Customer> listOfCustomer= customerRepository.findAll();
        for(int i: policyIdFromTable){
            for(Customer c:listOfCustomer) {
                if (i == c.getPolicyId()){
                    c.setPolicyPremiumAmount(c.getPolicyPremiumAmount()+10000);
                }
            }
        }
        customerRepository.saveAll(listOfCustomer);
         return "policy premium amount updated successfully by 10000";
    }
    //public CustomerServiceImpl(PolicyRepository policyRepository) {
       // this.policyRepository = policyRepository;
   // }

 /*  @Override
    public void updateCustomer(Customer customer, int customerId) {
        list= list.stream().map(c-> {

            if (c.getCustomerId() == customerId) {
                c.setPolicyPremiumAmount(customer.getPolicyPremiumAmount());
            }
            return c;
        }


                ;}*/




}










