package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTheoryTest {

    @Test
    public void exercise1() {

        int[] arrayStr = {1,2,3};

        ArraysTheory arraysTheory = new ArraysTheory();

       int actal = arraysTheory.Exercise1(arrayStr);

        Assert.assertEquals(4, actal);

       //int[] arrayInt = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};

    }
 /**   public class myArrayListTest {

        @Test
        public void addLongTest() {
            //Given
            MyArrayList<Long> myArrayList = new MyArrayList<>();
            Long valueToAdd = 4L;
            myArrayList.add(1L);
            myArrayList.add(2L);
            myArrayList.add(3L);
            myArrayList.add(valueToAdd);
            myArrayList.add(5L);
            myArrayList.add(6L);

            //When
            Long[] expected = {1L, 2L, 3L, 4L, 5L, 6L};
            Long[] actual = myArrayList.toArray(new Long[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void addStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();
            String valueToAdd = "Paxton";
            myArrayList.add("Kay");
            myArrayList.add(valueToAdd);
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add(valueToAdd);
            myArrayList.add(valueToAdd);

            //When
            String[] expected = {"Kay", "Paxton", "Joseph", "Elisha", "Paxton", "Paxton"};
            String[] actual = myArrayList.toArray(new String[0]);

            // Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void addIntegerTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();
            Integer valueToAdd = 12;
            myArrayList.add(2);
            myArrayList.add(9);
            myArrayList.add(1);
            myArrayList.add(valueToAdd);
            myArrayList.add(valueToAdd);
            myArrayList.add(0);
            myArrayList.add(valueToAdd);
            myArrayList.add(4);
            myArrayList.add(valueToAdd);

            // When
            Integer[] expected = {2, 9, 1, 12, 12, 0, 12, 4, 12};
            Integer[] actual = myArrayList.toArray(new Integer[0]);

            // Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void sizeTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();
            Integer valueToAdd = 12;
            myArrayList.add(2);
            myArrayList.add(9);
            myArrayList.add(1);
            myArrayList.add(valueToAdd);
            myArrayList.add(valueToAdd);
            myArrayList.add(0);
            myArrayList.add(valueToAdd);
            myArrayList.add(4);
            myArrayList.add(valueToAdd);

            //When
            int expected = 9;
            int actual = myArrayList.size();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void sizeStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();
            String valueToAdd = "Paxton";
            myArrayList.add("Kay");
            myArrayList.add(valueToAdd);
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add(valueToAdd);
            myArrayList.add(valueToAdd);

            //When
            int expected = 6;
            int actual = myArrayList.size();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void setIntTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.set(1, 8);
            myArrayList.add(4);

            //When
            Integer[] expected = {0, 8, 2, 3, 4};
            Integer[] actual = myArrayList.toArray(new Integer[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void setStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();
            myArrayList.add("Kay");
            myArrayList.add("Paxton");
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add("Nico");
            myArrayList.set(0, "Paxton");

            //When
            String[] expected = {"Paxton", "Paxton", "Joseph", "Elisha", "Nico"};
            String[] actual = myArrayList.toArray(new String[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }



        @Test
        public void addIndexTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);
            myArrayList.add(0,7);

            //When
            Integer[] expected = {7, 0, 1, 2, 3, 4};
            Integer[] actual = myArrayList.toArray(new Integer[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void addStringIndexTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Kay");
            myArrayList.add("Paxton");
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add("Nico");
            myArrayList.add(0, "Paxton");

            //When
            String[] expected = {"Paxton", "Kay", "Paxton", "Joseph", "Elisha", "Nico"};
            String[] actual = myArrayList.toArray(new String[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void toArrayIntTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);

            //When
            Integer[] expected = {0, 1, 2, 3, 4};
            Integer[] actual = myArrayList.toArray(new Integer[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void toArrayStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Kay");
            myArrayList.add("Paxton");
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add("Nico");

            //When
            String[] expected = {"Kay", "Paxton", "Joseph", "Elisha", "Nico"};
            String[] actual = myArrayList.toArray(new String[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void getIndexIntTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);

            //When
            Integer expected = 3;
            Integer actual = myArrayList.get(3);

            //Then
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void getIndexStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Kay");
            myArrayList.add("Paxton");
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add("Nico");

            //When
            String expected = "Paxton";
            String actual = myArrayList.get(1);

            //Then
            Assert.assertEquals(expected, actual);

        }

        @Test
        public void removeIntTest(){
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);
            myArrayList.remove(0);

            //When
            Integer[] expected = {1, 2, 3, 4};
            Integer[] actual = myArrayList.toArray(new Integer[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void removeStringTest(){
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Kay");
            myArrayList.add("Paxton");
            myArrayList.add("Joseph");
            myArrayList.add("Elisha");
            myArrayList.add("Nico");
            myArrayList.remove(2);

            //When
            String[] expected = {"Kay", "Paxton", "Elisha", "Nico"};
            String[] actual = myArrayList.toArray(new String[0]);

            //Then
            Assert.assertArrayEquals(expected, actual);
        }

        @Test
        public void clearTest(){
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);

            //When
            myArrayList.clear();

            int expected = 0;
            int actual = myArrayList.size();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void clearStringTest(){
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Hello");
            myArrayList.add("There");
            myArrayList.add("Big");
            myArrayList.add("World");

            //When
            myArrayList.clear();

            int expected = 0;
            int actual = myArrayList.size();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void isEmptyTest() {
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);
            myArrayList.clear();

            //When
            boolean expected = true;
            boolean actual = myArrayList.isEmpty();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void isEmptyStringTest() {
            //Given
            MyArrayList<String> myArrayList = new MyArrayList<>();

            myArrayList.add("Hello");
            myArrayList.add("There");
            myArrayList.add("Big");
            myArrayList.add("World");

            //When
            boolean expected = false;
            boolean actual = myArrayList.isEmpty();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void containsTest(){
            //Given
            MyArrayList<Integer> myArrayList = new MyArrayList<>();

            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);

            //When
            boolean expected = false;
            boolean actual = myArrayList.contains(5);

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void containsStringTest(){
            //Given
            ArraysTheory.MyArrayList<String> myArrayList = new ArraysTheory.MyArrayList<>();

            myArrayList.add("Hello");
            myArrayList.add("There");
            myArrayList.add("Big");
            myArrayList.add("World");

            //When
            boolean expected = true;
            boolean actual = myArrayList.contains("World");

            //Then
            Assert.assertEquals(expected, actual);
        }
    }
  public class myMapTest {

 @Test
 public void sizeIntTest() {
 //Given
 MyMap mapTest = new MyMap();
 mapTest.put(0, "Pax");
 mapTest.put(1, "Joe");
 mapTest.put(2, "Kay");

 //When
 int expected = 3;
 int actual = mapTest.size();

 //Then
 Assert.assertEquals(expected, actual);
 }

 @Test
 public void isEmpty() {
 //Given
 MyMap mapTest = new MyMap();
 mapTest.put("Pax", 1);
 mapTest.put("Kay", 2);
 mapTest.put("Joe", 3);

 //When
 boolean expected = false;
 boolean actual = mapTest.isEmpty();

 Assert.assertEquals(expected,actual);
 }


 @Test
 public void containsKey() {
 //Given
 MyMap mapTest = new MyMap();
 mapTest.put("Pax", 1);
 mapTest.put("Kay", 2);
 mapTest.put("Joe", 3);

 //When
 boolean expected = true;
 boolean actual = mapTest.containsKey("Pax");

 Assert.assertEquals(expected,actual);
 }

 @Test
 public void containsValue() {
 //Given
 MyMap mapTest = new MyMap();
 mapTest.put("Pax", 1);
 mapTest.put("Kay", 2);
 mapTest.put("Joe", 3);

 //When
 boolean expected = true;
 boolean actual = mapTest.containsValue(1);

 Assert.assertEquals(expected,actual);
 }

 @Test
 public void clear() {
 //Given
 MyMap mapTest = new MyMap();
 mapTest.put("Pax", 1);
 mapTest.put("Kay", 2);
 mapTest.put("Joe", 3);

 //When
 mapTest.clear();

 int expected = 0;
 int actual = mapTest.size();

 //Then
 Assert.assertEquals(expected,actual);
 }
 //
 //    @Test
 //    public void put() {
 //    }
 //
 //    @Test
 //    public void putAll() {
 //    }
 //
 //    @Test
 //    public void remove() {
 //    }
 //
 //
 //    @Test
 //    public void keySet() {
 //    }
 //
 //    @Test
 //    public void entrySet() {
 //    }
 //
 //    @Test
 //    public void values() {
 //    }
 //
 //    @Test
 //    public void equals() {
 //    }
 //
 }
  public class mySetTest {

 @Test
 public void addIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(2);
 testSet.add(9);
 testSet.add(1);
 testSet.add(0);
 testSet.add(4);

 //When
 int expected = 5;
 int actual = testSet.size();

 //Then
 Assert.assertEquals(expected, actual);
 }

 @Test
 public void addStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 int expected = 3;
 int actual = testSet.size();

 //Then
 Assert.assertEquals(expected, actual);
 }

 @Test
 public void getIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(2);
 testSet.add(9);
 testSet.add(1);
 testSet.add(0);
 testSet.add(4);

 //When
 int expected = 0;
 int actual = testSet.get(3);

 //Then
 Assert.assertEquals(expected, actual);
 }

 @Test
 public void getStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 String expected = "Pax";
 String actual = testSet.get(0);

 //Then
 Assert.assertEquals(expected, actual);
 }

 @Test
 public void removeIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(2);
 testSet.add(9);
 testSet.add(1);
 testSet.add(0);
 testSet.add(4);

 //When
 testSet.remove(3);

 int expected = 4;
 int actual = testSet.size();

 //THen
 Assert.assertEquals(expected,actual);
 }

 @Test
 public void removeStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 testSet.remove(2);

 int expected = 2;
 int actual = testSet.size();

 //Then
 Assert.assertEquals(expected,actual);
 }
 @Test
 public void setIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(1);
 testSet.add(2);
 testSet.add(3);

 //When
 testSet.set(1, 4);

 int expected = 4;
 int actual = testSet.get(1);

 //Then
 Assert.assertEquals(expected,actual);
 }

 @Test
 public void setStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 testSet.set(2, "hello");

 String expected = "hello";
 String actual = testSet.get(2);

 //Then
 Assert.assertEquals(expected,actual);
 }
 @Test
 public void clearIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(1);
 testSet.add(2);
 testSet.add(3);

 //When
 testSet.clear();

 int expected = 0;
 int actual = testSet.size();

 //Then
 Assert.assertEquals(expected,actual);
 }

 @Test
 public void clearStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 testSet.clear();

 int expected = 0;
 int actual = testSet.size();

 //Then
 Assert.assertEquals(expected,actual);
 }

 @Test
 public void isEmptyIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(1);
 testSet.add(2);
 testSet.add(3);

 //When
 boolean expected = false;
 boolean actual = testSet.isEmpty();

 Assert.assertEquals(expected,actual);
 }

 @Test
 public void isEmptyStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 //When
 testSet.clear();

 boolean expected = true;
 boolean actual = testSet.isEmpty();

 Assert.assertEquals(expected,actual);
 }

 @Test
 public void containsIntTest() {
 //Given
 MySet<Integer> testSet = new MySet<>();
 testSet.add(1);
 testSet.add(2);
 testSet.add(3);

 boolean expected = false;
 boolean actual = testSet.contains(5);

 Assert.assertEquals(expected,actual);
 }

 @Test
 public void containsStringTest() {
 //Given
 MySet<String> testSet = new MySet<>();
 testSet.add("Pax");
 testSet.add("Joe");
 testSet.add("Kay");

 boolean expected = true;
 boolean actual = testSet.contains("Pax");

 Assert.assertEquals(expected,actual);
 }
 } **/

}