package com.codebase;

public class Calculator {
    public static final double PI = 3.14;
    public Calculator() {
    }
    public static double getPi() {
        return PI;
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
