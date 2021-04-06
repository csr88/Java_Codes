package com.company;
import java.util.Scanner;

public class Rectangle_JavaLab {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle(cm): ");
        int length= sc.nextInt();
        System.out.println("Enter the breadth of the rectangle(cm): ");
        int breadth= sc.nextInt();

        System.out.println("The Area of the rectangle is:  " + (length*breadth) + " square cm.");
        System.out.println("The Perimeter of the rectangle is:  " + 2*(length+breadth) + "cm.");

        sc.close();

    }
}
