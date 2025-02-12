package com.company;
import java.util.Scanner;

//8 10 11 12 14

public class Matrix_Min_Max {
    public static final String Red = "\u001B[91m";
    private static final String Green = "\u001B[92m";
    public static final String Up = "\uD83D\uDE46";
    public static final String Down = "\uD83D\uDE47";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 2;
        int columns = 2;

        int arr[][] = new int[rows][columns];
        int min = arr[0][0];
        int max = arr[0][0];


        System.out.println(Red + "Enter " + rows*columns + " numbers:");
        //filling matrix
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                }
//                if (arr[i][j] < min){
//                    min = arr[i][j];
//                }

            }
        }

        System.out.println("\n");

        //printing matrix
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Red + arr[i][j] + "\t");;
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println("");
        }

        System.out.println(Green + "\nThe max value is: " + max + " " + Up);
        System.out.println(Green + "The min value is: " + min + " " + Down);




    }
}
