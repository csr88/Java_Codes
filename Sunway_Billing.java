package com.company;

import java.util.Scanner;

public class Sunway_Billing{
    public static void main(String[] args){

        char ex;
        char ex1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our Billing System.");

        do{
            System.out.println("Choose 1 to Purchase");
            System.out.println("Choose 2 to Display");
            System.out.println("Choose 3 to Bill");
            System.out.println("Choose 4 to Exit");

            System.out.print("\n\nEnter:");
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    do {
                        System.out.println("Enter the item you want to purchase:");
                        String item = sc.next();
                        System.out.println("Enter the amount:");
                        int price = sc.nextInt();

                        System.out.println("Do you want to continue the purchase (y/n)?");
                        ex1 = sc.next().charAt(0);

                    } while (ex1 == 'y');
                    break;


                case 2:

                case 3:

                case 4:
                    System.exit(0);

            }
            System.out.println("\nPress 'y' to show main menu or 'n' to exit:");
            ex = sc.next().charAt(0);

        }while(ex == 'y');
    }
}