package expressions_statements_code_blocks_method_and_more;

public class MethodInJava {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*int highScore = calculatScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was: "+highScore);*/

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        /*highScore=calculatScore(true, 10000, 8, 200);
        System.out.println("Your final score was: "+highScore);*/


        int calculate = calculateHighScorePosition(1500);
        displayHighScorePosition("Jakup", calculate);

        calculate = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", calculate);

        calculate = calculateHighScorePosition(400);
        displayHighScorePosition("John", calculate);

        calculate = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", calculate);


    }

    public static int calculatScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
