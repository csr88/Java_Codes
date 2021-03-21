package com.company;

import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p= sc.nextInt();
        System.out.println("Enter interest rate: ");
        double r= sc.nextDouble();
        System.out.println("Enter time(in years): ");
        double t= sc.nextDouble();
        double interest;
        interest= (p*t*r)/100;
        System.out.println("Your total Simple Interest is: " + interest);

    }
}
