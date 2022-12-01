package chapter05;

public class Exercise_05_08 {
    public static double celciusToFahrenheit(double celcius) {

        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }

    public static void main(String[] args) {

        System.out.println(celciusToFahrenheit(40.0));
        System.out.println(fahrenheitToCelcius(120));
    }
}
