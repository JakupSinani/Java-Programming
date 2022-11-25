package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMapProgram {
    public static void main(String[] args) {
        //  creating hashmap with default initial capacity and load factor
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //  inserting key-value pairs to map using put() method

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        //  printing key-values pairs
        //System.out.println(map);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-----------------------------------");

        //  creating another HashMap
        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();
        //  inserting key-value pairs to anotherMap using put()method
        anotherMap.put("Six", 6);
        anotherMap.put("Seven", 7);
        //  inserting key-value pairs of map to anotherMap using putAll() method
        anotherMap.putAll(map);
        //  printing key-value pairs of anotherMap
        entrySet = anotherMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
