package chapter06.exercise_06_22;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TemperatureConversions temperatureConversions = new TemperatureConversions();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("Enter temperature to convert");
        int temp = input.nextInt();
        if (choice == 1) {
            int fah = (int) temperatureConversions.fahrenheit(temp);
            System.out.printf("%d degrees celcuis is %d degrees fahrenheit\n", temp, fah);
        } else if (choice == 2) {
            int cel = (int) temperatureConversions.celcuis(temp);
            System.out.printf("%d degrees fahrenheit is %d degrees celcuis\n", temp, cel);
        }
    }


}
