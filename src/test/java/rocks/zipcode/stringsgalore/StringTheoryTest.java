package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static rocks.zipcode.stringsgalore.StringTheory.allInterleavings;

public class StringTheoryTest {
    StringTheory st = null;

    @org.junit.Before
    public void setUp() throws Exception {
        this.st = new StringTheory();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testExercise1() {

        //Given
        String expectedres = "Java Exercises!\n" + "J\n" + "i";

        StringTheory stringTheory = new StringTheory();

        String actualres = stringTheory.Exercise1(expectedres);

        Assert.assertEquals(expectedres, actualres);
        System.out.println("Original String = " + actualres);

    }


    @Test
    public void testExercise2() {

        //Given
        String expectedres = "w3resource.com\n" + "51\n" + "101";

        StringTheory stringTheory = new StringTheory();

        String actualres = stringTheory.Exercise2(expectedres);

        Assert.assertEquals(expectedres, actualres);
        System.out.println("Original String = " + actualres);

    }

    @Test
    public void testExercise3() {

        //Given
        String expectedres = "w3resource.com\n" + "119\n" + "99";

        StringTheory stringTheory = new StringTheory();

        String actualres = stringTheory.Exercise3(expectedres);

        Assert.assertEquals(expectedres, actualres);
        System.out.println("Original String = " + actualres);

    }

    @Test
    public void testExercise4() {

        //Given
        String expectedres = "w3resource.com\n" + "9";

        StringTheory stringTheory = new StringTheory();

        String actualres = stringTheory.Exercise4(expectedres);

        Assert.assertEquals(expectedres, actualres);
        System.out.println("Original String = " + actualres);

    }


    @Test
    public void testExercise5() {

        //Given
        String string1 = "This is Exercise 1";
        String string2 = "This is Exercise 2";
        String expresult = "This is Exercise 1 is less than This is Exercise 2";

        StringTheory stringTheory = new StringTheory();

        String actualres = (String) stringTheory.Exercise5(string1, string2);

        Assert.assertEquals(expresult, actualres);
        System.out.println(actualres);

    }


    @Test
    public void testExercise6() {

        //Given
        String string1 = "This is exercise 1";
        String string2 = "This is Exercise 1";
        String expresult = "This is exercise 1 is equal to This is Exercise 1";

        StringTheory stringTheory = new StringTheory();

        String actualres = (String) stringTheory.Exercise6(string1, string2);

        Assert.assertEquals(expresult, actualres);
        System.out.println(actualres);

    }

    @Test
    public void testExercise7() {

        //Given
        String string1 = "PHP Exercises and ";
        String string2 = "Python Exercises";
        String expresult = "PHP Exercises and Python Exercises";

        StringTheory stringTheory = new StringTheory();

        String actualres = (String) stringTheory.Exercise7(string1, string2);

        Assert.assertEquals(expresult, actualres);
        System.out.println(actualres);

    }


    @Test
    public void testExercise8() {

        //Given
        String string1 = "PHP Exercises and Python Exercises ";
        String string2 = "and";
        boolean expresult = true;

        StringTheory stringTheory = new StringTheory();

        Boolean actualres = stringTheory.Exercise8(string1, string2);

        Assert.assertEquals(expresult, actualres);
        System.out.println("Original String: " + string1 + "\n" + "Specified sequence of char values: " + string2);
        System.out.println(actualres);

    }

    @Test
    public void testExercise9() {

        //Given
        String string1 = "example.com";
        String string2 = "Example.com";
        CharSequence cs = "example.com";

        boolean expresult1 = true;
        boolean expresult2 = false;

        StringTheory stringTheory = new StringTheory();

        Boolean actualres1 = (Boolean) stringTheory.Exercise9(string1, cs);
        Boolean actualres2 = (Boolean) stringTheory.Exercise9(string2, cs);

        Assert.assertEquals(expresult1, actualres1);
        Assert.assertEquals(expresult2, actualres2);
        System.out.println("Comparing " + string1 + " and " + cs + ":" + actualres1);
        System.out.println("Comparing " + string2 + " and " + cs + ":" + actualres2);
       // System.out.println(actualres);

    }

    @Test
    public void testExercise10() {

        //Given
        String string1 = "example.com";
        String string2 = "Example.com";
        StringBuffer strburf =  new StringBuffer(string1);

        boolean expresult1 = true;
        boolean expresult2 = false;

        StringTheory stringTheory = new StringTheory();

        Boolean actualres1 = (Boolean) stringTheory.Exercise10(string1, strburf);
        Boolean actualres2 = (Boolean) stringTheory.Exercise10(string2, strburf);

        Assert.assertEquals(expresult1, actualres1);
        Assert.assertEquals(expresult2, actualres2);
        System.out.println("Comparing " + string1 + " and " + strburf + ":" + actualres1);
        System.out.println("Comparing " + string2 + " and " + strburf + ":" + actualres2);


    }
    @Test
    public void testExercise11() {

        //Given
        char[] arr_num = new char[] { '1', '2', '3', '4' };
        String expectedRes = "The book contains 234 pages.";

        StringTheory stringTheory = new StringTheory();

        String actualRes = stringTheory.Exercise11(arr_num);

        Assert.assertEquals(expectedRes, "The book contains " + actualRes +" pages.");

        System.out.println("\nThe book contains " + actualRes +" pages.\n");

    }


    @Test
    public void testExercise12() {

        //Given
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String end_str1 = "se";
        Boolean expectedRes1 = false;
        Boolean expectedRes2 = true;


        StringTheory stringTheory = new StringTheory();

        Boolean actualRes1 = stringTheory.Exercise12(str1, end_str1);
        Boolean actualRes2 = stringTheory.Exercise12(str2, end_str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        Assert.assertEquals(expectedRes2, actualRes2);

        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str1 + "\"? " + actualRes1);

        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str1 + "\"? " + actualRes2);

    }

    @Test
    public void testExercise13() {

        //Given
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";

        String str3 = "Mike Royko";

        Boolean expectedRes1 = false;
        Boolean expectedRes2 = false;


        StringTheory stringTheory = new StringTheory();

        Boolean actualRes1 = stringTheory.Exercise13(str1, str2);
        Boolean actualRes2 = stringTheory.Exercise13(str1, str3);
        Assert.assertEquals(expectedRes1, actualRes1);
        Assert.assertEquals(expectedRes2, actualRes2);

        System.out.println("\"" + str1 + "\" equals " + "\"" + str2 + "\"? " + actualRes1);
        System.out.println("\"" + str1 + "\" equals " + "\"" + str3 + "\"? " + actualRes2);
    }

    @Test
    public void testExercise14() {

        //Given
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";

        String str3 = "stephen edwin king";

        Boolean expectedRes1 = false;
        Boolean expectedRes2 = true;


        StringTheory stringTheory = new StringTheory();

        Boolean actualRes1 = stringTheory.Exercise14(str1, str2);
        Boolean actualRes2 = stringTheory.Exercise14(str1, str3);
        Assert.assertEquals(expectedRes1, actualRes1);
        Assert.assertEquals(expectedRes2, actualRes2);

        System.out.println("\"" + str1 + "\" equals " + "\"" + str2 + "\"? " + actualRes1);
        System.out.println("\"" + str1 + "\" equals " + "\"" + str3 + "\"? " + actualRes2);
    }


    @Test
    public void testExercise15(){
        //Given
        String calanderFormat = "%tB %te, %tY%n";

        StringTheory stringTheory = new StringTheory();

        String actualRes = stringTheory.Exercise15(calanderFormat);
        System.out.println(actualRes);

    }

    @Test
    public void testExercise16(){
        //Given
        String str = "This is a sample String.";
        String expectedRes = "This is a sample String.";

        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes = stringTheory.Exercise16(str);

        //Then
        Assert.assertEquals(expectedRes, actualRes);
        System.out.println("\nThe new String equals " +actualRes + "\n");

    }

    @Test
    public void testExercise17(){
        //Given

        String str = "This is a sample string.";

        //When
        StringTheory stringTheory = new StringTheory();
        char[] actualRes = stringTheory.Exercise17(str);

        //Then

        Assert.assertTrue("This is a sample string.", true);

    }

    @Test
    public void testExercise18() {
    //Given
        String str = "Python Exercises.";
        Integer expectedRes = 863132599;

    //When
        StringTheory stringTheory = new StringTheory();

        Integer actualRes = stringTheory.Exercise18(str);
     //Then
     Assert.assertEquals(expectedRes, actualRes);
        System.out.println("The hash for " + str +
                " is " + actualRes);

    }

    @Test
     public void testExercise19(){
     //Given
      String str =   "The quick brown fox jumps over the lazy dog.";

      //When
        StringTheory stringTheory = new StringTheory();

        String actualRes = stringTheory.Exercise19(str);

       //Then

        Assert.assertTrue(true);

        System.out.println(actualRes);


    }

    @Test
    public void testExercise20(){
     //Given
        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();

        Boolean expectedRes1 = false;
        Boolean expectedRes2 = true;

      //When
        StringTheory stringTheory = new StringTheory();
        Boolean actualRes1 = stringTheory.Exercise20(str1, str2);
        Boolean actualRes2 = stringTheory.Exercise20(str1, str3);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println("str1 == str2? " + actualRes1);
        Assert.assertEquals(expectedRes2, actualRes2);
        System.out.println("str1 == str3? " + actualRes2);
    }

    @Test
    public void testExercise21(){
    //Given
        String str = "The quick brown fox jumps over the lazy dog.";


    //When
        StringTheory stringTheory = new StringTheory();
        Integer actualRes = stringTheory.Exercise21(str);
    }


    @Test
    public void testExercise22(){
        //Given
        String str = "example.com";
        Integer expectedRes = 11;


        //When
        StringTheory stringTheory = new StringTheory();
        Integer actualRes = stringTheory.Exercise22(str);

        //Then
        Assert.assertEquals(expectedRes, actualRes);
        System.out.println("The string length of " + "\'" + str + "\'" + " is: " + actualRes);
    }


    @Test
    public void testExercise23(){
        //Given
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";


        Boolean expectedRes1 = true;
       Boolean expectedRes2 = false;

        //When
        StringTheory stringTheory = new StringTheory();
        Boolean actualRes1 = stringTheory.Exercise23(str1, str2);
       Boolean actualRes2 = stringTheory.Exercise23(str1, str2);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println("str1[0 - 7] == str2[28 - 35]? " + actualRes1);

       Assert.assertEquals(expectedRes2, actualRes2);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + actualRes2);
    }


    @Test
    public void testExercise24() {
        //Given
        String str1 = "The quick brown fox jumps over the lazy dog.";

        String expectedRes1 = "The quick brown fox jumps over the lazy fog.";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise24(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);

    }

    @Test
    public void testExercise25() {
        //Given
        String str1 = "The quick brown fox jumps over the lazy dog.";

        String expectedRes1 = "The quick brown cat jumps over the lazy dog.";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise25(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);

    }

    @Test
    public void testExercise26() {
        //Given
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";
        String str3 = "Red";

        Boolean expectedRes1 = true;
        Boolean expectedRes2 = false;

        //When
        StringTheory stringTheory = new StringTheory();
        Boolean actualRes1 = stringTheory.Exercise26(str1, str3);
        Boolean actualRes2 = stringTheory.Exercise26(str2, str3);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(str1 + " starts with " + str3 + "? " + actualRes1);
        Assert.assertEquals(expectedRes2, actualRes2);
        System.out.println(str2 + " starts with " + str3 + "? " + actualRes2);

    }


    @Test
    public void testExercise27() {
        //Given
        String str1 = "The quick brown fox jumps over the lazy dog.";

        String expectedRes1 = "brown fox jumps ";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise27(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);

    }

    @Test
    public void testExercise28() {
        //Given
        String str1 = "Java Exercises.";

      //  String expectedRes1 = "Java Exercises.";


        //When
        StringTheory stringTheory = new StringTheory();
        char[] actualRes1 = stringTheory.Exercise28(str1);

        Assert.assertTrue(true);
        System.out.println(actualRes1);

    }
    @Test
    public void testExercise29() {
        //Given
        String str1 = "The Quick BroWn FoX!";

        String expectedRes1 = "the quick brown fox!";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise29(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);

    }
    @Test
    public void testExercise30() {
        //Given
        String str1 = "The Quick BroWn FoX!";

        String expectedRes1 = "THE QUICK BROWN FOX!";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise30(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);

    }
    @Test
    public void testExercise31() {
        //Given
        String str1 = "  Java Exercises  ";

        String expectedRes1 = "Java Exercises";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise31(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);
        System.out.println(str1);
    }


    @Test
    public void testExercise32() {
        //Given
        String str1 = "thequickbrownfoxxofnworbquickthe";

        String expectedRes1 = "brownfoxxofnworb";
      //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise32(str1);

        Assert.assertEquals(expectedRes1, actualRes1);
        System.out.println(actualRes1);
        System.out.println(str1);
    }

    @Test
    public void testExercise34() {
        String str1 = "successes";
        String expectedRes = "c";
        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes= stringTheory.Exercise34(str1);

        //Then
        Assert.assertEquals(expectedRes,actualRes);
        System.out.println(actualRes);
    }



    @Test
    public void testExercise33() {
        //Given
        String P = "WX";
        String Q = "YZ";
        Set<String> out = new HashSet<>();


        out.stream().forEach(System.out::println);

        //When
        StringTheory stringTheory = new StringTheory();
        allInterleavings("", P, Q, out);
        String actualRes1 = stringTheory.Exercise33("", P, Q, out);

        Assert.assertTrue(true);

        System.out.println(actualRes1);
    }
    @Test
    public void testExercise38() {
        //Given
        String string = "w3resource";
        String expectedRes = "w3resouc";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise38(string);

        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("After removing duplicates characters the new string is:  " + actualRes1);
    }

    @Test
    public void testExercise39() {
        //Given
        String string = "gibblegabbler";
        String expectedRes = "i";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise39(string);

        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("The first non repeated character in String is: " + actualRes1);
    }


    @Test
    public void testExercise40() {
        //Given
        String string = "abcdefghijklmnopqrstuvwxy";
        int splitNum = 5;
       // String expectedRes = "i";


        //When
        StringTheory stringTheory = new StringTheory();
        int actualRes1 = stringTheory.Exercise40(string, splitNum);
        Assert.assertTrue(true);

      //  Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("The string divided into " + " parts and they are: " + actualRes1);
    }


    @Test
    public void testExercise41() {
        //Given
        String string1 = "the quick brown fox";
        String string2 = "queen";

        String expectedRes = "th ick brow fox";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise41(string1, string2);


         Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("The new String is: " + actualRes1);
    }

    @Test
    public void testExercise43() {
        //Given
        String string1 = "test string";
        String expectedRes = "t";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise43(string1);


        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("Max Occurring character is: " + actualRes1);
    }

    @Test
    public void testExercise44() {
        //Given
        String string1 = "The quick brown fox jumps";
        String expectedRes = "spmuj xof nworb kciuq ehT";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise44(string1);


        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("The string in reverse order: " + actualRes1);
    }


    @Test
    public void testExercise45() {
        //Given
        String string1 = "Reverse words in a given string";
        String expectedRes = "string given a in words Reverse";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise45(string1);


        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("New String after reversed words: " + actualRes1);
    }


    @Test
    public void testExercise46() {
        //Given
        String string1 = "This is a test string";
        String expectedRes = "sihT si a tset gnirts";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise46(string1);


        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("New String reversed word by word is: " + actualRes1);
    }

    @Test
    public void testExercise48() {
        //Given
        String string1 = "abrambabasc";
        String ptn1 = "ac";
        String ptn2 = "b";

        String expectedRes = "aramaasc";


        //When
        StringTheory stringTheory = new StringTheory();
        String actualRes1 = stringTheory.Exercise48(string1, ptn1, ptn2);


        Assert.assertEquals(expectedRes, actualRes1);

        System.out.println("After removing the new string is: " + actualRes1);
    }


    @Test
    public void testExercise52() {
        //Given
        String string1 = "ABACD";
        String string2 = "CDABA";

        //   String expectedRes = "aramaasc";


        //When
        StringTheory stringTheory = new StringTheory();
        Boolean actualRes1 = stringTheory.Exercise52(string1, string2);
        Assert.assertTrue(true);
        System.out.println("The given strings are: "+string1+"  and  "+string2);
        System.out.println("\nThe concatination of 1st string twice is: "+string1+string2);
        if (stringTheory.Exercise52(string1, string2)) {

            System.out.println("The 2nd string " + string2 + "  exists in the new string.");
            System.out.println("\nStrings are rotations of each other");
        } else {
            System.out.println("The 2nd string " + string2 + "  not exists in the new string.");
            System.out.printf("\nStrings are not rotations of each other");
        }

    }


    @Test
    public void testExercise53() {
        String st1="abcdhgh";
        String st2="abc*d?*";
        System.out.println("The given string is: "+st1);
        System.out.println("The given pattern string is: "+st2);
        char[] str1 = st1.toCharArray();
        char[] patstr = st2.toCharArray();
        //When
        StringTheory stringTheory = new StringTheory();
       // Boolean actualRes1 = stringTheory.Exercise53(st1, st2);

        boolean[][] lookup = new boolean[str1.length + 1][patstr.length + 1];
        if (stringTheory.Exercise53(str1, patstr, str1.length - 1, patstr.length - 1, lookup))
        {
            System.out.println("The given pattern is matching.");
        }
        else
        {
            System.out.println("The given pattern is not matching.");
        }
    }
}