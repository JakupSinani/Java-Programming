package chapter06.single_dimensional_arrays;


//  (Analyze scores) Write a program that reads an unspecifed number of scores and determines how many scores are above or equal to the average,
//  and how many scores are below the average.
//  Enter a negative number to signify the end of the input.
//  Assume the maximum number of scores is 100


import java.util.Scanner;

public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //  prompt the user to enter an scores
        System.out.println("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];   //  initialize score array
        int num;        //  hold user input
        int numberOfScores = 0;     //  number of scores
        int average = 0;      //  average score

        for (int i = 0; i < 100; i++) {
            num = in.nextInt();
            if (num < 0) {
                break;  //  a negative numbers signifies end
            }
            scores[i] = num;  //  fill score array
            average += num;       //  add scores to average
            numberOfScores++;       // increment number of scores
        }
        average /= numberOfScores;

        int aboveOrEqual = 0; //  scores above or equal to average
        int below = 0;    //  scores below average

        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        //  display result
        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
