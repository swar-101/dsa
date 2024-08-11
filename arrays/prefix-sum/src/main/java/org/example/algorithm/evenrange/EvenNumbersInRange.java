package org.example.algorithm.evenrange;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersInRange {

    private static int[] findEvenNumbersInRangeInPrim(int[] A, int[][] queries) {
        // Precalculate Even and Odd Array : B
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] % 2;
        }
        System.out.println("Precalculated array B: " + Arrays.toString(B));

        // Iterate over the queries to add the count of even numbers
        int[] rangeQueryEvenNumbers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int left = queries[i][0];
            int right = queries[i][1];

            for (int j = left; j <= right; j++) {
                if (B[j] == 0) {
                    count = count + 1;
                }
            }
            rangeQueryEvenNumbers[i] = count;
        }

        return rangeQueryEvenNumbers;
    }


    public static ArrayList<Integer> findEvenNumbersInRange(ArrayList<Integer> A,
                                                            ArrayList<ArrayList<Integer>> queries) {
        // Create a pre-calculated array for even and odd entries in the array
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                B.add(0);
            } else {
                B.add(1);
            }
        }
        System.out.println("The pre-calculated array for Even and Odd entries: " + B);

        // Iterate over queries array to calculate the number of even numbers in
        ArrayList<Integer> evenNumberCountArray = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int left = queries.get(i).get(0);
            int right = queries.get(i).get(1);
            int count = 0;
            for (int j = left; j <= right; j++) {
                if (B.get(j) == 0) {
                    count++;
                }
            }
            evenNumberCountArray.add(count);
        }

        return evenNumberCountArray;
    }

    public static void main(String[] args) {
        System.out.println("Find even numbers in range using Primitive Array");
        int [] A = findEvenNumbersInRangeInPrim(new int[]{1, 2, 3, 4, 5}, new int[][]{{0, 2}, {2, 4}, {1, 4}});
        System.out.println("The answer to the above range of queries: " + Arrays.toString(A));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Find even numbers in range using ArrayList: ");
        ArrayList<Integer> B = findEvenNumbersInRange(new ArrayList<>(Arrays.asList(1, 2, 58, 32, 21, 23, 55, 32)),
                                                      new ArrayList<>(
                                                              Arrays.asList(
                                                                    new ArrayList<>(Arrays.asList(1, 2)),
                                                                    new ArrayList<>(Arrays.asList(2, 6)),
                                                                    new ArrayList<>(Arrays.asList(1, 7))
                                                              )
                                                      )
        );

        System.out.println("The answer to the above range of queries: " + B);
    }
}