package chapter08;

public class Exercise_08_07_Test {
    public static void main(String[] args) {
        Exercise_08_07 account=new Exercise_08_07(1152,20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("Account Statement");
        System.out.println(account.toString());
    }
}
