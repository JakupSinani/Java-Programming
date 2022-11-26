package chapter10.exercise_10_02;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar calendar=new GregorianCalendar();
        year=calendar.get(GregorianCalendar.YEAR);
        month=calendar.get(GregorianCalendar.MONTH);
        day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public int getYear(){
        return year;
    }
    public String getMonth(){
        String m=String.valueOf(month+1);
        return (month<10?"0"+m:m);
    }
    public String getDay(){
        String d=String.valueOf(day);
        return (day<10?"0"+d:d);
    }
    public void setDate(long elapsedTime){
        GregorianCalendar calendar=new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year=calendar.get(GregorianCalendar.YEAR);
        month=calendar.get(GregorianCalendar.MONTH);
        day=calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
