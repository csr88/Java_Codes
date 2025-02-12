package com.company;

import java.util.Scanner;

public class Odd_Even{
    public static void main(String[] args) {
        int purchase=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your purchase amount:");
        purchase = sc.nextInt();

        if (purchase%2==0){
            System.out.println("Purchase amount is even.");
        }
        else{
            System.out.println("Purchase amount is odd");
        }
    }
}
