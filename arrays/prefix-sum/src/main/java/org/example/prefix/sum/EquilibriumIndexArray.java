package org.example.prefix.sum;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexArray {

    /**
     * This method checks if A is an Equilibrium Index Array.
     * It returns the Equilibrium Index if it is an Equilibrium Index Array.
     * It returns -1 if it is not an Equilibrium Index Array.
     *
     * @param A input array
     * @return return the Equilibrium Index if A is an Equilibrium Index Array
     */
    public static int isEquilibriumIndexArrayWithBruteForce(ArrayList<Integer> A) {
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

    private static int isEquilibriumIndexArrayInPrim(int[] a) {
        for (int i = 0; i < a.length; i++) {

            // Calculate left sum
            int leftSum = 0;
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    leftSum = leftSum + a[j];
                }
            }

            // Calculate right sum
            int rightSum = 0;
            for (int j = a.length - 1; j > i; j--) {
                rightSum = rightSum + a[j];
            }

            if (leftSum == rightSum) {
                System.out.println("The equilibrium index is: " + i);
                return i;
            }
        }
        System.out.println("The input array is not an Equilibrium Index Array");
        return -1;
    }

    /**
     * This method checks if array A is an Equilibrium Index Array or not.
     * An Equilibrium Index Array is an array that has an index, whose value is equal to the sum of the
     * values of its lower indices and higher indices.
     *
     * @param A input array
     * @return returns the Equilibrium Index if it is an Equilibrium Index Array or returns -1 if it is not.
     */
    public static int isEquilibriumIndexArrayUsingPrefixSum(ArrayList<Integer> A) {
        // Todo: Complete this!!
        return 1;
    }

    public static int isEquilibriumIndexArrayUsingPrefixSum(int[] a) {
        // Todo: Complete this!!
        return 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, -4, 1, 6));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0, 0, 0));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(1, 3, 3, 5));

        int[] a = {1, 2, 3, -4, 1, 6};
        int[] b = {0, 0, 0};
        int[] c = {1, 2, 3, 3};
        int[] d = {1, 3, 3, 5};

        System.out.println("B R U T E    F O R C E");

        System.out.println("----------------------Using ArrayList----------------------");
        System.out.println("Input Array: " + A);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayWithBruteForce(A));

        System.out.println("Input Array: " + B);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayWithBruteForce(B));

        System.out.println("Input Array: " + C);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayWithBruteForce(C));

        System.out.println("Input Array: " + D);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayWithBruteForce(D));

        System.out.println("------------------Using primitive array-------------------");
        System.out.println("Input Array: " + Arrays.toString(a));
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayInPrim(a));

        System.out.println("Input Array: " + Arrays.toString(b));
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayInPrim(b));

        System.out.println("Input Array: " + Arrays.toString(c));
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayInPrim(c));

        System.out.println("Input Array: " + Arrays.toString(d));
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayInPrim(d));

        System.out.println("------------------Complexity Analysis---------------------");
        System.out.println("Time Complexity  : O(n^2)");
        System.out.println("Space Complexity : O(1)");
        System.out.println("-----------------------------------------------------------");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.println("O P T I M A L");
        System.out.println("-----------------------------------------------------------");

        System.out.println("----------------------Using ArrayList----------------------");
        System.out.println("Input Array: " + A);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayUsingPrefixSum(A));

        System.out.println("Input Array: " + B);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayUsingPrefixSum(B));

        System.out.println("Input Array: " + C);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayUsingPrefixSum(C));

        System.out.println("Input Array: " + D);
        System.out.println("Equilibrium Index: " + isEquilibriumIndexArrayUsingPrefixSum(D));

        System.out.println("-----------------Using primitive array-------------------");

        System.out.println("------------------Complexity Analysis-----------------------");
        System.out.println("Time Complexity  : O(n)");
        System.out.println("Space Complexity : O(n)");
        System.out.println("------------------------------------------------------------");
    }
}