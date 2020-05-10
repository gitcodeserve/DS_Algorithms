package com.learning.ds.bitwise;

/*
Check if the kth bit is set or not
 */
public class SetBitExample {
    public static void main(String[] args) {
        int n = 5, k = 1; // Binary representation 101 - First position is set with one so SET.
        isKthBitSet(n, k);
    }

    static void isKthBitSet(int n, int k) {
        if (((n >> (k - 1)) &
                1) == 1)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }
}
