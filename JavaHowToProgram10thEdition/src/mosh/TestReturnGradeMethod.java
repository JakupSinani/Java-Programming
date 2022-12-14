package mosh;

public class TestReturnGradeMethod {
    //  main method
    public static void main(String[] args) {
        //  invoke getGrade method inside sout
        System.out.println("The grade is: " + getGrade(78.5));
        //  invoke getGrade method inside sout
        System.out.println("The grade is: " + getGrade(59.2));
    }

    public static char getGrade(double score) {
        if (score >= 90.0) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
