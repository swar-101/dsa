package string.theory;

public class StringTheory {

    /*
     * WHAT IS A STRING IN JAVA?
     * */

    /*
     * 2 WAYS TO CREATE STRING OBJECT:
     * */

    /*
     * FINDING THE LENGTH OF THE STRING
     * */

    /*
     * INDEXING AN ELEMENT IN THE STRING
     * */

    /*
     * CONCATENATING 2 STRINGS
     * */

    /*
    * SUBSTRINGS:
    *   Method: String substring(int beginIndex, int endIndex[optional]) method
    *
    *   Description:
    *       1. Returns a specific part of the form the string.
    *       2. `beginIndex` is inclusive of the character at this index.
    *       3. `endIndex` is exclusive of the character at this index.
    *       4. `endIndex` is optional, if not given it simply means
    *           ending index will be the last element of the string.
    *
    *   Syntax:
    *       string.substring(startingIndex, endingIndex);
    *
    * */

    public void printSubstrings() {
        String str = "Bobo Ashanti";                   // a string literal


        String str1 = str.substring(0, 11);            // point #2 & #3
        String str2 = str.substring(3);      // point #4

        System.out.println(str1);                     //
        System.out.println(str2);                     //
    }

    /*
    * COMPARING 2 STRINGS:
    *   Method: string.equals(anotherString);
    *
    *   Description:
    *       1. The `equals()` method is used to verify if both the string are equal
    *           or not
    *       2. The `equals()` method accepts another string as an argument and then
    *           checks for equality of both the string.
    *       3. If both the string are equal, true is returned else false is returned.
    *
    * */

    public void compareStringsWithEquals() {

        String str = "Zeitgeist";

        String str1 = "zeitgeist";
        String str2 = "Zeitgeist";
        String str3 = "poltergeist";

        System.out.println(str.equals(str1));       // false
        System.out.println(str.equals(str2));       // true
        System.out.println(str.equals(str3));       // false
    }

    /*
    * CHECKING IF A STRING CONTAINS A SUBSTRING:
    * */

    /*
     * JOINING STRINGS TOGETHER:
     * */

    /*
     * STRING CONTAINS
     * */

    /*
     * THE STRING COMPARE TO METHOD
     * */

    /*
     * STRING TO UPPER CASE
     * */

    /*
     * STRING TO LOWER CASE
     * */

    /*
     * REMOVING EXTRA WHITE SPACE FROM A STRING
     * */

    /*
     * REMOVING SPECIFIED CHARACTERS FROM A STRING
     * */

    /*
     * CONCATENATING STRINGS
     * */

    /*
     * CREATING FORMAT STRINGS
     * */

    /*
     * USING ESCAPE SEQUENCES IN STRINGS
     * */

    /*
     * ARE JAVA STRINGS MUTABLE?
     * */
}
