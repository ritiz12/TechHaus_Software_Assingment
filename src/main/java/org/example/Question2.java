package org.example;

import java.util.Scanner;


public class Question2 {

    public static double getGrossPrice(double netPrice, double taxRate){

        //Formula for calculating grossPrice
        double grossPrice = (netPrice / (1 + taxRate)) * 1.0;

        //return gross Prices
        return Math.round(grossPrice * 100.0) / 100.0;
    }
//main function
    public static void main(String[] args) {

        //Enter User Input - Net Price
        System.out.println("Enter Net Price : ");
        Scanner sc = new Scanner(System.in);
        double netPrice = sc.nextDouble();
         //Enter User Input -  Tax Rate
        System.out.println("Enter tax Rate : ");
        double taxRate = sc.nextDouble();
          //Print Output
        System.out.println("Gross Pirce : "+getGrossPrice(netPrice,taxRate));
}
}