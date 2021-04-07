package com.company;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args){

        /*
       int[][]arr = new int[3][2]; // 3 row and 2 column

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;

        Instead of doing this, let's use loop. We can't do this if we have a big matrix like 10*10
         */

        Scanner sc = new Scanner(System.in);
        int[][]arr1 = new int [2][2];  //first array
        int[][]arr2 = new int[2][2];   //second array
        int[][]res = new int[2][2];    //for the result of addition of first and second

        //First Matrix

        System.out.println("Enter 4 elements of the first matrix: ");

        for(int i = 0; i<2; i++){
            for(int j=0;j<2;j++){
                arr1[i][j]= sc.nextInt();
                System.out.println();
            }
        }

        //printing first matrix
        System.out.println("The first matrix is: ");

        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        //Second Matrix

        System.out.println("Enter 4 elements of the second matrix: ");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr2[i][j]= sc.nextInt();
            }
        }

        //printing the second matrix
        System.out.println("The second matrix is: ");

        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }

        //Resultant Matrix
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                res[i][j] = arr1[i][j] + arr2[i][j];

            }
        }

        //printing the resultant matrix in matrix form
        System.out.println("\nThe resultant matrix is: ");
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                        System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }



        System.out.println("\nOperation Complete!");
        sc.close();

    }
}
