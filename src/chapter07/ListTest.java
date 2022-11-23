package chapter07;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {

        //  add colors elements to list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};

        List<String> list1 = new LinkedList<>();

        for (String color : colors) {
            list1.add(color);
        }

        //  add colors2 elements to lis2
        String[] colors2 = {"gold", "white", "brown", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }
        list1.addAll(list2);    //concatenate lists
        list2 = null; //release resource
        printList(list1);   //print list1 elements

        convertTuUppercaseStrings(list1);   // convert to uppercase string
        printList(list1);   //  print list1 elements

        System.out.printf("%nDeleting elements 4 of 6...");
        removeItems(list1, 4, 7); //  remove items 4-6 from list
        printList(list1);   //  print list1 elemtns
        printReversedList(list1);   //print list in reverse order

    }

    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String colr : list) {
            System.out.printf("%s ", colr);
        }
        System.out.println();
    }

    //  locate string objects and convert to uppercase
    private static void convertTuUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.toString();   //  get item
            iterator.set(color.toUpperCase());  // convert to uppercase
        }
    }

    //  obtain sublst and use clear method to delete sublist items
    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();    //  remove items
    }

    //  print reversed list
    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");

        //  print list in reverse order
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
}
