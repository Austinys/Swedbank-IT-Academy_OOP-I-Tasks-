package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    private Loan[] loans;

    public Customer(String name, String surname, int age, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    private double countLoansAmount() {
        double amount = 0;
        for (Loan loan : loans) {
            amount += loan.getAmount();
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Number: " + personalNumber +
                ", Loans: " + Arrays.toString(loans) + ", Total loans amount: " + countLoansAmount();
    }
}