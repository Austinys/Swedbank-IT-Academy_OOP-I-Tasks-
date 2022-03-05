package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Loan {
    private int id;
    private double amount;
    private LoanType loanType;
    private LocalDate terminationDate;


    public Loan(int id, double amount, LoanType loanType, LocalDate terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }
    
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return id + " " + amount + " " + loanType + " " + terminationDate;
    }
}
