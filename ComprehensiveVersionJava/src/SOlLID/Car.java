package SOlLID;

public class Car extends Vehicle {
    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = getGear();

    }

    public boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.REVERSE.equals(actualGear) && Gear.DRIVE.equals(gear);
    }

    public boolean isMobingForwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.DRIVE.equals(actualGear) && Gear.REVERSE.equals(gear);
    }
}
