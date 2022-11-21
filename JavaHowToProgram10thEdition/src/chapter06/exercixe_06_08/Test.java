package chapter06.exercixe_06_08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParkingCharges park = new ParkingCharges(0);
        int count = 0;
        double charge = 0.0, total = 0;
        int cus = 1;
        while (count != 1) {
            System.out.printf("Enter the number of hours for customer %d or 1 to terminate\n", cus);
            count = input.nextInt();
            charge = park.calculateCharges(count);
            total += charge;
            System.out.printf("Customer Charges: $%.4f\n", charge);
            cus++;
        }
        System.out.printf("Total Charges: $%.4f\n", total);

    }
}
