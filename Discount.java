package com.company;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        double a;
        a= sc.nextDouble();
        System.out.println("Enter the discount percent(%): ");
        double r,discount,R;
        r= sc.nextDouble();
        R= r/100;
        discount= a*R;
        System.out.println("The discount amount is: " + discount);




    }

}
