package org.example;

import java.util.Scanner;

public class Question5 {

    public static double calculateTax(double income) {
        double taxAmount = 0.0;
        //Calculate Tax Amount According to conditions
        if (income <= 250000) {
            taxAmount = 0.0;
        } else if (income <= 500000) {
            taxAmount = (income - 250000) * 0.1;
        } else if (income <= 1000000) {
            taxAmount = (250000 * 0.1) + ((income - 500000) * 0.2);
        } else {
            taxAmount = (250000 * 0.1) + (500000 * 0.2) + ((income - 1000000) * 0.3);
        }
        return taxAmount;
    }

    public static void main(String[] args) {
        System.out.println("Enter Income");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();

        System.out.println("Income tax : "+calculateTax(income));
}
}