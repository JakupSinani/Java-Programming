package control_flow_statement;

public class WhileStatement {
    public static void main(String[] args) {
        int number = 0;
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;   //  continure with a loop (bypass all other code in the block/body)
            }
            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;  //  execyte code tgen break exits the loop
            }
        }
    }
}
