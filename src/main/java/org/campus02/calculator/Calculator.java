package org.campus02.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add(3,2) = " + add(3,2));
        System.out.println("sub(3,2) = " + sub(3,2));
        System.out.println("mul(3,2) = " + mul(3,2));
        System.out.println("div(6,2) = " + div(6,2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}
