package rocks.zipcode.stringsgalore;

public class InsertArray {

    public static void main(String[] args) {

        int[] array = {2, 33, 44, 55, 66};
        int index = 3;
        int value = 5;


        //  public int[] replace(int[] array, int index, int value){
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
            newArray[index] = value;
            for (int j = index + 1; j < array.length; j++)
                newArray[j] = array[j - 1];


        }


        int[] newArray1 = new int[array.length-1];
        for (int i = 0; i < array.length; i++) {


        }


    }
}


