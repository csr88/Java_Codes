package com.company;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Declaring the number
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int number = num;

        int reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (reversed == number){
            System.out.println(number + " is palindrome.");
        }
        else {
            System.out.println(number + " is not palindrome.");
        }


}}
