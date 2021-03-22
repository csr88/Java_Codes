package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value: ");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd value: ");
        int b= sc.nextInt();

        System.out.println("The sum of 1st and 2nd is: " +  (a+b));

    }
}
