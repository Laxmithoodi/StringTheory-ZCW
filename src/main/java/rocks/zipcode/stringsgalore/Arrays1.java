package rocks.zipcode.stringsgalore;

import java.util.Arrays;
import java.util.stream.Stream;

public class Arrays1 {

    public static void main(String[] args) {




 /**  reverse a string  */

        String str = "World";

        StringBuilder sb = new StringBuilder(str);
        //  sb.reverse();
        System.out.println(sb.reverse());


 /**  print a string array */

        String[] strArray = {"John", "Mary", "Bob"};
        Stream.of(strArray).forEach(System.out::println);


 /**  print each element in Array  with element length */

        for (int i = 0; i < strArray.length; i++) {
            int temp = 0;
            temp = strArray[i].length();

            System.out.println(strArray[i] + " - " + "length of word: " + temp);
        }




/**  reverse an array */

        int[] arr = {10, 20, 30, 40, 50};


        System.out.println(Arrays.toString(reverse(arr)));

    }


    public static int[] reverse(int[] arr1) {


        int temp = 0;

        for (int i = 0; i < arr1.length / 2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;


        }
        return arr1;

    }

    public static int[] reverse1(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }
        return reverseArray;
    }



    }






