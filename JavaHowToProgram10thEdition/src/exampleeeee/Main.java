package exampleeeee;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank", 10, 0.05);

        Account account1 = new Account("John Smith", 1000);
        Account account2 = new Account("Jane Doe", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Withdraw money from account1
        try {
            bank.withdraw(account1.getAccountId(), 500, "Grocery shopping");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Deposit money to account2
        try {
            bank.deposit(account2.getAccountId(), 500, "Paycheck");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Transfer money from account1 to account2
        try {
            bank.transfer(account1.getAccountId(), account2.getAccountId(), 250, "Gift");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Print list of transactions for account1
        System.out.println("Transactions for account1:");
        for (Transaction t : account1.getTransactions()) {
            System.out.println(t.getType() + ": " + t.getAmount() + " - " + t.getReason());
        }
        System.out.println("Transactions for account2:");
        for (Transaction t : account2.getTransactions()) {
            System.out.println(t.getType() + ": " + t.getAmount() + " - " + t.getReason());
        }

        // Print account balance for account2
        System.out.println("Balance for account2: " + account2.getBalance());

        // Print list of bank accounts
        System.out.println("Accounts at " + bank.getName() + ":");
        for (Account a : bank.getAccounts()) {
            System.out.println(a.getName() + " - " + a.getBalance());
        }

        // Print total transaction fee amount and total transfer amount for the bank
        System.out.println("Total transaction fee amount at " + bank.getName() + ": " + bank.getTotalTransactionFee());
        System.out.println("Total transfer amount at " + bank.getName() + ": " + bank.getTotalTransferAmount());
    }

}
