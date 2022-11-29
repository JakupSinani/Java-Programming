package mosh;

public class TestVoidMethod {
    // main method

    // ATTENTION

    //  A CALL TO A VOID METHOD MUST BE A STATEMENT!!!!!!!!!!!!!!!!


    public static void main(String[] args) {
        System.out.println("The grade is: ");
        //  invoke printGrade method
        printGrade(78.5);

        System.out.println("The grade is: ");
        //  invoke printGrade method
        printGrade(59.2);
    }

    //  printGrade Method
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
