package org.example.models;

public class SalesEmployeeResponse {
    private String name;
    private String NINO;
    private int bankAccountNo;
    private double salary;
    private double commissionRate;

    public SalesEmployeeResponse(
            final String name,
            final String NINO,
            final int bankAccountNo,
            final double salary,
            final double commissionRate) {
        this.name = name;
        this.NINO = NINO;
        this.bankAccountNo = bankAccountNo;
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getNINO() {
        return NINO;
    }

    public void setNINO(String NINO) {
        this.NINO = NINO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
