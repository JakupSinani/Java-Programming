package control_flow_statement.challenge;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
