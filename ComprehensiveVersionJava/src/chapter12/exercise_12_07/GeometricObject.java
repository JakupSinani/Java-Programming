package chapter12.exercise_12_07;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dataCreated;

    public GeometricObject() {
        dataCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dataCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Created on " + dataCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    //  abstract method
    public abstract double getArea();

    //  abstract method
    public abstract double getPerimeter();
}
