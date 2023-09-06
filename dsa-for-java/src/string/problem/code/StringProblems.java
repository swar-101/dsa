package string.problem.code;

public class StringProblems {
    /*
     * 1. Given a string A, you are asked to reverse a string and return the reverse string
     * */
    public String reverse(String A) {

        char[] charArray = A.toCharArray();

        int i = 0;
        int j = A.length() - 1;

        while (i<j) {

            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }

        return new String(charArray);
    }

    /*
     *__________________________________________________________________________________________
     * Time  Complexity:
     * Space Complexity:
     * _________________________________________________________________________________________
/     * */

    /*
    * 2. Given a character array of size N, toggle the uppercase/lowercase.
    * */
    public char[] toggle(char[] A) {

        for(int i = 0; i < A.length; i++) {

            // if the element is upper case
            int temp;
            int ascii = A[i];

            if((int)A[i] > 90) {

                // subtracting 32 to get the ASCII value of lower case letter
                temp = ascii - 32;

            }
            else {

                // conversely, adding 32 to get the ASCII value of upper case letter
                temp = ascii + 32;
            }

            // typecasting the value to char and assigning it to the current index
            A[i] = (char) temp;
        }

        return A;
    }

    /*
     *__________________________________________________________________________________________
     * Time  Complexity:
     * Space Complexity:
     * ___________________________________________________________________________________________
     * */

    /*
    * 3. Given string A, check if palindrome or not
    * */

    public boolean isPalindrome(String A) {

        char[] charArray = A.toCharArray();

        int i = 0;
        int j = charArray.length-1;


        while (i<j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            j--;
            i++;

        }
        String charArrayString = new String(charArray);
        System.out.println("charArray :" + charArray);
        System.out.println("A :" + A);

        if(A.equals(charArrayString)) {
            System.out.println("A " + A);
            return true;
        }
        return false;
    }

    /*
     *__________________________________________________________________________________________
     * Time  Complexity:
     * Space Complexity:
     * ___________________________________________________________________________________________
     * */

}
