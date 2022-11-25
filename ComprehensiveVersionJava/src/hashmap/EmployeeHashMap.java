package hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {
    private int id;
    private String name;
    private String city;

    public EmployeeHashMap(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeHashMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<Integer, EmployeeHashMap> employeeHashMapMap = new HashMap<>();
        employeeHashMapMap.put(1001, new EmployeeHashMap(1001, "Jakup", "Tetovo"));
        employeeHashMapMap.put(1002, new EmployeeHashMap(1002, "Sinani", "Tetovo"));

        System.out.println(employeeHashMapMap);
    }
}
