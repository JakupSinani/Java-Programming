package hashmap;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> source = new HashMap<String, Integer>();
        source.put("Jakup", 1);
        source.put("Sinani", 2);
        System.out.println(source);
        HashMap<String, Integer> map = new HashMap<>(source);
        System.out.println(map);
    }
}
