package com.example.demo.controller;

import com.example.demo.Service.CustomerService;
import com.example.demo.dto.PolicyResponse;
import com.example.demo.entities.Customer;
//import com.example.demo.service.CustomerService;
import com.example.demo.entities.Policy;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PolicyRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jobs")
public class JobController {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PolicyRepository policyRepository;
    @Autowired
    private CustomerService CustomerSerivice;


    @PostMapping("/doneCustomers")
    public void csvToDbJob() {
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("startAt", System.currentTimeMillis()).toJobParameters();

        try {
            jobLauncher.run(job, jobParameters);
        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException |
                 JobParametersInvalidException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //1.get courses
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return this.CustomerSerivice.getCustomers();
    }

    @GetMapping("/allData")
    public List<Customer> getAll() {
        return this.CustomerSerivice.getAll();
    }

    //2. Get course by Id  "/courses/{courseId}"
    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable String customerId) {
        return this.CustomerSerivice.getCustomer(Integer.parseInt(customerId));

    }

    //1.get courses Customer where policyPremiumAmount >= 100000 AND policyPayPeriod =6
    @GetMapping("/amount")
    public List<Customer> getNewDetails() {
        return this.CustomerSerivice.getNewDetails();
    }


    ///2. Get course by Id  "/courses/{courseId}"
    /*@GetMapping("/customers/{groupId}")
    public Customer getCustomers( @PathVariable String groupId) {
        return this.CustomerSerivice.getCustomers( Integer.parseInt(groupId));
    }*/
    //delete by creation date =2015
    @DeleteMapping("/Delete/{id}")
    public String DeleteCustomer(@PathVariable int id) {
        return CustomerSerivice.deleteById(id);
    }

//get min(policyPremiumAmount) FROM Customer policyPremiumAmount
    @GetMapping("/maximum")
    public List<Customer> getmaximum() {
        return this.CustomerSerivice.getmaximum();
    }

    //policyHolder name with policy name
    @GetMapping("/getInfo")
    public List<PolicyResponse> getJoinInformation() {
        return this.customerRepository.getJoinInformation();
    }

  /*@PutMapping( "/update/{customerId}")
    public List<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") int customerId) {
      return this.CustomerSerivice.updateCustomer(customer, customerId);


  }*/

  @PostMapping("/count")
  public String updateCustomerPolicyCount() {
      return this.CustomerSerivice.updatePolicyCount();
  }


  //1.2 policy count updated
@GetMapping("/updatePolicyCount")
    String updatePolicyCount(){
      return CustomerSerivice.updatePolicyCount();
}


//updated policy premium amount by 10000
@PutMapping("/updateCustomerPremiumAmount")
    String updateCustomerPremiumAmount(){
      return CustomerSerivice.updatePolicyPremiumAmount();
}
}


