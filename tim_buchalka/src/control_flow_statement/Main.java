package control_flow_statement;

public class Main {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        switchValue = 'e';
        switch (switchValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("value was B");
                break;
            case 'C':
                System.out.println("value was C");
            case 'D':
                System.out.println("value was D");
                break;
            case 'E':
                System.out.println("value was E");
            default:
                System.out.println("invalid character!");
                break;
        }
    }
}
