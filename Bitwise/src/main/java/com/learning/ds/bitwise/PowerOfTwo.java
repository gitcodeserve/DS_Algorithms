package com.learning.ds.bitwise;

// Java program to efficiently
// check for power for 2

public class PowerOfTwo {
    /* Method to check if x is power of 2*/
    static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is
        for the case when x is 0 */
        return x!=0 && (( x & (x-1)) == 0);

    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No");

        System.out.println("2 to power 8 is " + (1 << 8));

    }
}
