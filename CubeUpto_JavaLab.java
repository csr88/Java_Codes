package com.company;
import java.util.Scanner;



public class CubeUpto_JavaLab {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        long i,n;

        System.out.print("Enter number of integers : ");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            double cube = Math.pow(i,3);
            System.out.println( "cube of " +i+" is : "+(long)Math.pow(i,3));
        }
}
}
