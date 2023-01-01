package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*ArrayListIteratorRemove
This code demonstrates how to use an Iterator to remove elements from an ArrayList in Java.

The code first creates an ArrayList of type Integer called num and adds four elements to it: 12, 19, 23, and 99.
 It then creates an Iterator for the num list called numsIterator.

The code then enters a while loop that continues as long as the Iterator has more elements.
 Inside the loop, the code retrieves the next element from the Iterator and checks if it is odd.
  If it is odd, the code calls the remove() method on the Iterator to remove the element from the list.

After the loop completes, the code prints the modified list, which only contains the even numbers. This demonstrates how to use an Iterator and the remove() method to remove elements from an ArrayList in Java.*/

public class ArrayListIteratorRemove {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(19);
        num.add(23);
        num.add(99);

        Iterator<Integer> numsIterator = num.iterator();
        while (numsIterator.hasNext()) {
            Integer number = numsIterator.next();
            if (number % 2 != 0) {
                numsIterator.remove();
            }
        }
        System.out.println(num);
        ;
    }
}
