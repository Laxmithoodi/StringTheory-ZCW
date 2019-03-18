package rocks.zipcode.stringsgalore;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                    new Person("Laxmi", "Thoodi", 35),
                    new Person("Ramana", "Reddy", 38),
                    new Person("Sana", "Vulupala", 8));



        //Step 1 : Sort list by last Name

       Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        //Step2 : Create method that prints all elements in the list
        System.out.println("Print all Persons: ");
       // printAll(people);
        printConditionally(people, p -> true);



        //Step3 : create methods that prints all people that have last name begining with V


       // printLastNameBeginsWithC(people);

        System.out.println("\n" + "Print all persons lastname start with v: ");

        printConditionally(people, p -> p.getLastName().startsWith("V"));

//        printConditionally(people, new Condition() {
//            @Override
//            public boolean test(Person p) {
//                return p.getLastName().startsWith("V");
//            }
//        });



        System.out.println("\n" + "Print all persons FirstName start with L: ");
        printConditionally(people, p -> p.getFirstName().startsWith("L"));
//    printConditionally(people, new Condition() {
//
//        @Override
//        public boolean test(Person p) {
//            return p.getFirstName().startsWith("L");
//        }
//    });

}


    private  static void printConditionally(List<Person> people, Predicate<Person> predicate){
        for(Person p:people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }

    }



//    private static void printLastNameBeginsWithC(List<Person> people) {
//
//        for(Person p:people){
//
//            if(p.getLastName().startsWith("V")){
//                System.out.println(p);
//            }
//        }
//    }
//
//    private static void printAll(List<Person> people) {
//        for(Person p : people){
//            System.out.println(p);
//        }
//    }

//
//    interface  Condition{
//        boolean test(Person p);
//    }

}
