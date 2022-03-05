package com.itacademy.java.oop.basics;

import java.time.LocalDate;
import java.time.Month;

public class LoansApplication {
    public static void main(String[] args) {

        Customer customer = new Customer("Petras", "Petrauskas", 35, "861234567");

        Loan loan1 = new Loan(1, 5000, LoanType.LEASING, LocalDate.of(2035, Month.MAY, 7));
        System.out.println(loan1);

        Loan loan2 = new Loan(2, 1000, LoanType.CONSUMERLOAN, LocalDate.of(2024, Month.JANUARY, 1));
        System.out.println(loan2);

        Loan[] loans = {loan1, loan2};
        customer.setLoans(loans);

        System.out.println(customer.toString());
    }
}

