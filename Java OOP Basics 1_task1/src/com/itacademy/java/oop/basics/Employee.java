package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private LocalDate contractStart;
    private int salary;
    private String position;
    private ContractType contractType;

    public Employee(String name, String surname, LocalDate contractStart, int salary, String position, ContractType contractType) {
        this.name = name;
        this.surname = surname;
        this.contractStart = contractStart;
        this.salary = salary;
        this.position = position;
        this.contractType = contractType;
    }

    @Override
    public String toString(){
        return name + " " + surname + " " + contractStart + " " + salary + " " + position + " " + contractType;
    }

}

