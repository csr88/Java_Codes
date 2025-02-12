package com.company;
import java.util.Scanner;

public class PrintNumberReverse_JavaLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring the number
        System.out.println("Enter the integer: ");
        int number = sc.nextInt();


        // Printing the last digit of the number
        while (number > 0) {

            // Finding the remainder (Last Digit)
            int remainder = number % 10;

            // Printing the remainder/current last digit
            System.out.print(remainder);

            // Removing the last digit/current last digit
            number = number / 10;
        }
    }
}
