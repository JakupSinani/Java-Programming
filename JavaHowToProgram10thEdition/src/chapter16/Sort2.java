package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //  create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.println("Unsorted array elements: " + list);

        Collections.sort(list, Collections.reverseOrder()); //  sort arraylist
        System.out.println("Sorted array elements: " + list);
    }
}
