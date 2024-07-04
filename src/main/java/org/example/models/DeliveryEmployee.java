package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployee extends Employee {
    @JsonProperty
    private String name;
    @JsonProperty
    private String nationalInsurance;
    @JsonProperty
    private int bankAccountNo;
    @JsonProperty
    private double salary;
    @JsonProperty
    private double commissionRate;

    public DeliveryEmployee(final
            String name,
            final String nationalInsurance,
            final int bankAccountNo,
            final double salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.bankAccountNo = bankAccountNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
