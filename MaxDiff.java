package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDiff {
    int[] arr;

    MaxDiff(int[] arr){
        this.arr = arr;
    }

    int getMaxDiff(){
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
        int min = arr[0];
        int max = arr[arr.length-1];
        int maxdiff = max - min;
        return maxdiff;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter " + count + " numbers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        MaxDiff maxDiff = new MaxDiff(arr);
        int maxdiff = (int) maxDiff.getMaxDiff();

        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("Maximum difference: " + maxdiff);

    }
}
