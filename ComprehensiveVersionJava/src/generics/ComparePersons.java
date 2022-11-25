package generics;

import java.util.Arrays;
import java.util.Comparator;

public class ComparePersons implements Comparator<Person> {
    //  method to compare person objects - order is descending
    public int compare(Person person1, Person person2) {
        int result = -person1.getLastName().compareTo(person2.getLastName());
        return result == 0 ? -person1.getFirstName().compareTo(person2.getFirstName()) : result;
    }
    //  method to compare with another comparator

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {    //  if argument is the same object
            return true;    // then it must be equal
        }
        if (obj == null) { //  if argument is null
            return false;   // then it can't be equal
        }
        return getClass() == obj.getClass();    // class must be the same for equal
    }

    public static void main(String[] args) {
        Person[] authors = {
                new Person("A", "S"),
                new Person("J", "G"),
                new Person("T", "C"),
                new Person("C", "S"),
                new Person("P", "C"),
                new Person("B", "B")
        };
        System.out.println("Original order:");
        for (Person author : authors) {
            System.out.println(author);
        }
        Arrays.sort(authors, new ComparePersons()); // Sort using comparator
        System.out.println("\nOrder after sorting using comparator:");
        for (Person author : authors) {
            System.out.println(author);
        }
        Arrays.sort(authors); // Sort using Comparable method
        System.out.println("\nOrder after sorting using Comparable method:");
        for (Person author : authors) {
            System.out.println(author);
        }
    }
}
