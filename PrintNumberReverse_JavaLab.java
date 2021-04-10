package com.company;
import java.util.Scanner;

public class PrintNumberReverse_JavaLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring the number
        System.out.println("Enter the integer: ");
        int num = sc.nextInt();

            int reversed = 0;

            while(num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
    }

