package example;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", " ");

        System.out.println(mappBully(map));
    }

    public static Map<String, String> mappBully(Map<String, String> map) {
        Map<String, String> mappBully = new HashMap<>();
        if (mappBully.containsKey("a")) {
            mappBully.put("b", mappBully.get("a"));
            mappBully.put("a", "");
        }
        return map;
    }
}
