package expressions_statements_code_blocks_method_and_more.exercise;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
