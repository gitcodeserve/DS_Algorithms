package com.learning.ds.recursion.basic;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 456787;

        System.out.println(String.format("Sum of digit {%d} is {%d}", number, sumOfDigit(number)));
    }

    private static int sumOfDigit(int number) {
        if (number < 10)
            return number;

        return sumOfDigit(number / 10) + number % 10;

    }
}
