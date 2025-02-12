package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
    int[] arr;

    ArrayAverage(int[] arr){
        this.arr = arr;
    }

    double getArrayAverage(){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double average = (double)sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter " + count + " numbers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        ArrayAverage avg = new ArrayAverage(arr);
        double average = avg.getArrayAverage();

        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("Average: " + average);

    }
}
