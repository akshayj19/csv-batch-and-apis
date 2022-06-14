package com.example.demo.dto;

public class PolicyResponse {
    private String policyHolderName;
    private String policyName;

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public PolicyResponse() {
    }

    public PolicyResponse(String policyHolderName, String policyName) {
        this.policyHolderName = policyHolderName;
        this.policyName = policyName;
    }

    @Override
    public String toString() {
        return "PolicyResponse{" +
                "policyHolderName='" + policyHolderName + '\'' +
                ", policyName='" + policyName + '\'' +
                '}';
    }
}