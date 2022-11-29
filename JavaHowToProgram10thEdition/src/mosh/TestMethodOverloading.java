package mosh;

public class TestMethodOverloading {
    //  main method
    public static void main(String[] args) {
        //  invoke the max method with int parameters
        System.out.println("The max of 3 and 4 is : " + max(3, 4));

        //  invoke the max method with the double parameters
        System.out.println("the max of 3.0 and 4.0 is: " + max(3.0, 4, 0));

        //  invoke the max method with three double paramwters
        System.out.println("the max of 3.0, 5.4 and 10,14 is: " + max(3.0, 5.4, 10.14));
    }

    //  return the max of two int values
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //  retunr the max of two doble values
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //  return the max of three double values
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
