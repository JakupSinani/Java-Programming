package chapter08.Example;

import org.junit.jupiter.api.DisplayNameGenerator;

//  define the circle class with two constructors
public class SimpleCircle {
    double radius;

    //  construct a circle with radius 1
    SimpleCircle() {
        radius = 1;
    }

    //  construct a circle with a specified radius
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    //  return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    //return the perimeter of this circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    //  set a new radius for this circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }

}
