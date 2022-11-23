package teeingcollections;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Michael", 43);
        Employee employee2 = new Employee("John", 28);
        Employee employee3 = new Employee("Pam", 25);
        Employee employee4 = new Employee("Stanley", 68);

        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4);

        Map<String, Employee> youngestAndOldestEmployees = new HashMap<>();
        Employee youngest = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();
        Employee oldest = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();

        youngestAndOldestEmployees.put("Youngest", youngest);
        youngestAndOldestEmployees.put("Oldest", oldest);

        System.out.println(youngestAndOldestEmployees);

        Map<String, Employee> teeingExample = employeeList.stream().collect(Collectors.teeing(Collectors.minBy(Comparator.comparing(Employee::getAge)),
                Collectors.maxBy(Comparator.comparing(Employee::getAge)),
                (young, old) -> {
                    Map<String, Employee> map = new HashMap<>();
                    map.put("Oldest", old.get());
                    map.put("Youngest", young.get());
                    return map;
                }));
        System.out.println(teeingExample);

    }
}
