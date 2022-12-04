package arrays_list_autoboxing_unboxing.challenge.autoboxing_unboxing_challenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Stopanska Banka");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        if (bank.addBranch("Sydney")) {
            System.out.println("Sydeny branch created");
        }
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 12.44);
        bank.addCustomerTransaction("Adelaide", "John", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        //   bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exists");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 5151.2)) {
            System.out.println("Customer does not exists at branch  ");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
