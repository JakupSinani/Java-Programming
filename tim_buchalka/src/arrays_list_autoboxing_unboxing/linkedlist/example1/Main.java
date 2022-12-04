package arrays_list_autoboxing_unboxing.linkedlist.example1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jakup", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> inList = new ArrayList<>();
        inList.add(1);
        inList.add(3);
        inList.add(4);

        for (int i = 0; i < inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }
        inList.add(1, 2);
        System.out.println();
        for (int i = 0; i < inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }
    }
}
