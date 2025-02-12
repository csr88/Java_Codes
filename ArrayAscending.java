package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter " + count + " numbers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        int temp=0;
        for (int i=0;i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nArray in ascending order: " + Arrays.toString(arr));

        int[] arr2 = new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0;i--){
            arr2[j++] = arr[i];
        }
        System.out.println("\nArray is descending order: " + Arrays.toString(arr2) );


    }
}
