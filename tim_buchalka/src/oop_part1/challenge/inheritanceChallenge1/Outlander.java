package oop_part1.challenge.inheritanceChallenge1;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVeolcity = getCurrentVelocity() + rate;
        if (newVeolcity == 0) {
            stop();
        } else if (newVeolcity > 0 && newVeolcity <= 10) {
            changeGear(1);
        } else if (newVeolcity > 10 && newVeolcity <= 20) {
            changeGear(2);
        } else if (newVeolcity > 20 && newVeolcity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVeolcity > 0) {
            changeVelocity(newVeolcity, getCurrentDirection());
        }
    }
}
