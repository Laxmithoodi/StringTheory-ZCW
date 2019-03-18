package rocks.zipcode.stringsgalore;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conditional {

    public static int Exercise1(int n) {

        if (n > 0) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("number is negative");
        } else
            System.out.println("number is zero");
             return n;
    }



    public static int Exercise2(int a, int b, int c) {

        if ( (a>b) && (a>c) ){
            System.out.println(" a is greatest number");

        } else if ( b>c  && b >a  ) {
            System.out.println(" b  greatest number");
        } else
            System.out.println("c is greatest number");

      return c;
    }


    /** 5. Write a Java program that keeps a number from the user and
    generates an integer between 1 and 7 and displays the name of the weekday */

    public static String Exercise5(int day){
        String dayName = "";

        switch (day){

            case 1: dayName ="Monday"; break;
            case 2: dayName ="Tuesday"; break;
            case 3: dayName ="Wednesday"; break;
            case 4: dayName ="Thursday"; break;
            case 5: dayName ="Friday"; break;
            case 6: dayName ="Saturday"; break;
            case 7: dayName ="Sunday"; break;
            default: dayName = "not valid day range";
          }

          return dayName;
    }


    /**6. Write a Java program that reads in two floating-point numbers
     and tests whether they are the same up to three decimal places.  */

    public static String Exercise6(float a, float b){
            String result ="";

            if(a == b){result = "same number";
            } else

            result = "numbers are diferent";

        return result;
    }


/** 7. Write a Java program to find the number of days in a month */

    public static int Exercise7(int iYear, int iMonth, int iday){
       // int iMonth = Calendar.FEBRUARY; // 1 (months begin with 0)

        Calendar mycal = new GregorianCalendar(iYear, iMonth, iday);

        return mycal.getActualMaximum(Calendar.DAY_OF_MONTH);

      }
/**10. Write a program in Java to display the first 10 natural numbers. */

    public static int Exercise10(int n ){

        for(int i=0; i<=10; i++){

            System.out.println(i);
        }



        return n;
    }



    }






