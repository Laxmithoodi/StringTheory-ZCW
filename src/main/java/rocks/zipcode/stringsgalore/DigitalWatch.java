package rocks.zipcode.stringsgalore;

public class DigitalWatch {


    public static void main(String[] args) {

   //Reverse a String


    String str = "World!" ;

       StringBuilder sb = new StringBuilder(str);
        System.out.println("Orignial String: " + sb);
        sb.reverse();
        System.out.println("Reversed String: " + sb);




//first n natural number and their sum

        int i, n = 7, sum = 0;
        for (i = 1; i <= 7; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println(sum);

//12. Write a program in Java to input 5 numbers from keyboard and find their sum and average
        int j, k=5, sum1=0, avg;

        for(i=1; i<=k;i++) {
            System.out.println(i);
            sum1 = sum1 + i;
        }
        System.out.println("Sum of numbers: " + sum1);
            avg = sum1 / k;


        System.out.println("Average : " + avg);

//14. Write a program in Java to display the multiplication table of a given integer

        int mult =5;
       for(int t=1; t<=mult; t++){

           System.out.println( mult + " * " + t + " = " + mult *t);
       }








 //Digital watch
        int h, m , s;

        for ( h = 0; h < 2; h++) {
            for ( m = 0; m < 2; m++) {
                for (s = 0; s < 9; s++) {
                    System.out.printf(h  + " : " +  m  + " : " + s);

                    try {
                        System.out.printf("\r" );
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }

                }

            }

        }

    }
}



