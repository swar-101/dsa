package org.example.algorithm.rangequery;

import java.util.Arrays;

public class RangeQuery {

    public static int[] returnRangeQuerySums(int[] a, int[][] queries) {
    // Edge cases:

        // if input is null
        if (null == queries) {
            throw new IllegalArgumentException();
        }

        // validate if queries are in bound with array 'a'
        for (int[] query : queries) {
            if (query[0] < 0 || query[1] >= a.length || query[0] > query[1]) {
                throw new IllegalArgumentException("Query indices are out of bounds.");
            }
        }

        // Create a prefix sum
        int[] prefixSum = new int[a.length];
        prefixSum[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }

        // create an array to return the range query sums
        int[] rangeQuerySums = new int[queries.length];

        // resolve queries using loop
        int sum = 0;
        for (int i = 0; i < queries.length; i++) {

            int right = queries[i][1];
            int left = queries[i][0];

            if (left == 0) {
                System.out.println(prefixSum[right] + "-" + prefixSum[left]);
                sum = prefixSum[right];
            }


            else {
                System.out.println(prefixSum[right] + "-" + prefixSum[left]);
                sum = prefixSum[right] - prefixSum[left-1];
            }
            rangeQuerySums[i] = sum;
        }

        return rangeQuerySums;
    }

    public static void main(String[] args) {
        // ---------------  0  1  2  3  4
        int[] a = new int[]{1, 3, 5, 3, 5};
        int[][] queries = new int[][]{{0, 2}, {1, 3}, {2, 4}};

        // Answers :
        // prefix sum array {1, 4, 9, 12, 17}
        // 1. 1 + 3 + 5 => 9
        // 2. 3 + 5 + 3 => 12 - 4 = 11
        // 3. 5 + 3 + 5 = 13

        int[] answer = returnRangeQuerySums(a, queries);
        System.out.println("Range Query Sums: " + Arrays.toString(answer));
    }
}