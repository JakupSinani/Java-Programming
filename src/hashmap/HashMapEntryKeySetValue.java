package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValue {
    public static void main(String[] args) {

        //  create map
        Map<String, String> countryISOCodeMapping = new HashMap<>();
        //  put to map
        countryISOCodeMapping.put("Macedonia", "MCD");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");

        //  HashMap's entry set
        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();   //  entry set
        System.out.println("countryISOCode entries: " + countryISOCodeEntries);

        //  HashMap's key set
        Set<String> countries = countryISOCodeMapping.keySet();    //  keyset
        System.out.println("countries: " + countries);

        //  HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();  //  values
        System.out.println("isoCodes: " + isoCodes);
    }
}
