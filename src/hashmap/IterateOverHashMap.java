package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 7600.0);
        employeeSalary.put("John", 12000.0);
        employeeSalary.put("Mark", 9500.0);
        employeeSalary.put("Steven", 134000.0);

        System.out.println("=== Iterating over a hashmap");
        employeeSalary.forEach((employee, salary) -> {
            System.out.println(employee + "--> " + salary);
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalaryIterator = employeeSalaryEntries.iterator();
        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String, Double> entry = employeeSalaryIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n Iterating over the HashMap's entrySet");
        employeeSalary.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println("\n===  Iterating over the HashMap's entrySer using for each loop ");
        for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n==    Iterating over the Hashmap's keySet");
        employeeSalary.keySet().forEach(employee -> {
            System.out.println(employee + " : " + employeeSalary.get(employee));
        });
    }
}
