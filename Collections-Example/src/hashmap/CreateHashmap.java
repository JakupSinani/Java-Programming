package hashmap;

import java.util.HashMap;
import java.util.Map;

/*Create Hashmap
 * In this example, we create a HashMap called numMap and add three key-value pairs using the put method.
 *  The putIfAbsent method is then used to add a key-value pair to the map only if the key does not already exist.
 *  Finally, the entire map is printed to the console.*/
public class CreateHashmap {
    public static void main(String[] args) {
        Map<String, Integer> numMap = new HashMap<>();

        numMap.put("one", 1);
        numMap.put("two", 2);
        numMap.put("three", 3);

        numMap.putIfAbsent("four", 4);
        System.out.println(numMap);
    }
}
