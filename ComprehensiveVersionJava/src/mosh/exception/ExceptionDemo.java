package mosh.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        }
    }
}
