package com.learning.ds.bitwise;

public class CountSetBit {

    public static void main(String[] args) {
        int i = 9; // 1001 - setbit count i 2
        System.out.println(countSetBits(i));
    }
    /* Function to get no of set
    bits in binary representation
    of passed binary no. */
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            n &= (n - 1) ;
            count++;
        }
        return count;
    }
}
