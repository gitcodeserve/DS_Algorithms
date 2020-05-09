package com.learning.ds.array;

public class RotateArrayExample {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 3, 7};
        int rotateFrom = 3; // output - 8, 3, 7, 2, 4, 5

        rotateArray(arr, rotateFrom);

    }

    private static void rotateArray(int arr[], int d) {
        int[] tmp1 = new int[d];
        int [] newArray = new int[arr.length];

        int[] tmp2 = new int[arr.length - d];
        for (int i = 0; i < arr.length - d; i++) {
            newArray[i] = arr[d + i];
        }

        for (int i = 0; i < d; i++) {
            newArray[arr.length-d+i] = arr[i];
        }

        for (int i : newArray)
            System.out.print(i + "  ");
    }
}

