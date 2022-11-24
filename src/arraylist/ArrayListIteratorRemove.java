package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemove {
    public static void main(String[] args) {
        //  create a list
        List<Integer> num = new ArrayList<>();

        num.add(89);
        num.add(55);
        num.add(23);
        num.add(12);
        num.add(2);
        System.out.println("before removing: " + num);
        Iterator<Integer> numIterator = num.iterator();
        while (numIterator.hasNext()) {
            Integer numb = numIterator.next();
            if (numb % 2 != 0) {
                numIterator.remove();
            }
        }
        System.out.println("After removing: " + num);
    }
}
