package chapter05;

public class Exercise_05_09 {
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

    public static void main(String[] args) {
        System.out.println(footToMeter(1.0));
        System.out.println(meterToFoot(20.0));
    }
}
