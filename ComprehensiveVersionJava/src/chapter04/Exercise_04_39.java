package chapter04;

import java.util.Scanner;

public class Exercise_04_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        if (salary > 0.01 && salary <= 5000) {
            double commisionPercentage = 8;
            double commision = (commisionPercentage / 100) * salary;
            System.out.println("commision is: " + commision);
        } else if (salary > 5000 && salary <= 10000) {
            double commisionPercentage = 12;
            double commision = (commisionPercentage / 100) * salary;
            System.out.println("commision is: " + commision);
        } else {

            double commision = ((8 / 100) * 5000) + ((10 / 100) * 5000) + ((12 / 100) * 15000);
            System.out.println("Commision rate is: " + commision);
        }

    }
}
