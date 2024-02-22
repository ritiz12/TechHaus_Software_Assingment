package org.example;
import java.util.Scanner;
public class Question10 {

    public static int findSecondLargest(int[] arr) {
        //check size is not less than 2
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
          insertionSorting(arr) ;


        // Return Second last element of array
        return arr[arr.length - 2];
        }
    public static  void insertionSorting(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the  array  ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter random value of the array ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("No second largest number found ");
        }

    }

}
