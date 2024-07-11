package org.example.models;

public class DeliveryEmployeeResponse {
    private String name;
    private String nationalInsurance;
    private int bankAccountNo;
    private double salary;

    public DeliveryEmployeeResponse(
            final String name,
            final String nationalInsurance,
            final int bankAccountNo,
            final double salary) {
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
