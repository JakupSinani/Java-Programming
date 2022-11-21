package chapter04;

import java.util.Random;
import java.util.Scanner;

/*(Repeat additions)Listing4.4,SubtractionQuizLoop.java,generates five random subtraction questions.
Revise the program to generate ten random addition questions for two integers between 1and15.Display the correct count and test time*/
public class Exercise_04_02 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION=10;
        int count=0;
        int correctCount=0;
        long startTime=System.currentTimeMillis();
        String output=" ";
        Scanner in = new Scanner(System.in);

        while (count<NUMBER_OF_QUESTION){
            int num1=getRandom();
            int num2=getRandom();

            if (num1<num2){
                int temp=num2;
                num2=num1;
                num1=temp;
            }
            System.out.println("What is "+num1+ " - "+num2 + "?");
            int answer=in.nextInt();
            if (num1-num2==answer){
                System.out.println("You are correct!");
                correctCount++;
            }else{
                System.out.println("Your answer is wrong!\n"+num1+" - "+num2+" should be "+(num1-num2));
                count++;
            }
            output+="\n"+num1+" - "+num2+"="+answer+((num1-num2==answer)? " correct":" wrong");
        }
        long endTime=System.currentTimeMillis();
        long testTime=endTime-startTime;

        System.out.println("Correct count is: "+correctCount+"\nTest time is "+testTime/1000+ " seconds\n"+output);
    }


    public static int getRandom(){
        return (int)(1+Math.random()*15);
    }
}
