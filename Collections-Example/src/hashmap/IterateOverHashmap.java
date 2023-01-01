package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IterateOverHashmap {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.0);
        employeeSalary.put("John", 120000.0);
        employeeSalary.put("SMith", 95000.0);
        employeeSalary.put("Dan", 134000.0);

        System.out.println("=== Iterating over a Hashmap using Java 8 forEach and lambda ===");


    }
}
