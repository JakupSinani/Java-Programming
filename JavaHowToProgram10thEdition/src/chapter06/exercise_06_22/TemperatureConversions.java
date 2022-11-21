package chapter06.exercise_06_22;

public class TemperatureConversions {
    public static double celcuis(int temp) {
        double result = 5.0 / 90 * (temp - 32);
        return result;
    }

    public static double fahrenheit(int temp) {
        double result = (9.0 / 5.0) * temp + 32;
        return result;
    }
}
