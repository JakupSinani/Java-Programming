package chapter12.absTract;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dataCreated;

    //  construct a default geometric object


    public GeometricObject() {
        this.dataCreated = new Date();
    }

    //  construct a geometric objext with color and filled value
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dataCreated = dataCreated;
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

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "created on " + dataCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    //  abstract method getArea()
    public abstract double getArea();

    //  abstract method getPerimeter()
    public abstract double getPerimeter();
}
