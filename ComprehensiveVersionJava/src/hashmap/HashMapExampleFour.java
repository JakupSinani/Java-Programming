package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleFour {
    public static void main(String[] args) {

        //Creating HashMap with default initial capacity and load factor

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Adding key-value pairs to HashMap

        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);

        //Retrieving a value associated with key 'TWO'
        int value = map.get("TWO");
        System.out.println(map.containsValue(2));
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        System.out.println(map.values() + "values");
        System.out.println(map.keySet() + "keys");

        System.out.println(value);

        //  retreiving the number of key-value pairs present in map
        System.out.println(map.size());
        //  clearing the map
        map.clear();
        System.out.println(map.size());

    }
}
