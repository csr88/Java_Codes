package com.company;

import java.util.Arrays;

public class LargestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'q', 'A', 'B', 'X', 'z', 'Y'};
        char temp;
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        if (arr.length%2==0) {
            System.out.println("Largest capital letter is: " + arr[(arr.length/2)-1]);
            System.out.println("Largest small letter is: " + arr[arr.length-1]);
        }
        else{
            System.out.println("Largest capital letter is: " + arr[(arr.length/2)]);
            System.out.println("Largest small letter is: " + arr[arr.length-1]);

        }


    }
}
