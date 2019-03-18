package rocks.zipcode.stringsgalore;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;

public class StringTheory {

    public StringTheory() {

    }
    // Put your code for all 70 exercises starting here.


    //Write a Java program to get the character at the given index within the String


    public static String Exercise1(String input) {
        String str = "Java Exercises!";
        char index1 = input.charAt(0);
        char index2 = input.charAt(10);

        return str + "\n" + index1 + "\n" + index2;
    }

    // Write a Java program to get the character (Unicode code point) at the given index (1 and 9) within the String.


    public static String Exercise2(String input1) {

        String str = "w3resource.com";

        int index1 = input1.codePointAt(1);
        int index2 = input1.codePointAt(9);
        return str + "\n" + index1 + "\n" + index2;

    }
//Write a Java program to get the character (Unicode code point) BEFORE the specified index (1 and 9) within the String.

    public static String Exercise3(String input) {

        String str = "w3resource.com";

        int index1 = input.codePointBefore(1);
        int index2 = input.codePointBefore(9);

        return str + "\n" + index1 + "\n" + index2;
    }

//Write a java program to count a number of Unicode code points in the specified text range of a String

    public static String Exercise4(String input) {

        String str = "w3resource.com";
        int index1 = input.codePointCount(1, 10);

        return str + "\n" + index1;
    }

//Write a java program to compare two strings lexicographically.


    public static String Exercise5(String input1, String input2) {

        int result = input1.compareTo(input2);
        if (result < 0) {
            return input1 + " is less than " + input2;
        } else if (result == 0) {

            return input1 + "is equal to" + input2;
        } else
            return input1 + "is greater than" + input2;
    }

    //Write a java program to compare two strings lexicographically, ignoring case differences.


    public static String Exercise6(String input1, String input2) {

        int result = input1.compareToIgnoreCase(input2);
        if (result < 0) {
            return input1 + " is less than " + input2;
        } else if (result == 0) {

            return input1 + " is equal to " + input2;
        } else
            return input1 + "is greater than" + input2;
    }

//Write a Java program to concatenate a given string to the end of another string.

    public static String Exercise7(String input1, String input2) {

        String result = input1 + input2;

        return result;
    }

//Write a Java program to test if a given string contains the specified sequence of char values.

    public static Boolean Exercise8(String input1, String input2) {

        boolean result = input1.contains(input2);

        return result;
    }

//Write a Java program to compare a given string to the specified character sequence.

    public static Boolean Exercise9(String input1, CharSequence cs) {
        if (input1.contentEquals(cs)) {
            return true;
        }
        return false;
    }

    //Write a Java program to compare a given string to the specified string buffer.

    public static Boolean Exercise10(String input1, StringBuffer sb) {
        if (input1.contentEquals(sb)) {
            return true;
        }
        return false;
    }


//11. Write a Java program to create a new String object with the contents of a character array

    public static String Exercise11(char[] arr_num) {

        String str = String.copyValueOf(arr_num, 1, 3);
        return str;
    }

// 12. Write a Java program to check whether a given string ends with the contents of another string

    public static Boolean Exercise12(String string, String end_str) {

        if (string.endsWith(end_str)) {
            return true;
        } else
            return false;
    }

//13. Write a Java program to check whether two String objects contain the same data.

    public static Boolean Exercise13(String string1, String string2) {

        if (string1.equals(string2)) {
            return true;
        } else
            return false;
    }

//14. Write a Java program to compare a given string to another string, ignoring case considerations.

    public static Boolean Exercise14(String string1, String string2) {
        if (string1.equalsIgnoreCase(string2)) {
            return true;
        } else
            return false;
    }

    //15. Write a java program to print current date and time in the specified format.

    public static String Exercise15(String s) {
        Calendar c = Calendar.getInstance();
        //System.out.format("%tB %te, %tY%n", c, c, c);
        //System.out.format("%tl:%tM %tp%n", c, c, c);
        return String.format("%tB %te, %tY%n", c, c, c);

    }

    //16. Write a Java program to get the contents of a given string as a byte array

    public static String Exercise16(String string) {

        byte[] byte_arr = string.getBytes();
        String new_str = new String(byte_arr);

        return new_str;
    }
//17. Write a Java program to get the contents of a given string as a character array.

    public static char[] Exercise17(String str) {

        char[] arr = new char[]{' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' '};
        str.getChars(4, 10, arr, 2);

        // Display the contents of the byte array.
        System.out.println("The char array equals \"" +
                arr + "\"");
        return arr;

    }

//18. Write a Java program to create a unique identifier of a given string

    public static Integer Exercise18(String str) {
        int hash_code = str.hashCode();

        return hash_code;

    }

//19. Write a Java program to get the index of all the characters of the alphabet.
    public static String Exercise19(String str) {
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (letter >= 'A' && letter <= 'Z')
                System.out.println((int) letter - 'A' + 1);
            if (letter >= 'a' && letter <= 'z')
                System.out.println((int) letter - 'a' + 1);
        }
        return str;
    }
//20. Write a Java program to get the canonical representation of the string object.

    public static Boolean Exercise20(String string1, String string2) {

        if (string1 == string2) {
            return true;
        } else
            return false;

    }

//21. Write a Java program to get the last index of a string within a string.

    public static Integer Exercise21(String string) {
        int lastIndex = string.lastIndexOf(string);

        return lastIndex;
    }
    //22. Write a java program to get the length of a given string.

    public static Integer Exercise22(String string) {

        return string.length();
    }

    //23. Write a Java program to find whether a region in the current string matches a region in another string.
        public static Boolean Exercise23(String string1, String string2) {
        if (string1.regionMatches(0, string2, 28, 8)
            || string1.regionMatches(9, string2, 9, 8)){

            return true;
        } else
        return false;
    }


    //24. Write a Java program to replace all the 'd' characters with 'f' characters.
    public static String Exercise24(String string) {
        String newString = string.replace("d", "f");
        return newString;
    }


//25. Write a Java program to replace each substring of a given string that matches the given
// regular expression with the given replacement.

    public static String Exercise25(String string) {
        String newString = string.replace("fox", "cat");
        return newString;

    }

    //26. Write a Java program to check whether a given string starts with the contents of another string.

    public static Boolean Exercise26(String string1, String string2) {
        if (string1.startsWith(string2)) {
            return true;
        } else
            return false;

    }

//27. Write a Java program to get a substring of a given string between two specified positions.

    public static String Exercise27(String string1) {

        String newString = string1.substring(10, 26);
        return newString;
    }
//28. Write a Java program to create a character array containing the contents of a string.

    public static char[] Exercise28(String string1) {
        char[] arr = string1.toCharArray();
        return arr;
    }

    //29. Write a Java program to convert all the characters in a string to lowercase.

    public static String Exercise29(String string1) {
        return string1.toLowerCase();
    }

//30. Write a Java program to convert all the characters in a string to uppercase.

    public static String Exercise30(String string1) {
        return string1.toUpperCase();
    }
//31. Write a Java program to trim any leading or trailing whitespace from a given string.

    public static String Exercise31(String string1) {
        return string1.trim();
    }
//32. Write a Java program to find longest Palindromic Substring within a string.

    public static String Exercise32(String string1) {
        return string1;
    }


    //33. Write a Java program to find all interleavings of given strings.

    /**
     * not working
     */
    public static String Exercise33(String res, String P, String Q, Set<String> out) {


        if (P.length() > 0) {
            allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
        } else if (Q.length() > 0) {
            allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
        }
        return String.valueOf(out);


    }

    protected static void allInterleavings(String string, String substring, String q, Set<String> out) {
        if (substring.length() == 0 && q.length() == 0) {
            out.add(string);
            return;
        }
    }
    //34. Write a Java program to find the second most frequent character in a given string.

    public static String Exercise34(String str1) {
        final int NOOFCHARS = 256;
        int[] ctr = new int[NOOFCHARS];
        int i;
        for (i = 0; i < str1.length(); i++)
            (ctr[str1.charAt(i)])++;

        int ctr_first = 0, ctr_second = 0;
        for (i = 0; i < NOOFCHARS; i++) {
            if (ctr[i] > ctr[ctr_first]) {
                ctr_second = ctr_first;
                ctr_first = i;
            } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
                ctr_second = i;
        }
        return String.valueOf((char) ctr_second);
    }


//35. Write a Java program to print all permutations of a given string with repetition.

    public static String Exercise35(String string) {
        String newString = showPermutation(string, "");
        return newString;
    }


    private static String showPermutation(String str1, String NewStringToPrint) {
        if (NewStringToPrint.length() == str1.length()) {
            System.out.println(NewStringToPrint);
            return str1;
        }
        for (int i = 0; i < str1.length(); i++) {

            showPermutation(str1, NewStringToPrint + str1.charAt(i));
        }
        return str1;
    }
    //37. Write a Java program to find Length of the longest substring without repeating characters.

    public static String Exercise37(String string) {
        char[] arr1 = string.toCharArray();
        String long_str = null;
        int str_length = 0;
        //   LinkedHashMap & lt;
        return string;

    }

// 38. Write a Java program to print after removing duplicates from a given string

    public static String Exercise38(String string) {

        char[] arr = string.toCharArray();
        String newString = "";
        for (char value : arr) {
            if (newString.indexOf(value) == -1) {
                newString += value;
            }

        }

        return newString;
    }

//39. Write a Java program to find first non repeating character in a string.

    public static String Exercise39(String string) {
        String str = "";

        for (int i = 0; i < string.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < string.length(); j++) {

                if (i != j && string.charAt(i) == string.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                str = String.valueOf(string.charAt(i));
                break;

            }
        }
        return str;

    }

//40. Write a Java program to divide a string in n equal parts.

    public static int Exercise40(String string, int n ) {
        int str_size = string.length();
        int partSize;
        int str =0;
        if (str_size % n != 0) {
            return str;
        } else {
            partSize = str_size / n;
            for (int i = 0; i < str_size; i++) {
                if (i % partSize == 0)
                    str= string.charAt(i);


            }
        }
        return str;
    }


//41. Write a Java program to remove duplicate characters from a given string presents in another given string.

    public static String Exercise41(String string1, String string2 ) {
        char arr[] = new char[string1.length()];
        char mask[] = new char[256];
        String str ="";
        for (int i = 0; i < string2.length(); i++)
            mask[string2.charAt(i)] ++;


        for (int i = 0; i < string1.length(); i++) {
            if( mask[string1.charAt(i)]== 0);
            str = String.valueOf(string1.charAt(i));
            return str;
        }

        return str;
    }

//42. Write a Java program to print list items containing all characters of a given word.

//43. Write a Java program to find the maximum occurring character in a string.


    public static String Exercise43(String string) {
        int N = 256;
        char result = ' ';
        int max = -1;
        int ctr[] = new int[N];
        int l = string.length();

        for (int i = 0; i < l; i++) {
            ctr[string.charAt(i)]++;

                if (max < ctr[string.charAt(i)]) {
                    max = ctr[string.charAt(i)];
                    result = string.charAt(i);
                }

            }

        return String.valueOf(result);

    }

//44. Write a Java program to reverse a string using recursion.
    public static String Exercise44(String string) {

        String result = "";


        if ((string == null) || string.length() <= 1) {
            return string;

        } else {
            String.valueOf(string.charAt(string.length() - 1));
            return string.substring(0, string.length() - 1);
            // return result;
        }
    }

//45. Write a Java program to reverse words in a given string.

        public static String Exercise45(String string){

            StringBuilder sb = new StringBuilder(string);
            String strRev = sb.reverse().toString();

            String [] words = strRev.split(" ");
            StringBuilder reverse = new StringBuilder();
            for(String tmp: words) {
                sb = new StringBuilder(tmp);
                reverse.append(sb.reverse() + " ");
            }
            reverse.deleteCharAt(reverse.length()-1);
            return reverse.toString();

        }

//46. Write a Java program to reverse every word in a string using methods.

    public static String Exercise46(String string) {

        String[] eachWord = string.split(" ");
        String revString = "";
        for (int i = 0; i < eachWord.length; i++) {
            String word = eachWord[i];
            String reverseWord = "";

            for (int j = word.length()-1; j >=0; j-- ) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
            }
            return revString.substring(0,revString.length()-1);
        }
//47. Write a Java program to rearrange a string so that all same characters become d distance away.

    public static String Exercise47(char c, int f) {
       return null;
    }
//48. Write a Java program to remove "b" and "ac" from a given string.
    public static String Exercise48(String string, String ptn1, String ptn2) {
        int n = string.length(), i;
        int ptr = 0;
        char[] arr1 = string.toCharArray();
        for (i = 0; i < n; ++i) {
            if (arr1[i] == 'b') {
                continue;
            } else if (i + 1 < n && arr1[i] == 'a' && arr1[i] + 1 == 'c') {
                ++i;
            } else {
                arr1[ptr++] = arr1[i]; //copy char to head
            }
        }
        char[] ret = Arrays.copyOfRange(arr1, 0, ptr);


        return new String(ret);
    }

//49. Write a Java program to find first non-repeating character from a stream of characters.
//50. Write a Java program to find lexicographic rank of a given string.
        public static int Exercise48(String string) {
            int ctrOfRank= 1;
            int n=0;
            for (int i = 0; i < n; i++) {
                int ctr =0;
                for (int j = i+1; j <=n; j++) {
                    if(string.charAt(i) > string.charAt(j))
                        ctr++;
                }
                ctrOfRank += ctr *makeFactorial(n-i);
                }
                return ctrOfRank;
            }

    private static int makeFactorial(int k) {
        return (k<=2)? k:k * makeFactorial(k-1);
    }




//51. Write a Java program to count and print all the duplicates in the input string.

    public static String Exercise51(String string, int[] count) {

        final int maxChars = 256;

        for (int i = 0; i < string.length(); i++) {
           count[string.charAt(i)]++;

        }


        return null;
        }

//52. Write a Java program to check if two given strings are rotations of each other.

        public static Boolean Exercise52(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);

        }


//53. Write a Java program to match two strings where one string contains wildcard characters.

    public static boolean Exercise53(char[] str1, char[] patstr, int n, int m,
                                      boolean[][] lookup)
    {
        if (m < 0 && n < 0)
        {
            return true;
        }
        else if (m < 0)
        {
            return false;
        }
        else if (n < 0)
        {
            for (int i = 0; i <= m; i++)
            {
                if (patstr[i] != '*')
                {
                    return false;
                }
            }
            return true;
        }
        if (!lookup[m][n])
        {
            if (patstr[m] == '*')
            {
                lookup[m][n] = Exercise53(str1, patstr, n - 1, m, lookup) ||
                        Exercise53(str1, patstr, n, m - 1, lookup);
            }
            else
            {
                if (patstr[m] != '?' && patstr[m] != str1[n])
                {
                    lookup[m][n] = false;
                }
                else
                {
                    lookup[m][n] = Exercise53(str1, patstr, n - 1, m - 1, lookup);
                }
            }
        }
        return lookup[m][n];
    }





}

































