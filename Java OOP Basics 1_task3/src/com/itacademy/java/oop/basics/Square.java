package com.itacademy.java.oop.basics;

import java.time.LocalDate;
import java.util.Arrays;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isShapeValid() {
        if (length < 0 || width < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        if (!isShapeValid()) {
            return "Square length = " + length + ", width = " + width + ". Values can't be negative";
        }
        return "Square perimeter = " + perimeter() + ", area = " + area();
    }
}
