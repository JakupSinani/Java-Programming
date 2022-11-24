package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDefinedObjectExample {
    private String name;
    private int age;

    public ArrayListUserDefinedObjectExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<ArrayListUserDefinedObjectExample> users = new ArrayList<>();
        users.add(new ArrayListUserDefinedObjectExample("Sinani", 22));
        users.add(new ArrayListUserDefinedObjectExample("Steve", 34));
        users.add(new ArrayListUserDefinedObjectExample("Mike", 48));

        users.forEach(user -> {
            System.out.println("Name " + user.getName() + " Age: " + user.getAge());
        });
    }
}
