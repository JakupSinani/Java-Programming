package control_flow_statement.challenge;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfTheWeek(9);
    }

    public static void printDayOfTheWeek(int num) {
        String name;
        switch (num) {
            case 1:
                name = "Monday";
                System.out.println(name);
                break;
            case 2:
                name = "Tuesday";
                System.out.println(name);
                break;
            case 3:
                name = "Wednesday";
                System.out.println(name);
                break;
            case 4:
                name = "Thursday";
                System.out.println(name);
                break;
            case 5:
                name = "Friday";
                System.out.println(name);
                break;
            case 6:
                name = "Saturday";
                System.out.println(name);
                break;
            case 7:
                name = "Sunday";
                System.out.println(name);
                break;
            default:
                System.out.println("Invalid!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
        }
    }
}
