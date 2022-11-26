package chapter08;

public class Exercise_08_08_Test {
    public static void main(String[] args) {
        Exercise_08_08 fan1=new Exercise_08_08();
        Exercise_08_08 fan2=new Exercise_08_08();

        //  assign maximum speed,   radius 10,  color yellow
        //  and turn it on to the first object
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        //  assign medium speed, radius 5,  color blue,
        //  and turn it off to the second object
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        //  display the objects by invoking their toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
