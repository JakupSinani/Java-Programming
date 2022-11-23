package hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {

        //  creating a HashSet
        Set<String> daysOfWeek = new HashSet<>();

        //  adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        //  if we add duplicates the HashSet will ignore
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
    }
}
