package chapter06.example;

import java.util.Scanner;

public class ProcessingArrays {
    //  main method
    public static void main(String[] args) {
        //  create a scanner
        Scanner in = new Scanner(System.in);
        double[] myList = new double[10];
        //System.out.println("Enter " + myList.length + " values: ");

        //  1.initializing arrays with Scanner (in) values
        /*for (int i=0;i< myList.length;i++){
            myList[i]=in.nextDouble();
            System.out.print(myList[i]+"\n");
        }

        */

        //  2.Initializing arrays with random values
        /*for (int i=0;i< myList.length;i++){
            myList[i]=Math.random()*100;
            System.out.print(myList[i]+"\t");
        }*/

        //  3.Displaying arrays
        /*for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }*/

        //  4.Summing all elements
        /*double total=0;
        for (int i=0;i< myList.length;i++){
            total+=myList[i];
            System.out.println(total);
        }*/

        //  5.Finding the largest element
        /*double max=myList[0];
        for (int i=0;i< myList.length;i++){
            if (myList[i]>max){
                max=myList[i];
            }
        }*/

        //  6.Findin the smallest index of the largest element
        /*double max=myList[0];
        int indexOf=0;
        for (int i=0;i<myList.length;i++){
            if (myList[i]>max){
                max=myList[i];
                indexOf=i;
            }
        }*/

        //  7.Random shuffling
        /*for (int i=0;i< myList.length;i++){
            //  generate an index j randomly
            int j=(int)(Math.random()* myList.length);
            //  swap myList[i] with myList[i]
            double temp=myList[i];
            myList[i]=myList[j];
            myList[j]=myList[i];
        }*/

        //  8.Shiftin elements
        /*double temp=myList[0];  //  retain the first element
        //  shift the element left
        for (int i=1;i<myList.length;i++){
            myList[i-1]=myList[i];
        }
        //  move the first element to fill in the last position
        myList[myList.length-1]=temp;*/
    }
}
