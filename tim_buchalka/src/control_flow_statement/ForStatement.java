package control_flow_statement;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest " + calculateInterest(10000, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("10.000 at " + i + " percent will be: " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
