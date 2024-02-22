package org.example;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter input Values
        System.out.print("Enter the rate of retail inflation ");
        double retailInf = scanner.nextDouble();

        System.out.print("Enter  the number of years ");
        double time = scanner.nextDouble();

        // Convert retail_inf to decimal
        retailInf /= 100.0;

        //According to Question Conditions
        double x = 1 + retailInf;
        double ans = Math.pow(x, time) - 1;
        double result = ans * 100;

        // Print the result
        System.out.println((int) Math.ceil(result));

    }
}
