package math.advancedproblem.code;

import java.util.*;

public class PrimeNumberProblem {

    /*
    * Given an integer A. Find the list of all prime numbers in the range [1,A].
    * */

    public ArrayList<Integer> findAllPrimes(int A) {

        ArrayList<Boolean> p = new ArrayList<>(Collections.nCopies(A, true));
        p.set(0, false);
        p.set(1, false);

        for(int i = 2; i*i <= A; i++) {
            if(p.get(i)==true) {
                // when i will be 2
                // j = i*i
                // j will be 4,
                // j = j + i = 4 + 2 = 6
                // j <= A -> 6 <= 10
                // so,
                //
                for(int j = i*i; j <= A; j = j+i) {

                }
            }
        }
        for(int i )

        return null;
    }


}
