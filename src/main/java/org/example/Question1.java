package org.example;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in) ;
        //Input User Value
        System.out.print("Enter Input Value");
        int number = scanner.nextInt();
        int count = 0 ;
        //for handle negative cases
        number = Math.abs(number);
        //convert int type to string
        String numString = Integer.toString(number);
        count = numString.length();

        System.out.println("Number of Digits in number : " + count );

    }
}
