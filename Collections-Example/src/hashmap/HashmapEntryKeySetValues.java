package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*HashmapEntryKeySet
* The below code is a Java program that demonstrates how to create and use a HashMap in Java. The HashMap, named "countryISOCodeMapping", is used to store mappings of countries and their respective ISO codes.
The program begins by creating a new HashMap and adding several key-value pairs to it.
* The keys are the names of countries, and the values are the ISO codes for those countries.
Next, the program retrieves and prints out the entries, keys, and values of the HashMap.
*  The "entrySet" method is used to get a Set of all the entries in the HashMap,
* the "keySet" method is used to get a Set of all the keys in the HashMap, and the "values" method is used to get a Collection of all the values in the HashMap.
Finally, the program prints out the resulting Sets and Collection to the console.*/


public class HashmapEntryKeySetValues {
    public static void main(String[] args) {
        Map<String, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put("Macedonia", "MKD");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("China", "CN");

        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries: " + countryISOCodeEntries);

        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries: " + countries);

        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes: " + isoCodes);
    }
}
