package by.it_academy.practice.practice3;

import java.util.Scanner;

public class ExampleSecondsFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = sc.nextInt();
        int weeks = seconds / 604800; // sec in one week
        int days = (seconds % 604800) / 86400; //sec in one day
        int hours = (seconds % 86400) / 3600; //sec in one hour
        int minutes = (seconds % 3600) / 60; //sec in one minute
        int secondsRemaining = seconds % 60;
        if (weeks > 0) {
            System.out.print(weeks + " week" + (weeks > 1 ? "s" : "") + " ");
        }
        if (days > 0) {
            System.out.print(days + " day" + (days > 1 ? "s" : "") + " ");
        }
        if (hours > 0) {
            System.out.print(hours + " hour" + (hours > 1 ? "s" : "") + " ");
        }
        if (minutes > 0) {
            System.out.print(minutes + " minute" + (minutes > 1 ? "s" : "") + " ");
        }
        if (secondsRemaining > 0 || (weeks == 0 && days == 0 && hours == 0 && minutes == 0)) {
            System.out.print(secondsRemaining + " second" + (secondsRemaining > 1 ? "s" : ""));
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter seconds count");
//// int seconds = sc.nextInt();
//
//        int seconds = 9  *24 * 60 * 60 + 23 * 60 * 60 + 3*  60 + 32;
//
//// 1 week 2 days 12 hours 15 minutes 58 seconds
//// Seconds
//        int secondsRemain = seconds % 60;
//
//// Minutes
//        int minutes = seconds / 60;
//        int minutesRemain = minutes % 60;
//
//// Hours
//        int hours = minutes / 60;
//        int hoursRemain = hours % 24;
//
//// Hours
//        int days = hours / 24;
//        int daysRemain = days % 7;
//
//// Weeks
//        int weeksRemain = days / 7;
//
//        System.out.println(
//                getTitle(secondsRemain,"second")
//                        + " " + getTitle(secondsRemain,"second")
//        );

    }


    protected static String getTitle(int number, String title) {
        return number + " " + ((number == 1) ? title : title + 's');
    }
}
