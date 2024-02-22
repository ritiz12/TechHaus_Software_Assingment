package org.example;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Enter a user input
        System.out.print("Enter  a Integer ");
        int num = scanner.nextInt() ;
        boolean isSpecialInt = specialIntegerCheck(num);

        //if specialIntegerCheck return true than if condition is executed
        if(isSpecialInt)
        {
            System.out.println(("yes , " + num + " is a two digit special integer"));
        }
        //if not special integer
        else
        {
            System.out.println(("NO , " + num + " is NOT a two digit special integer"));
        }
    }

    public static boolean specialIntegerCheck(int num)
    {
        //base case if integer itself is single digit and more than two digit
        if(num < 9 || num > 99)
        {
            return false ;
        }
        int firstDigit = num/10 ;
        int lastDigit = num%10 ;
        int totalSum = firstDigit + lastDigit + (firstDigit*lastDigit);
        return totalSum == num ;

    }

}
