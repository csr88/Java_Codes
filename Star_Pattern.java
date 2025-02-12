package com.company;

import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows you want in the pattern: ");
//        int row = sc.nextInt();


//        int i,j,k;
//
//        //right-angled triangle
//        for (i=0;i<=row;i++){
//            for (j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


        //pyramid pattern
        int row=5;
        int i, space, j;
        for(i=0; i<row; i++)
        {
            for(space=i; space<=row; space++) {
                System.out.print(" ");
            }
            for(j=0; j<(i+1); j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }



    }
}


