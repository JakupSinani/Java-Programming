package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayList {
    public static void main(String[] args) {
        //  create a ArrayList
        List<String> topCompanies = new ArrayList<>();

        //  check if an ArrayList  is empty
        System.out.println("Is the topCompanies list empty: " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //  find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world!");
        System.out.println(topCompanies);

        //  retrieve the element at a given index
        String firstBestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastTopCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best company: " + firstBestCompany);
        System.out.println("Second Best company: " + secondBestCompany);
        System.out.println("Last company in the list: " + lastTopCompany);

        //  modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
