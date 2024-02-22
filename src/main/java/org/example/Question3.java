package org.example;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args)
    {
        int largerNum = 0 ;
        Scanner scanner = new Scanner(System.in);
        //Input Number one
        System.out.println(("Enter First Number"));
        int num1 = scanner.nextInt();
        //Input Number Two
        System.out.println("Enter second Number");
        int num2 = scanner.nextInt();

        if(num1 >= num2)
        {
            largerNum = num1;
        }
        else
        {
            largerNum = num2 ;
        }
        //Print Output
        System.out.println("Larger Number is " + largerNum) ;

    }
}
