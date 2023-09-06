package array.problem.code;

import java.util.ArrayList;

public class TwoDimensionalArrayProblem {

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

    public ArrayList<Integer> sumOfEvenIndices(ArrayList<Integer> A,
                                               ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<B.size(); i++) {
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);

            for(int j=L; j<=R; j++) {
                sum = sum + A.get(j);
            }

            ans.add(sum);
        }
        return ans;
    }
}
