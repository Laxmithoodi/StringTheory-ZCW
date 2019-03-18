package rocks.zipcode.stringsgalore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas1Person {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Anika", "Thoodi", 1),
                new Person("Venkat", "Reddy", 38),
                new Person("Sana", "Vulupala", 8));



        //Step 1 : Sort list by last Name

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        //Step2 : Create method that prints all elements in the list
        System.out.println("Print all Persons: ");

        perfromConditionally(people, p -> true, p -> System.out.println(p));



        //Step3 : create methods that prints all people that have last name begining with V


        System.out.println("\n" + "Print all persons lastname start with v: ");

        perfromConditionally(people, p -> p.getLastName().startsWith("V"), p -> System.out.println(p));





        System.out.println("\n" + "Print all persons FirstName start with A: ");
        perfromConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p));

    }


    private  static void perfromConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p:people){
            if(predicate.test(p)){
                consumer.accept(p);

            }
        }

    }


}
