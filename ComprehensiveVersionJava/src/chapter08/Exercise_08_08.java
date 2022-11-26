package chapter08;

public class Exercise_08_08 {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    //  constructor that creates a default fan


    public Exercise_08_08() {
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void turnOn(){
        on=true;
    }

    public void turnOff() {
        on=false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on==true){
            return "\nFan speed: "+getSpeed()+", color: "+color+", radius: "+radius+"\n";
        }else {
            return "\nFan color: "+color+", radius: "+radius+"\nfan is off\n";
        }
    }
}
