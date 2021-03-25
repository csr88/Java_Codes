package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int a = sc.nextInt();
        System.out.println("\nEnter the second digit: ");
        int b = sc.nextInt();
        System.out.println("What operation do you want to do?  ->");
        char c = sc.next();

        if (c=="sum"){
            System.out.println("The sum is:" + (a+b));
        }

    }

}
