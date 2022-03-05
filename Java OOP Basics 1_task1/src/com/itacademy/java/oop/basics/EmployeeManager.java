package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Petras", "Petrauskas", LocalDate.of(2020, 02, 02), 900, "specialist", ContractType.FULLTIME);
        System.out.println(employee.toString());
    }




    }


