import array.problem.code.*;
import string.problem.code.StringProblemsUsingCollection;
import string.theory.StringTheory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringTheory s1 = new StringTheory();

        s1.printSubstrings();
        s1.compareStringsWithEquals();

        StringProblemsUsingCollection s2 = new StringProblemsUsingCollection();

        s2.reverse("Brothers on the slide");

//        StringProblems s2 = new StringProblems();
//
//        System.out.println(s2.reverse("Milwaukee is a pretty place!"));
//        System.out.println(s2.toggle(new char[]{'a','N','I','r','t'}));
//        System.out.println(s2.isPalindrome("level"));
//
//
//        StringProblemsUsingCollection s3 = new StringProblemsUsingCollection();
//
//        System.out.println(s3.toLowercase(new ArrayList<>(Arrays.asList('A','S','C','i','i'))));
//        System.out.println(s3.longestPalindrome("abax"));

        TwoDimensionalArrayProblem twoDimensionalArrayProblem =
                new TwoDimensionalArrayProblem();

        twoDimensionalArrayProblem.sumOfEvenIndices(new ArrayList<>(List.of(2, 1, 8, 3, 9)),
                new ArrayList<>(
                        List.of( new ArrayList<>(List.of(0,3)),
                                new ArrayList<>(List.of(0,3))
                        )
                )
        );
        System.out.println();

        System.out.println("end of execution.");





/*
        TwoDimensionalArrayProblem twoDimensionalArrayProblems = new TwoDimensionalArrayProblem();
        ArrayList<Integer> array = new ArrayList<>(List.of(1,3,5,6));
        twoDimensionalArrayProblems.generateAllSubarrays(array);
*/



    }


}