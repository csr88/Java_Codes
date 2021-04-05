package com.company;

import java.util.Scanner;
public class AreaMath<r> {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double r,area;
        r = sc.nextDouble();
        area = Math.PI * r*r;
        System.out.println("Area of Circle is: " + area);

    }

}
