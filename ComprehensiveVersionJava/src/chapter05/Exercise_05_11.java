package chapter05;

public class Exercise_05_11 {
    public static void main(String[] args) {
        System.out.println("\nSales amount   Commision");
        for (double salesAmount = 1000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computeCommision(salesAmount));
        }
    }

    public static double computeCommision(double salesAmount) {
        double balance = 0;  //  holds the balance
        double commision = 0;

        //   if sales amount is $10.000.01 and above commission rate is 12%
        if (salesAmount >= 10000.01) {
            commision += (balance = salesAmount - 10000) * 0.12;
        }
        if (salesAmount >= 5000.01) {
            commision += (balance - balance - 5000) * 0.10;
        }
        if (salesAmount >= 0.01) {
            commision = balance * 0.08;
        }
        return commision;

    }
}
