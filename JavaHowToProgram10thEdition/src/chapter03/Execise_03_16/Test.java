package chapter03.Execise_03_16;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1997, 04, 29);
        HeartRates heart = new HeartRates("", "", date);
        HeartRates thr = new HeartRates("Kuna", "Fomboh", date);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = in.nextLine();
        thr.setFirstName(first);

        System.out.println("Enter your last name: ");
        String lastName = in.nextLine();
        thr.setLastName(lastName);

        thr.setDateOfBirth();

        System.out.printf("\nFirst Name: %s\n", thr.getFirstName());
        System.out.printf("Last Name: %s\n", thr.getLastName());

        //prints the age
        System.out.printf("You are %d years old\n", thr.calcAge());
        //prints maximum heart rate
        System.out.printf("Your Maximum Heart Rate is %d beats per second\n", thr.maxHeartRate());
        //prints target heart rate
        System.out.printf("Your Target-Heart-Rate lies between %d - %d percent \n\n", thr.tarHeartRate1(), thr.tarHeartRate2());
    }
}
