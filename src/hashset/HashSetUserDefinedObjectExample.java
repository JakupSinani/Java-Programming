package hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetUserDefinedObjectExample {
    public static void main(String[] args) {
        //  create a HashSet
        Set<HashSetUserDefinedObjectExample> customers = new HashSet<>();
        customers.add(new HashSetUserDefinedObjectExample(101, "Jakup"));
        customers.add(new HashSetUserDefinedObjectExample(102, "John"));
        customers.add(new HashSetUserDefinedObjectExample(103, "James"));

        //  HashSet will use the 'equals()' and 'hashCode()' implementation
        //  of the Customer class to check for duplicates and ignore them

        customers.add(new HashSetUserDefinedObjectExample(101, "Jakup"));
        System.out.println(customers);
    }

    private String name;
    private int id;

    public HashSetUserDefinedObjectExample(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSetUserDefinedObjectExample that = (HashSetUserDefinedObjectExample) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id +
                        '}';
    }
}
