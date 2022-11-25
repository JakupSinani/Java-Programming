package chapter12.absTract;

public class TestGeometricObject {
    public static void main(String[] args) {

        //  create two geometric objects
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geometricObject1, geometricObject2));

        //  display circle
        displayGeometricObject(geometricObject1);

        //  display rectangle
        displayGeometricObject(geometricObject2);
    }

    //  a method for comparint the area of two geometric object
    private static boolean equalArea(GeometricObject geometricObject1, GeometricObject geometricObject2) {
        return geometricObject1.getArea() == geometricObject2.getArea();
    }

    //  a method for displaying a geometric ovject
    public static void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println();
        System.out.println("The area is: " + geometricObject.getArea());
        System.out.println("The perimeter is: " + geometricObject.getPerimeter());
    }
}
