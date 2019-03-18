package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalTest {

    @Test
    public void exercise1() {

        Conditional conditional = new Conditional();
        int expected =0;
        int actual = conditional.Exercise1(expected);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void exercise2() {

        Conditional conditional = new Conditional();
        int a =10;
        int b = 25;
        int c = 5;
        int expected =25;
        int actual = conditional.Exercise2(a, b, c);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exercise5() {
        Conditional conditional = new Conditional();

        int day = 3;
        String expected = "Wednesday";
        String actual  = conditional.Exercise5(day);

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void exercise6() {
        Conditional conditional = new Conditional();

        float a = 1383;
        float b = 1383;
        String expected = "numbers are diferent";
        String expected1 = "same number";
        String actual  = conditional.Exercise6(a, b);

      //  Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual);
        System.out.println(actual);

    }

    @Test
    public void exercise7() {
        Conditional conditional = new Conditional();
        //int iMonth = Calendar.FEBRUARY; // 1 (months begin with 0)
        int a = 2019;
        int b = 2;
        int c = 1;

        int expected = 31;

        int actual = conditional.Exercise7(a, b, c);
        Assert.assertEquals(expected, actual);
    }


}