package rocks.zipcode.stringsgalore;


import java.util.Arrays;
import java.util.HashSet;




public class ArraysTheory {
//
//    public static void main(String[] args) {
//
//        String[] arrayStr = {  "Java", "Python", "PHP", "C#", "C Programming", "C++" };
//
//        int[] arrayInt = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
//
//    }

    /**
     * 1. Write a Java program to sort a numeric array and a string array.
     * tsmallest positive integer NOT present in an array.
     */

    public static int Exercise1(int[] a) {

        HashSet<Integer> hashSet = new HashSet<>();
        int smallestInt = 1;
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        while (hashSet.contains(smallestInt)) {
            ;
            smallestInt++;

        }


        return smallestInt;
    }

//
//    public static void main(String[] args) throws Exception {
//        String time1 = "12:00:00";
//        String time2 = "12:01:00";
//
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//        Date date1 = format.parse(time1);
//        Date date2 = format.parse(time2);
//        long difference = date2.getTime() - date1.getTime();
//        System.out.println(difference / 1000);
//    }
public class MyMap <K, V>{

    private MyMap<K, V> myMap;
    private K key;
    private V value;


    public void set (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyMap() {
        myMap = new MyMap<>();
    }

    public int size() {
        return myMap.size();
    }

    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    public boolean containsKey(K key){
        if (myMap.getKey() == key) {
            return true;
        }else
            return false;
    }

    public boolean containsValue(K value){
        if(myMap.getValue() == value) {
            return true;
        }else
            return false;
    }

    public void put(K key, K value){
        if (myMap.getKey() != key) {
            myMap.put(key, value);
        }
    }

    public void remove(K key) {
        myMap.remove(key);
    }

    public void clear() {
        myMap.clear();
    }


    public void values(){
    }

    public void equals(){
    }

    public int hashCode(){
        return myMap.hashCode();
    }


    //Getters & Setters for Key & Value
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public class MySet <K> {

        private MyArrayList<K> mySet;

        public MySet() {
            mySet = new MyArrayList<>();
        }

        public void add(K obj){
            if (!mySet.contains(obj)) {
                mySet.add(obj);
            }
        }

        public void remove(int index) {
            mySet.remove(index);
        }

        public K get(int index) {
            return mySet.get(index);
        }

        public void set(int index, K obj){

            mySet.set(index, obj);
        }

        public int size() {
            return mySet.size();
        }

        public boolean contains (K obj){
            return mySet.contains(obj);
        }

        public void clear() {
            mySet.clear();
        }

        public boolean isEmpty() {
            return mySet.isEmpty();
        }


//    public K[] toArray(K[] values) {
//        return (K[]) Arrays.copyOf(mySet, inputArray.length, newArray.getClass());
//
//    }
    }
}

    public class MyArrayList <K>{

        private K[] inputArray;

        public MyArrayList(){
            inputArray = (K[]) new Object[0];
        }

        public MyArrayList(int size){
            inputArray = (K[]) new Object[size];
        }

        public <K> K[] toArray(K[] newArray){
            return (K[]) Arrays.copyOf(inputArray, inputArray.length, newArray.getClass());
        }

        public void set(int index, K element){
            inputArray[index] = element;
        }

        public K get(int index){
            return inputArray[index];
        }

        public int size(){
            return inputArray.length;
        }

        public void add(K obj){

            K[] addArray = Arrays.copyOf(inputArray, inputArray.length + 1);
            addArray[addArray.length - 1] = obj;
            inputArray = addArray;
        }

        public void add(int index, K obj) {

            inputArray = Arrays.copyOf(inputArray, inputArray.length + 1);

            for (int i = inputArray.length - 1; i > index; i--){
                inputArray[i] = inputArray[i-1];
            }
            inputArray[index]= obj;
        }


        public void remove(int index){

            for (int i = index; i < inputArray.length - 1; i++){
                inputArray[i] = inputArray[i + 1] ;
            }
            inputArray = Arrays.copyOf(inputArray, inputArray.length - 1);
        }

        public void clear() {
            //reassigned it to an empty array
            inputArray = (K[]) new Object[0];
        }

        public boolean isEmpty(){
            if (inputArray.length == 0) {
                return true;
            }else
                return false;
        }

        public boolean contains(K value) {
            for (int i = 0; i < inputArray.length; i++) {
                if (value.equals(inputArray[i])) {
                    return true;
                }
            }
            return false;
        }
    }
    }
