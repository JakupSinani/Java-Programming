package example.generics.Compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(12, 89.5f);
        Student student1 = new Student(5, 99.92f);
        Student student2 = new Student(17, 82.5f);
        Student student3 = new Student(82, 56.92f);

        Student[] list = {student, student1, student2, student3};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        if (student.compareTo(student1) < 0) {
            System.out.println(student.compareTo(student1));
            System.out.println("student has more marks than student1");
        }
    }
}
