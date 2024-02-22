package org.example;

import java.util.Scanner;

public class Question8 {
    public static String convertToTime(String secondsStr) {

        long seconds = Long.parseLong(secondsStr);
        long days = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);

        long hours = seconds / 3600;
        seconds %= 3600;

        long minutes = seconds / 60;
        seconds %= 60;

        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " second(s)";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Enter input values
        System.out.println("Enter number of seconds ");
        String seconds = sc.next();
        //Function for conversion
        String timeEquivalent = convertToTime(seconds);
        System.out.println(timeEquivalent);
    }
}