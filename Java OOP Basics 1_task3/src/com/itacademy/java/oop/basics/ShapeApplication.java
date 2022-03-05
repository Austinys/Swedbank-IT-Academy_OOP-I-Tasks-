package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square1 = new Square(5, 5);
        Square square2 = new Square(4, 4);
        Square square3 = new Square(-4, -4);

        Square[] squares = {square1, square2, square3};
        System.out.println(Arrays.toString(squares));

    }
}
