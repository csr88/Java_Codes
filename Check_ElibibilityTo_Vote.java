package com.company;
import java.util.Scanner;

public class Check_ElibibilityTo_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <110 ) {
            System.out.println("You are eligible to vote");
        }
        else if (age >115){
            System.out.println("You're dead. Damn!!!! You're a ghost");

        }

        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
