package array;

import java.util.Scanner;

public class LottoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //  create a Scanner

        boolean[] isCovered = new boolean[99]; //  create and initialia array          //  default is false

        //  read each number and mark its corresponding element covered
        int number = in.nextInt();    //  read number
        while (number != 0) {
            isCovered[number - 1] = true;   //  mark number covered
            number = in.nextInt();    //  read number
        }
        //  check whether all covered
        boolean allCovered = true;    //  assume all covered initially
        for (int i = 0; i < isCovered.length; i++) {
            if (!isCovered[i]) {
                allCovered = false;   //  find one number not covered
                break;
            }
        }
        //  display result
        if (allCovered) {                //  check if all numbers are covered or not
            System.out.println("The ticket cover all numbers");
        } else {
            System.out.println("The tickeets don't cover all numbers");
        }
    }
}
