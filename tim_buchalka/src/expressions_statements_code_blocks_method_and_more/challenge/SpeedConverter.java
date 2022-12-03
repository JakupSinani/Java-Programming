package expressions_statements_code_blocks_method_and_more.challenge;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.5));
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid value!");
        } else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(milesPerHour + "km/h= " + milesPerHour + "mi/h");
        }
    }
}
