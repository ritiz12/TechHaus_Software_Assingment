package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Question4 {

    public static double getMedian(double @NotNull [] array){

        int size = array.length;
        double median=-1.0;

        if(size==0){return median;}
        else if(size%2!=0){
            median = array[size/2];
        }else{
            median = ((array[size/2]+array[(size/2)-1])/2)*1.0;

            //to convert it to get results upto 1 decimal number
            median = (median*10.0)/10.0;
        }

        return median;
    }

    public static void main(String[] args) {

        System.out.println("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter array elements: ");
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            double element = sc.nextDouble();
            array[i] = element;
        }

        System.out.println("Median : "+getMedian(array));
}
}