package com.example.demo.entities;



import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_info")
public class Customer {
@Id
    @Column(name="customerId")

    private int customerId;

    @Column(name="groupId")
    private int groupId;

    @Column(name="officeId")
    private int officeId;

    @Column(name="branchId")
    private int branchId;

    @Column(name="policyId")
    private int policyId;

    @Column(name="PolicyHolderName")
    private  String policyHolderName;

    @Column(name="dob")
    private String dob;

    @Column(name="Gender")
    private String Gender;

    @Column(name="policyPremiumAmount")
    private int policyPremiumAmount;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name="Address")
    private String Address;

    @Column(name="policyPayPeriod")
    private String policyPayPeriod;

    @Column(name="creationDate")
    private String creationDate;

    @Column(name="updateDate")
    private String updateDate;

    @Column(name="policyRenewalPeriod")
    private String policyRenewalPeriod;

    @Column(name="status")
    private String status;
  //@OneToMany(targetEntity = Policy.class, cascade=CascadeType.ALL)
//  @JoinColumn (name="cust_Id" ,referencedColumnName = "customerId")
 @ManyToMany(cascade=CascadeType.ALL)
  @JoinTable(name="customer_policies",joinColumns=@JoinColumn(name="cust_id"),inverseJoinColumns=@JoinColumn(name="polic_id"))
  //@ManyToOne(cascade=CascadeType.ALL)
  //@JoinColumn(name="cust_id")
   private List<Policy> policies;

    public Customer(int customerId, String s, String s1, String s2, String s3, String john, String dob, String male, String s4, String contactNumber, String pune, String policyPayPeriod, String creationDate, String updateDate, String policyRenewalPeriod, String ok) {
    }


    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getPolicyPremiumAmount() {
        return policyPremiumAmount;
    }

    public void setPolicyPremiumAmount(int policyPremiumAmount) {
        this.policyPremiumAmount = policyPremiumAmount;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPolicyPayPeriod() {
        return policyPayPeriod;
    }

    public void setPolicyPayPeriod(String policyPayPeriod) {
        this.policyPayPeriod = policyPayPeriod;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getPolicyRenewalPeriod() {
        return policyRenewalPeriod;
    }

    public void setPolicyRenewalPeriod(String policyRenewalPeriod) {
        this.policyRenewalPeriod = policyRenewalPeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer(int customerId, int groupId, int officeId, int branchId, int policyId, String policyHolderName,
                    String dob, String gender, int policyPremiumAmount, String contactNumber, String address,
                    String policyPayPeriod, String creationDate, String updateDate, String policyRenewalPeriod, String status) {
        super();
        this.customerId = customerId;
        this.groupId = groupId;
        this.officeId = officeId;
        this.branchId = branchId;
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
        this.dob = dob;
        Gender = gender;
        this.policyPremiumAmount = policyPremiumAmount;
        this.contactNumber = contactNumber;
        Address = address;
        this.policyPayPeriod = policyPayPeriod;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.policyRenewalPeriod = policyRenewalPeriod;
        this.status = status;
    }

    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", groupId=" + groupId + ", officeId=" + officeId + ", branchId="
                + branchId + ", policyId=" + policyId + ", policyHolderName=" + policyHolderName + ", dob=" + dob
                + ", Gender=" + Gender + ", policyPremiumAmount=" + policyPremiumAmount + ", contactNumber="
                + contactNumber + ", Address=" + Address + ", policyPayPeriod=" + policyPayPeriod + ", creationDate="
                + creationDate + ", updateDate=" + updateDate + ", policyRenewalPeriod=" + policyRenewalPeriod
                + ", status=" + status + "]";
    }

}

