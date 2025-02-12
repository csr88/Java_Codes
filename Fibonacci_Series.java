package com.company;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci Series limit: ");

        int  limit = sc.nextInt();
        int Fibonacci = 1,f2=1;

        System.out.println("The Fibonacci series less than "+ limit + " are: ");
        System.out.print("1,1,"); //print() does not move to a new line while println() moves to a new line

        for (int i=1;i+f2<=limit;){
            Fibonacci = i+f2;
            i=f2;
            f2=Fibonacci;
            System.out.print(Fibonacci + ",");
        }
    }
}
