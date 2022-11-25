package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
    public static void main(String[] args) {
        //  create list
        List<Integer> numberDivisibleBy5 = new ArrayList<>();
        numberDivisibleBy5.add(5);
        numberDivisibleBy5.add(10);
        numberDivisibleBy5.add(15);
        numberDivisibleBy5.add(20);
        numberDivisibleBy5.add(25);

        List<Integer> numberDivisibleBy3 = new ArrayList<>();
        numberDivisibleBy3.add(3);
        numberDivisibleBy3.add(6);
        numberDivisibleBy3.add(9);
        numberDivisibleBy3.add(12);
        numberDivisibleBy3.add(15);

        //  creating a HashSet from another collection(ArrayList)
        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numberDivisibleBy5);
        System.out.println(numbersDivisibleBy5Or3);
        //  adding all the elements from an existing collection to a HashSet
        numbersDivisibleBy5Or3.addAll(numberDivisibleBy3);

        System.out.println(numbersDivisibleBy5Or3);
    }
}
