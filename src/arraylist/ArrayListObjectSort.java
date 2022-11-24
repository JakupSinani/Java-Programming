package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSort {
    private String name;
    private int age;

    public ArrayListObjectSort(String name, int age) {
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

    @Override
    public String toString() {
        return "ArrayListObjectSort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        //  create list
        List<ArrayListObjectSort> people = new ArrayList<>();
        people.add(new ArrayListObjectSort("Sachin", 88));
        people.add(new ArrayListObjectSort("Chris", 45));
        people.add(new ArrayListObjectSort("John", 22));
        people.add(new ArrayListObjectSort("Mike", 41));

        System.out.println("People list: " + people);

        //  sort people by their age
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });

        //  amore concis way of writing the above sorting function
        people.sort(Comparator.comparing(ArrayListObjectSort::getAge));

        System.out.println("Sorted Person List by age: " + people);

        //  you can also sort using Collection.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(ArrayListObjectSort::getName));
        System.out.println("Sorted Person List by Name: " + people);
    }
}
