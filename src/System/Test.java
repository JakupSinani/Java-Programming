package System;

public class Test {
    public static void main(String[] args) {
        Account jakup = new Account(8, "Jakup", 850);
        Account emir = new Account(10, "Emir", 1000);
        emir.transfer(emir, jakup, 125, "palidhje");
        emir.deposit(100, "dsfsd");
        System.out.println(emir.toString());
        System.out.println(jakup.toString());
        System.out.println("-----------------------------------");
        Bank bank = new Bank();
     /*   bank.setName("STB");
        bank.addAccount(jakup);
        bank.addAccount(emir);
        System.out.println(bank.toString());*/
        //System.out.println(bank.getTotalTransferAmount());
        bank.addAccount(emir);
        System.out.println(bank.getAccounts());
        System.out.println("Bank total fdsgfjdsgnfidsgds" + bank.getTotalTransferAmount());
    }
}
