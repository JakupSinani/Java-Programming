package chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {

        //  add elements in color array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        for (String color : colors) {
            list.add(color);    //  adds color to end of list
        }

        //  add elements in removeColors array to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for (String color : colors) {
            removeList.add(color);
        }

        //  output list contents
        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++) {
            System.out.println(list.get(count));
        }

        //  remove from list the colors contained in removeList
        removeColors(list, removeList);

        //  output list contents
        System.out.println("ArrayList after calling removeColors: ");

        for (String color : list) {
            System.out.println(color);
        }
    }

    //  remove colors specified in collection2 from collection1
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        //  get iterator
        Iterator<String> iterator = collection1.iterator();

        //  loop while collection has items
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();  //  remove current element
            }
        }
    }
}
