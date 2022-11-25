package chapter06.multidimensional_arrays;

import java.util.Scanner;

public class ProcessingTwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        Scanner in = new Scanner(System.in);

        /*1, initializing arrays with input values
        System.out.println("Enter "+matrix.length+" rows and "+matrix[0].length+ " columns: ");
        for (int row=0;row< matrix.length;row++){
            for ( int column=0;column<matrix[row].length;column++){
                matrix[row][column]=in.nextInt();
            }
        }*/

        /*2. Initialzing arrays with random values
        for (int row=0;row< matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
                matrix[row][column]=(int) (Math.random()*100);
            }
        }*/

        /*3. Printing arrays:
        for (int row=0;row< matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }*/

        /*4.Summing all elements
        int sum=0;
        for (int row=0;row< matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
                sum+=matrix[row][column];
            }
        }*/

        /*5.Summing all elements by column
        for (int row=0;row< matrix.length;row++){
            int total=0;
            for (int column=0;column<matrix[row].length;column++){
                total+=matrix[row][column];
                System.out.println("Sum for column "+column+" is "+total);
            }
        }*/

        //6.Which row has the larges sum?
        int maxRow = 0;
        int indexOfMaxRow = 0;

        //  get sum of the first row in maxRow

    }
}
