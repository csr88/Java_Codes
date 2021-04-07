package com.company;
import java.util.Scanner;


public class FibonnaciSeries_JavaLab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci Series limit: ");
        int  limit = sc.nextInt();
        int fibonnaci = 1,f2=1;
        System.out.println("The Fibonanci series less than "+ limit + " are: ");
        System.out.print("1,1,"); //print() does not move to a new line while println() moves to a new line

        for (int i=1;i+f2<=limit;){
            fibonnaci = i+f2;
            i=f2;
            f2=fibonnaci;
            System.out.print(fibonnaci + ",");
        }
    }
}
