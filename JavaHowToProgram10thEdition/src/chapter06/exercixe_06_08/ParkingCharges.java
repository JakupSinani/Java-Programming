package chapter06.exercixe_06_08;

public class ParkingCharges {
    private int hours;

    public ParkingCharges(int hours) {
        this.hours = hours;
    }

    public double calculateCharges(int hours) {
        double charges = 0;
        if (hours == 3)
            charges = 2.00;
        else if (hours > 3 && hours < 24) {
            int excess = hours - 3;
            charges = 2.00 + (excess * 0.5);
        } else if (hours == 24)
            charges = 10;
        return charges;
    }
}
