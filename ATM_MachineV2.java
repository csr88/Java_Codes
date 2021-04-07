package com.company;
import java.util.Scanner;

public class ATM_MachineV2 {
    public static void main(String[] args){
        int balence = 560000;
        System.out.println("Dear Customer, Welcome to Shishir Bank Pvt.Ltd");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();
        if (pin==1234) {
            while (true) {
                System.out.println("\nSelect a transaction: ");
                System.out.println("\n\t 1. Balence Inquiry ");
                System.out.println("\t 2. Withdrawal");
                System.out.println("\t 3. Deposit");
                System.out.println("\t 4. Fast Cash");
                System.out.println("\t 5. Change Pin");
                System.out.println("\t 6. Exit");
                System.out.println("\n\nEnter the Menu option: ");
                int menu = sc.nextInt();

                if (menu == 1) {
                    System.out.println("\n\tYour total balence is: " + balence);
                }
                if (menu == 2) {
                    System.out.println("\n\tEnter the withdrawal amount: ");
                    int withdrawal = sc.nextInt();
                    System.out.println("Rs." + withdrawal + " has been withdrawan.");
                    System.out.println("You remaining balence is Rs." + (balence - withdrawal));
                }
                if (menu == 3) {
                    System.out.println("\n\tEnter the amount you want to deposit: ");
                    int deposit = sc.nextInt();
                    System.out.println("Rs." + deposit + " has been deposited in your bank account");
                    System.out.println("Your remaining balence is Rs." + (balence + deposit));
                }
                if (menu == 4) {
                    System.out.println("\n\nSelect the amount you want to withdraw. ");
                    System.out.println("1. Rs.1000");
                    System.out.println("2. Rs.5000");
                    System.out.println("3. Rs.10000");
                    System.out.println("4. Rs.25000");
                    System.out.println("Enter the option: ");
                    int fc = sc.nextInt();

                    if (fc == 1) {
                        System.out.println("\n\t Rs.1000 has been withdrawan from your account");
                        System.out.println("\tYour remaining balence is Rs." + (balence - 1000));
                    }
                    if (fc == 2) {
                        System.out.println("\n\t Rs.5000 has been withdrawan from your account");
                        System.out.println("\tYour remaining balence is Rs." + (balence - 5000));
                    }
                    if (fc == 3) {
                        System.out.println("\n\t Rs.10000 has been withdrawan from your account");
                        System.out.println("\tYour remaining balence is Rs." + (balence - 10000));
                    }
                    if (fc == 4) {
                        System.out.println("\n\t Rs.25000 has been withdrawan from your account");
                        System.out.println("\tYour remaining balence is Rs." + (balence - 25000));
                    }
                    }
                    else {
                    System.out.println("Invalid Fast Cash Option!"); //Invalid Fast Cash Option
                    }

                if (menu == 5) {
                    System.out.println("Enter the old pin: ");
                    if (pin == 1234) {
                        System.out.println("Enter the new pin: ");
                        int newpin = sc.nextInt();
                        pin = newpin;
                        System.out.println("PIN has been changed succesfully.");
                    }
                }
                if(menu==6){
                    System.out.println("Exitting...");
                    break;
                }
                else {
                    System.out.println("Invalid Menu Option!"); //Invalid Front Menu Option
                }
            }
        }
        else{
            System.out.println("Invalid Pin!"); //Invalid Pin
        }

        }
    }
