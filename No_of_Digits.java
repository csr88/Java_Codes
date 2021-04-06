package com.company;
import java.util.Scanner;

public class No_of_Digits {
    public static void main(String[] args){
        //find how many digits are there in the given number

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tEnter the number: ");
        int num;
        num = sc.nextInt();
        int original = num;
        int count = 0;

        //while loop

        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        System.out.println(original + " is a " + count + " digit number");

        /* the final result of num in the program is 0
        so if we put num instead of original then the output will be "0 is a -- digit number no matter what number you
        input */


        //finding the number of digits using for loop

        int counting = 0, digit = 123456;

        // Here ;  so that we can go straight to the conditions and also we can put as much conidions as we want in for loop

        for (; digit > 0; digit /= 10, ++counting){

        }
        //curly braces to print the result only after the loop is complete and the number of digits has been found.
        System.out.println("Number of digits: " + counting);

    }
}
