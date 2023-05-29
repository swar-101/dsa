package array;

import java.util.ArrayList;

public class TwoDimensionalArrayProblems {

    // This gives `OutOfMemoryError` figure out why and how can you solve this issue.
    public ArrayList<ArrayList<Integer>> generateAllSubarrays(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i<A.size(); i++) {
            for (int j = i; j<A.size(); i++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                for(int k=i ; k<=j; k++) {
                    subarray.add(A.get(k));
                }
                result.add(subarray);
            }
        }

        return result;
    }
}
