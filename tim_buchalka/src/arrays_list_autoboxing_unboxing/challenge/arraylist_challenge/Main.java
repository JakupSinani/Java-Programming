package arrays_list_autoboxing_unboxing.challenge.arraylist_challenge;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = in.nextInt();
            in.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShuting down..");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryConact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = in.nextLine();
        System.out.println("Enter phone number: ");
        String phone = in.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact adedd: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file ");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing name: ");
        String name = in.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = in.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = in.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter e xisting name: ");
        String name = in.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }


    private static void queryConact() {
        System.out.println("Enter e xisting name: ");
        String name = in.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your actions: ");
    }
}
