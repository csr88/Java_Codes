package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class CompoundInterest {
    public static void main (String[] args){
        double p,n,t,r, CI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        p = sc.nextDouble();
        System.out.println("Enter the time(in years): ");
        t= sc.nextDouble();
        System.out.println("Enter the rate of interest(%): ");
        r= sc.nextDouble();
        System.out.println("Enter the number of times Interest is Compounded per year: ");
        n= sc.nextDouble();
        double a,b,d,R;
        R= r/100;
        a= (R/n);
        b= Math.pow((1+a), n*t);
        d= p*b;
        CI=d;
        System.out.println("Your Compound Interest is: " + CI );


    }
}
