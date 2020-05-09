package com.learning.ds.array;

import java.util.Stack;

public class LeaderElementOfArray {

    public static void main(String[] args) {
        int[] arr = {20, 5, 7, 9, 8, 6, 3};

        findLeader(arr);
    }

    private static void findLeader(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < arr[i - 1]) {
                stack.push(arr[i]);
            } else
                break;
        }
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
    }
}
