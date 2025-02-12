package com.company;

public class EquilibriumPoint {
    public static void main(String[] args){
        int i, j;
        int[] arr = { -7, 1, 5, 2, -4, 3};
        int leftsum;
        int rightsum;
        boolean exist = false;
        int index = 0;

        for (i = 0; i < arr.length; ++i) {
            leftsum = 0;
            for (j = 0; j < i; j++){
                leftsum += arr[j];}

            rightsum = 0;
            for (j = i + 1; j < arr.length; j++){
                rightsum += arr[j];}

            if (leftsum == rightsum){
                exist = true;
                index = i;
            }
        }
        
        if (exist == true){
            System.out.println("\nEquilibrium point exists at index " + index);
        }
        else {
            System.out.println("\nEquilibrium point does not exist.");
        }

    }
}