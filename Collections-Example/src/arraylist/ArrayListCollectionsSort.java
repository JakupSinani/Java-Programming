package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*ArrayListCollectionsSort
This code demonstrates how to use the Collections.sort() method to sort an ArrayList in Java.

The code first creates an ArrayList of type Integer called numbers and adds four elements to it: 12, 19, 23, and 99.
 It then prints the list before sorting.

The code then calls the Collections.sort() method on the numbers list, which sorts the list in ascending order.
The code then prints the sorted list.

This demonstrates how to use the Collections.sort() method to easily sort an ArrayList in Java.*/

public class ArrayListCollectionsSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(19);
        numbers.add(23);
        numbers.add(99);

        System.out.println("Before " + numbers);

        Collections.sort(numbers);

        System.out.println("After: " + numbers);
    }
}
