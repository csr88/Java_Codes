package com.company;

import java.util.Scanner;
public class TraingleArea {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double b,h,area;
        System.out.println("Enter the base length(cm): ");
        b= sc.nextDouble();
        System.out.println("Enter the perpendicular height(cm): ");
        h= sc.nextDouble();
        area= (b*h)/2;
        System.out.println("Area of Triangle is: "+ area + "sq.cm");


    }
}
