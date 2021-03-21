package com.company;
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = sc.nextInt();
        double perimeter;
        perimeter = (2*22*r)/7;
        System.out.println("Perimeter of the circle is: "+ perimeter);

    }
}
