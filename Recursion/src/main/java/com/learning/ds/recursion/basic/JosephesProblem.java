package com.learning.ds.recursion.basic;

/*

Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

After each operation, the count will start from k+1th person.
The task is to choose the safe place in the circle so that when you perform these operations
starting from 1st place in the circle, you are the last one remaining and survive.
 */
public class JosephesProblem {

    public static void main(String[] args) {
        int n = 7, k = 3;
        int position = joseFunc(n, k);
        System.out.println(position);
    }

    private static int joseFunc(int n, int k) {

        if(n == 1){
            return n;
        }
        return (k + joseFunc(n-1, k)-1)%n + 1;
    }
}
