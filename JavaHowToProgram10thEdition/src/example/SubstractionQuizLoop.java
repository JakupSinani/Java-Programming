package example;

import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTION=5;//number of question
        int correctCount=0;//count the number of correct answers
        int count=0;//count the number of question
        long startTime=System.currentTimeMillis();
        String output=" ";//output string is initially empty
        Scanner in = new Scanner(System.in);
        while (count<NUMBER_OF_QUESTION){
            //generate two random single-digit integers
            int num1=(int)(Math.random()*10);
            int num2=(int)(Math.random()*10);
            //if num1<num2, swap num1 with num2
            if (num1<num2){
                int temp=num1;
                num1=num2;
                num2=temp;
            }
            //prompt the student to answer 'what is num1 - num2 = ?'
            System.out.println("What is "+num1+" - "+num2+ "=?");
            int answer=in.nextInt();
            //grade the answer and display the result
            if (num1-num2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }else {
                System.out.println("Your answer is wrong.\n"+num1+ " - "+num2+" should be "+(num1-num2));
                //increase the question
                count++;
                output+="\n"+num1+" - "+num2+"="+answer+((num1-num2==answer)?" correct":" wrong");
            }
            long endtime=System.currentTimeMillis();
            long testTime=endtime-startTime;
            System.out.println("Correct count is: "+correctCount+"\nTest time is: "+testTime/1000+" seconds\n"+output);
        }
    }
}
