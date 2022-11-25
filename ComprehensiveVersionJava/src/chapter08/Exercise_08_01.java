package chapter08;

public class Exercise_08_01 {
    public static void main(String[] args) {
        Exercise_08_01 exercise=new Exercise_08_01(4,40);
        Exercise_08_01 exercise1=new Exercise_08_01(3.5,35.9);

        System.out.println("Rectangle 1");
        System.out.println("width: "+exercise.width);
        System.out.println("height: "+exercise.height);
        System.out.println("Area: "+exercise.getArea());
        System.out.println("Perimeter: "+exercise.getPerimeter());
        System.out.println("\n\n");
        System.out.println("Rectangle 2");
        System.out.println("width: "+exercise1.width);
        System.out.println("height: "+exercise1.height);
        System.out.println("Area: "+exercise1.getArea());
        System.out.println("Perimeter: "+exercise1.getPerimeter());
    }
    double width;
    double height;

    public Exercise_08_01() {
        width=1;
        height=1;
    }

    public Exercise_08_01(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }

}
