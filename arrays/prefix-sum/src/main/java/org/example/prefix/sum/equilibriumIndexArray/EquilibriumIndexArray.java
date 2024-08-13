package org.example.prefix.sum.equilibriumIndexArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The EquilibriumIndexArray class provides methods to find the equilibrium index of an array.
 *
 * <p>An equilibrium index of an array is an index such that the sum of elements at lower indices
 * is equal to the sum of elements at higher indices. If no such index exists, the methods return -1.
 *
 * <p>This class includes both brute-force and optimal solutions, supporting both ArrayList and
 * primitive array inputs.
 *
 * <p>The brute-force method checks each index by calculating the sum of elements to the left and right,
 * resulting in a time complexity of O(n^2). The optimal method, which is yet to be implemented,
 * will use prefix sums to achieve O(n) time complexity.
 */
public class EquilibriumIndexArray {

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
                return i;
            }
        }
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
                return i;
            }
        }
        return -1;
    }

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