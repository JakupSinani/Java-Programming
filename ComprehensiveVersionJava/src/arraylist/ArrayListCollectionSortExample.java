package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionSortExample {
    public static void main(String[] args) {
        //  create a list
        List<Integer> num = new ArrayList<>();
        num.add(89);
        num.add(55);
        num.add(23);
        num.add(12);
        num.add(2);

        System.out.println("Before: " + num);

        //  sorting an ArrayList using Collections.sort() method
        Collections.sort(num);

        System.out.println("After: " + num);
    }
}
