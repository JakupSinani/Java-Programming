package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {

        //  create and display a List<Character>
        Character[] letters = {'P', 'M', 'C'};
        List<Character> list = Arrays.asList(letters);    //  get lists
        System.out.println("List contains: ");
        output(list);

        //  reverse and display the List<Character>
        Collections.reverse(list);  //  reverse order the element
        System.out.println("After calling reverse, list contains: ");
        output(list);

        //  create copyList from an array of 3 characters
        Character[] characters = new Character[3];
        List<Character> copyList = Arrays.asList(characters);

        //  copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.println("After copying, copyList contains: ");
        output(copyList);

        //  fill list with Rs
        Collections.fill(list, 'R');
        System.out.println("After calling fill, list contains: ");
        output(list);
    }

    //  output list information
    private static void output(List<Character> listRef) {
        System.out.println("The list is: ");
        for (Character element : listRef) {
            System.out.println(element);
        }
        System.out.println("Max: " + Collections.max(listRef));
        System.out.println("Min: " + Collections.min(listRef));
    }
}
