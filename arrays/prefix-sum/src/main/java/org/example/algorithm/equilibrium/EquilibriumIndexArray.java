package org.example.algorithm.equilibrium;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexArray {

    /**
     * This method checks if A is an Equilibrium Index Array.
     * It returns the Equilibrium Index if it is an Equilibrium Index Array.
     * It returns -1 if it is not an Equilibrium Index Array
     *
     * @param A input array
     * @return return the Equilibrium Index if A is an Equilibrium Index Array
     */
    public static int isEquilibriumIndexArrayInBruteForce(ArrayList<Integer> A) {

        for (int i = 0; i < A.size(); i++) {
            int leftSum = 0;
            for (int left = i - 1; left >= 0; left--) {
                leftSum = leftSum + A.get(left);
            }

            int rightSum = 0;
            for (int right = i + 1; right < A.size(); right++) {
                rightSum = rightSum + A.get(right);
            }

            if (leftSum == rightSum) {
                System.out.println("The equilibrium index is: " + i);
                return i;
            }
        }
        System.out.println("The input array is not an Equilibrium Index Array");
        return -1;
    }

    public static int isEquilibriumIndexArrayUsingPrefixSum(ArrayList<Integer> A) {
        return 1;
    }

    public static void main(String[] args) {
        isEquilibriumIndexArrayInBruteForce(new ArrayList<Integer>(Arrays.asList(1, 2, 3, -4, 1, 6)));
        isEquilibriumIndexArrayInBruteForce(new ArrayList<Integer>(Arrays.asList(0, 0, 0)));
        isEquilibriumIndexArrayInBruteForce(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3)));
        isEquilibriumIndexArrayInBruteForce(new ArrayList<Integer>(Arrays.asList(1, 3, 3, 5)));

//        isEquilibriumIndexArrayUsingPrefixSum();
//        isEquilibriumIndexArrayUsingPrefixSum();
//        isEquilibriumIndexArrayUsingPrefixSum();
    }
}