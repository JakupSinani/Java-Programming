package chapter05.Example;

import java.util.Scanner;

public class PrintCalendar {
    //  main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //  prompt the user to enter year
        System.out.println("Enter full year(e.g., 2012): ");
        int year = in.nextInt();

        //  prompt the user to enter month
        System.out.println("Enter month as a number between 1 and 12: ");
        int month = in.nextInt();

        //  prirnt calendar for the month of the year
        printMonth(year, month);
    }

    //  print the calendar for a month in a year
    public static void printMonth(int year, int month) {
        //  print the headings of the calendar
        printMonthTitle(year, month);

        //  print the body of the calendar
        printMonthBody(year, month);
    }

    //  print the month title, e.g., March 2012;
    public static void printMonthTitle(int year, int month) {
        System.out.println("   " + getMonthName(month) + " " + year);
        System.out.println("-------------------");
        System.out.println("   Sun  Mon Tue Wed Thu Fri Sat");
    }

    //  get the english name for the month
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    //  print month body
    public static void printMonthBody(int year, int month) {
        //  get started day of week for the first date in the month
        int startDay = getStartDay(year, month);

        //  get the number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        //  pad space before the first day of the month

        for (int i = 0; i < startDay; i++) {
            System.out.print("  ");
        }
        for (int i = 0; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //  get the start of day month/1/year
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        //  get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        //  return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    //  get the total number of days since January 1, 1800
    public static int getTotalNumberOfDays(int year, int month) {

        int total = 0;
        //  get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        //  add days from jan to the month prior to the calendar month
        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }

    //  get the number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;  //   if month is incorrect
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
