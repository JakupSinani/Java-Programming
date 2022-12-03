package expressions_statements_code_blocks_method_and_more.challenge;

public class MethodOverloading {
    public static void main(String[] args) {
      /*  int newScore=calculateScore("Jakup",500);
        System.out.println("New score is: "+newScore);*/

        double centimeters = calcFeetAndInchesToCentimeters(7, 5);
        if (centimeters < 0.0) {
            System.out.println("Invalid paramters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("invalid feet or inches!!!!!!");
            return -1;
        }
        double centimeres = (feet * 12) * 2.54;
        centimeres += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeres + " cm");
        return centimeres;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
