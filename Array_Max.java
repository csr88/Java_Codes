package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int count = sc.nextInt();
        char[] arr = new char[count];

        System.out.println("Enter " + count + " numbers: ");
        for (int i=0;i<count;i++){
            arr[i] = Character.toLowerCase(sc.next().charAt(0));

        }

        char temp=0;
        //sort array
        for (int i=0;i<count;i++) {
            for (int j = i+1; j < count; j++) {

                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
        System.out.println("Largest: " + arr[count-1]);
        System.out.println("Smallest: " + arr[0]);



    }
}
