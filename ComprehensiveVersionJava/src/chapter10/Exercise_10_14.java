package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_10_14 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        //  prompt the user to enter 5 numbers
        System.out.println("Enter five integers for list1: ");
        //  invoke fill method
        fill(list1);
        //  prompt the user to enter 5 numbers
        System.out.println("Enter five integers for list2: ");
        fill(list2);
        //  combined lists
        ArrayList<Integer>list3=union(list1,list2);

        System.out.println("The combined list is: ");
        //  display combined list
        for (int i=0;i< list3.size();i++){
            System.out.print(list3.get(i)+"   ");
        }
        System.out.println();
    }

    public static ArrayList<Integer>union(ArrayList<Integer>list1,ArrayList<Integer>list2){
        ArrayList<Integer>list=list1;
        for (int i=0;i< list2.size();i++){
            list.add(list.get(i));
        }
        return list;
    }
    public static void fill(ArrayList<Integer>list){
        Scanner in = new Scanner(System.in);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
    }
}
