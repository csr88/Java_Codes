package com.company;

import java.util.Scanner;

public class Shishir_PrimeorNot {
    public static void main(String[] args) {

        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Prime Number: ");
        int num = sc.nextInt();
        int divider = 2;

        while (num%divider!=0){
            divider++;
        }

        if (divider!=num){
            System.out.println(num + " is not a prime number");
        }

        else{
            System.out.println(num + " is a prime number");

        }

    }

}



