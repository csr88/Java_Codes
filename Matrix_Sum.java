package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.println("No. of columns in matrix: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        int row_sum=0;

        System.out.println("Enter " + rows*columns + " matrix elements: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            row_sum=0;
            for (int j=0;j<columns;j++){
                System.out.print(arr[i][j] + "\t");
                row_sum += arr[i][j];
            }
            System.out.print(row_sum + "\n");
        }

        System.out.println("");
        int column_sum;

        for (int i=0;i<rows;i++){
            column_sum = 0;
            for (int j=0;j<columns;j++){
                column_sum += arr[j][i];
            }
            System.out.print(column_sum + "\t");
        }



    }
}
