package com.learning.ds.recursion.basic;

public class IterateWithoutLoop {
    public static void main(String[] args) {
        printReverse(5);
        System.out.println("\n");
        print(5);
    }

    /* This is an example of tail recursive call
    * It takes lesser time to execute.
    * */
    private static void printReverse(int number){
        if(number == 0){
            return;
        }
        System.out.print(number + "  ");
        printReverse(number-1);
    }

    private static void print(int number){
        if(number == 0){
            return;
        }
        print(number-1);
        System.out.print(number + "  ");
    }

}
