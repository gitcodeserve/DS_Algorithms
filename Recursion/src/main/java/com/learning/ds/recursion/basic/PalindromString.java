package com.learning.ds.recursion.basic;

public class PalindromString {
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(String.format("String {%s} is palindrom {%b}", str, isPalindrom(str, 0, str.length() - 1)));

    }

    private static boolean isPalindrom(String str, int firstIndex, int lastIndex) {

        //Base 1 check for the first and last element
        if (str.charAt(firstIndex) != str.charAt(lastIndex))
            return false;

        // Check if it is having only one charactor or middle of the character
        if (firstIndex == lastIndex)
            return true;
        // If first index values crosses the last index values i.e. half string traversed
        if (firstIndex > lastIndex)
            return true;

        return isPalindrom(str, firstIndex + 1, lastIndex - 1);
    }
}
