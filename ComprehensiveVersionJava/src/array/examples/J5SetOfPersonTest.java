package array.examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class J5SetOfPersonTest {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Peter", 21));
        personSet.add(new Person("Paul", 18));
        personSet.add(new Person("John", 60));
        System.out.println(personSet);
        Object[] strArray = personSet.toArray();
        System.out.println(Arrays.toString(strArray));
        for (Person p : personSet) {
            p.sayHello();
        }

    }
}
