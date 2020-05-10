package com.learning.ds.bitwise;

public class SwapNumber {
    public static void main(String[] args) {
        int n1 = 17;
        int n2 = 51;

        System.out.println(String.format("Before swap N1 : {%d} N2 : {%d}", n1, n2));

        swap(n1, n2);


    }

    private static void swap(int n1, int n2){

        n1 = n1 ^ n2; // 101 ^ 100 = 001
        n2 = n1 ^ n2; // 001 ^ 100 = 101 i.e 5
        n1 = n1 ^ n2; // 001 ^ 101 = 100 i.e. 4

        System.out.println(String.format("After swap N1 : {%d} N2 : {%d}", n1, n2));
    }
}
