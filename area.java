package com.company;

import java.util.Scanner;
class Area {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); //system.in is standard input stream
        System.out.print("Enter the radius of the circle: ");
        int r;
        r = sc.nextInt();
        double area;
        area= (22*r*r)/7;
        System.out.println("Area of the circle is: " + area);
    }
}


