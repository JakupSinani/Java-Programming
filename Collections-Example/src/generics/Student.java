package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }
}

//  helper class implementing Comparator interface
class SortByRoll implements Comparator<Student> {

    //  method
    //  sorting in ascending order of roll number

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}

//  helper class implementing Comparator interface
class SortByName implements Comparator<Student> {
    //  method
    //  sorting in ascending order of name

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Main {
    public static void main(String[] args) {

        //  creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<>();

        //  adding entries in above List
        //  using add() method
        ar.add(new Student(218, "Jakup", "Sinani"));
        ar.add(new Student(41, "Rilind", "Limani"));
        ar.add(new Student(71, "Veton", "Ismaili"));
        ar.add(new Student(52, "Armin", "Alili"));

        //  display message on console for better readability
        System.out.println("Unsorted");

        //  iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        //  sorting student entries by roll number
        Collections.sort(ar, new SortByRoll());

        //  display message on console for better readability
        System.out.println("\nSorted by rollno");
        //  again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        //  sorting student entries by name
        Collections.sort(ar, new SortByName());

        //  display message on console for bette readability
        System.out.println("\nSorted by name");

        //  again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

    }
}
