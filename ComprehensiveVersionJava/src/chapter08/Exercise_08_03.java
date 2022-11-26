package chapter08;

import java.util.Date;

public class Exercise_08_03 {
    public static void main(String[] args) {
        Date date=new Date();

        for (long i=10000;i<=1e11;i*=10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
