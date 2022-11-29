package array;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        String[] copiedArray = array.clone();
        System.out.println(Arrays.toString(copiedArray));
    }
}
