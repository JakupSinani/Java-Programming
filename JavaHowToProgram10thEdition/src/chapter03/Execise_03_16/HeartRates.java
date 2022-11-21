package chapter03.Execise_03_16;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int year = in.nextInt();
        System.out.println("Enter your month of birth: ");
        int month = in.nextInt();
        System.out.println("Enter your day of birth: ");
        int day = in.nextInt();

        LocalDate birth = LocalDate.of(year, month, day);
        dateOfBirth = birth;
    }

    public int calcAge() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateOfBirth, today);
        int age = p.getYears();
        return age;
    }

    public int maxHeartRate() {
        int maxHR = 220 - calcAge();
        return maxHR;
    }

    public int tarHeartRate1() {
        double tarHR1 = maxHeartRate() * 0.5;
        return (int) tarHR1;
    }

    public int tarHeartRate2() {
        double tarHR2 = maxHeartRate() * 0.58;
        return (int) tarHR2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
