package chapter05;

import java.util.Scanner;

public class Exercise_05_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = in.nextDouble();

        System.out.println("Enter annual interestRate: ");
        double annualInterestRate = in.nextDouble() / 100;

        System.out.println("enter number of years: ");
        double numOfYears = in.nextDouble();

        for (int i = 1; i <= numOfYears; i++) {
            System.out.printf("%-4d%20.2f\n", i, futureInvestment(investmentAmount, annualInterestRate / 12, i));
        }

    }

    public static double futureInvestment(double investmentAmount, double monthlyIterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyIterestRate), (years * 12));
    }
}
