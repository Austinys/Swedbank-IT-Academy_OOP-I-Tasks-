package com.itacademy.java.oop.basics;

public class Password {
    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Password is valid: " + password;
    }
}

