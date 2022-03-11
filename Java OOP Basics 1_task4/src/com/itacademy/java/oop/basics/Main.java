package com.itacademy.java.oop.basics;

public class Main {
    public static void main(String[] args) {
        Password password = new Password("cfvcCAbcvbcvbc12");

        PasswordValidator.validate(password);
    }
}


// Task:
//	- write a Java application to check whether a string is a valid password.
//•	Password rules:
//	- A password must have at least ten characters.
//	- A password consists of only letters and digits.
//	- A password must contain at least two digits.
//       - Your own rules??????***
//
//•	Input : qwerty123456
//•	Output: Password is valid: qwerty123456
//•	Output: You can list which rules did not apply***