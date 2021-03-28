package com.company;
import java.util.Scanner;

public class multivariableinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name= sc.nextLine();
        System.out.println("Enter you age: ");
        int age = sc.nextInt();
        System.out.println("Enter the numeric value of pi: ");
        float pi = sc.nextFloat();
        System.out.println("Are you a male?(true/false): ");
        Boolean isTrue = sc.nextBoolean();

        System.out.println("\n\t" + name + "\n\t" + age + "\n\t" + pi );
        if(isTrue = true){
            System.out.println("\n\tYou are a male" + "\n\t Male = " + isTrue);
        }
        else{
            System.out.println("\n\tYou are a female" + "\n\t Male = " + isTrue);
        }


    }
}
