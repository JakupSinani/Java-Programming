package arraylist;

import java.util.ArrayList;
import java.util.List;

/*# AccesElementsFromArrayList

This code demonstrates how to access and modify elements in an ArrayList in Java.
 The ArrayList is a dynamic data structure that allows us to store and access elements in a list.

The code first creates an empty ArrayList of type String called topCompanies.
 It then checks if the list is empty and prints the result.

Next, the code adds four elements to the list: "Google", "Yahoo", "Microsoft", and "Apple".
It then prints the size of the list and the list itself.

The code then retrieves the first, second, and last element of the list and prints them.
 Finally, it modifies the fourth element of the list and prints the modified list.*/


public class AccesElementsFromArrayList {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        System.out.println("Is the topCompanies list empty?  " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Yahoo");
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");

        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(2);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company is: " + bestCompany);
        System.out.println("Second bestCompany is: " + secondBestCompany);
        System.out.println("Last company in the list is: " + lastCompany);

        topCompanies.set(4, "Amazon");
        System.out.println("Modified top companues list: " + topCompanies);
    }
}
