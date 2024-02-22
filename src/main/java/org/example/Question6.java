package org.example;

import java.util.Scanner;

public class Question6 {

    public static String countVowels(String[] array) {
        String maxVowelString = "";
        int maxCount = 0;

        for (String i : array) {
            int currCount = countEachStringVowel(i);
            if (currCount >= maxCount) {
                maxCount = currCount;
                maxVowelString = i;
            }
        }
        return maxVowelString;
    }

    public static int countEachStringVowel(String str) {
        int Counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                Counter++;
            }
        }

        return Counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of the array : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];
        System.out.println("Enter Value of array");
        // Input strings from the user
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        String ans = countVowels(array);
        System.out.println("The string in the array with the most vowels is: " + ans);
    }
}
