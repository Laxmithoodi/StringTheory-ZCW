package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {

        int[] originalArray = {1,2,3,4,5,6};
        int order = 4;

        BubbleSort bubSort = new BubbleSort();

        int[] expected = {3,4,5,6,1,2};
        int[] actual = bubSort.bubbleSort(originalArray,order );

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        System.out.println(Arrays.toString(actual));
        //Assert.assertTrue(String.valueOf(expected), true);


    }
}