package com.learning.ds.recursion.basic;

public class MaxRoleCutExample {

    public static void main(String[] args) {
        int lengthOfRole = 12;

        int firstSize = 4;
        int secondSize = 3;
        int thirdCut = 2;
        int nunerOfCuts = getMaximumRoleCuts(lengthOfRole, firstSize, secondSize, thirdCut);

        System.out.println(String.format("Role of size {%d} can be maximum cut into {%d} pieces using first {%d}, second {%d}, third {%d}",
                lengthOfRole, nunerOfCuts, firstSize, secondSize, thirdCut));
    }

    private static int getMaximumRoleCuts(int lengthOfRole, int firstSize, int secondSize, int thirdCut) {

        if (lengthOfRole == 0)
            return 0;

        if(lengthOfRole == -1)
            return -1;

        int res =  Math.max(Math.max(getMaximumRoleCuts(lengthOfRole-firstSize, firstSize, secondSize, thirdCut),
                getMaximumRoleCuts(lengthOfRole-firstSize, firstSize, secondSize, thirdCut)),
                getMaximumRoleCuts(lengthOfRole-firstSize, firstSize, secondSize, thirdCut));

        if (res == -1)
            return -1;
        return res+1;
    }

    private static int maximum(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3)
            return n1;

        else if(n2 > n1 && n2 > n3)
            return n2;

        else
            return n3;

    }
}
