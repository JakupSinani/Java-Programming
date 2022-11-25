package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleThree {
    public static void main(String[] args) {
        //  creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // adding key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        //  adds key-value pair only if it is noot present in map
        map.putIfAbsent("one", 111);
        //  adds key-value pair only if it is not present in map
        map.putIfAbsent("five", 5);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
