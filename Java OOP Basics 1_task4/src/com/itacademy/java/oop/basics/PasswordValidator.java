package com.itacademy.java.oop.basics;

public class PasswordValidator {

    static void validate(Password password) {
        char element;
        int digit = 0;

        for (int i = 0; i < password.getPassword().length(); i++) {
            element = password.getPassword().charAt(i);

            if (Character.isDigit(element)) {
                digit++;
            }
        }

        try {
            if (digit >= 2 && password.getPassword().length() >= 10 && password.getPassword().matches("[a-zA-Z0-9]+")) {
                System.out.println(password);
            } else if (digit < 2) {
                throw new ValidationException("A password must contain at least two digits.");
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (password.getPassword().length() < 10) {
                throw new ValidationException("A password must have at least ten characters.");
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!password.getPassword().matches("[a-zA-Z0-9]+")) {
                throw new ValidationException("A password consists of only letters and digits.");
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}


