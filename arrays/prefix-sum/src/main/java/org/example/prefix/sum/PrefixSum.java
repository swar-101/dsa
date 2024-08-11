package org.example.prefix.sum;

import java.util.Arrays;

public class PrefixSum {

    public static int[] returnPrefixSum(int[] a) {
        if (a == null)
            throw new IllegalArgumentException("Input array is null.");
        if (a.length == 0)
            throw new IllegalArgumentException("Input array is empty.");

        int[] prefixSumArray = new int[a.length];
        prefixSumArray[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefixSumArray[i] = prefixSumArray[i-1] + a[i];
        }

        return prefixSumArray;
    }

    public static void main(String[] args) {
        int[] prefixSumArray = returnPrefixSum(new int[]{1, 3, 5, 3, 3, 2});
        System.out.println("Prefix sum array: " + Arrays.toString(prefixSumArray));
    }
}