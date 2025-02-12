package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static final String Red = "\u001B[91m";
    private static final String Green = "\u001B[92m";
    public static final String Up = "\uD83D\uDE46";
    public static final String Down = "\uD83D\uDE47";
    public static final String Eggplant = "\uD83C\uDF46";

    //Find duplicate elements in array
    public static void Array_duplicate(int arr[]){

        System.out.println("\nDuplicate elements: ");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    //Find average of the array
    public static void Array_average(int arr[]){
        double sum = 0;
        for (int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("\nArray's average: " + sum / arr.length);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int count = sc.nextInt();

        int arr[] = new int[count];

        System.out.println("Enter array elements: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        Array_duplicate(arr);
        Array_average(arr);

    }
}

