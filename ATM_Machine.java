package com.company;
import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the pin: ");
    int pin= sc.nextInt();

    if (pin!=9669){
        System.out.println("Invalid pin");

    }
    else {

        System.out.println("Enter the withdraw amount:");
        int withdraw = sc.nextInt();
        System.out.println("Take your " + withdraw + " and get lost!!!!");

        int balance = 100000;
        System.out.println("\nYour remaining balance is: " + (balance-withdraw) + " \nHmmmm you're a rich kid huh!!!!   ;)  ");
        System.out.println("\n \uD83D\uDE00");

    }
    }
}