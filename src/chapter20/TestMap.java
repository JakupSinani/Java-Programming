package chapter20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //  create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 30);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        //  create a TreeMap from the preceding HashMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        //  create a LinkedHashMap
        Map<String, Integer> linkedHashMAp = new LinkedHashMap<>(16, 075f, true);
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 30);
        hashMap.put("Cook", 29);

        //  display the afe for Lewis
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMAp.get("Lewis"));

        //  display each entry with name and age
        System.out.println("\nNames and ages are ");
        treeMap.forEach((name, age) -> System.out.print(name + ": " + age + " "));
    }
}
