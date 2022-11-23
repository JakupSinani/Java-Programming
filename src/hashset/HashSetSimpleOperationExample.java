package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetSimpleOperationExample {
    public static void main(String[] args) {
        //  create a HashSet
        Set<String> popularCities = new HashSet<>();

        //  check if a HashSet is empty
        System.out.println("Is popularCities set empty: " + popularCities.isEmpty());

        popularCities.add("Tirana");
        popularCities.add("Tetovo");
        popularCities.add("London");
        popularCities.add("New York");

        //  find the size of a HashSet
        System.out.println("Number of cities in the HashSet is: " + popularCities.size());

        //  check if the HashSet is contains an element
        String cityName = "Tetovo";
        if (popularCities.contains(cityName)) {
            System.out.println(cityName + " is in the popular cities set.");
        } else {
            System.out.println(cityName + " is not in the popular cities set.");
        }
    }
}
