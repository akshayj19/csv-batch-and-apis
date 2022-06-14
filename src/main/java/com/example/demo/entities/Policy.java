package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="policy")
public class Policy {
    @Id

    @Column(name="POLICY_ID")
    private Integer policyId;

    @Column(name="GROUP_ID")
    private Integer groupId;
    @Column(name="OFFICE_ID")
    private Integer officeId;
    @Column(name="BRANCH_ID")
    private Integer branchId;
    @Column(name="POLICY_NAME")
    private String policyName;
    @Column(name="POLICY_TERM")
    private Integer policyTerm;
    @Column(name="POLICY_TYPE")
    private String policyType;
    @Column(name="POLICY_COUNT")
    private Integer policyCount;

    public Policy(int policyId, String s, String s1, String s2, String policyName, String lifeLongPolicy, String policyType, String lifeInsurance) {
    }

    //@OneToMany(targetEntity = Customer.class, cascade=CascadeType.ALL)
    //@JoinColumn (name="policy_Id" ,referencedColumnName = "policyId")
  // private List<Customer> customers;
   //@ManyToOne(cascade=CascadeType.ALL)
   //@JoinColumn
  //private Customer customer;
    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Integer getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(Integer policyTerm) {
        this.policyTerm = policyTerm;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Integer getPolicyCount() {
        return policyCount;
    }

    public void setPolicyCount(Integer policyCount) {
        this.policyCount = policyCount;

    }

    public Policy() {
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId=" + policyId +
                ", groupId=" + groupId +
                ", officeId=" + officeId +
                ", branchId=" + branchId +
                ", policyName='" + policyName + '\'' +
                ", policyTerm=" + policyTerm +
                ", policyType='" + policyType + '\'' +
                ", policyCount=" + policyCount +
                '}';
    }

    public Policy(Integer policyId, Integer groupId, Integer officeId, Integer branchId, String policyName, Integer policyTerm, String policyType, Integer policyCount) {
        this.policyId = policyId;
        this.groupId = groupId;
        this.officeId = officeId;
        this.branchId = branchId;
        this.policyName = policyName;
        this.policyTerm = policyTerm;
        this.policyType = policyType;
        this.policyCount = policyCount;

    }
}
