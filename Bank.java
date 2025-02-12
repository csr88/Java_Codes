package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Bank {
    String id;
    String name;
    double balance;
    static String bankName = "21 din meh paisa double bank";

    public Bank(){
        this.id = null;
        this.name = null;
        this.balance = 00;
    }

    public Bank(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    double withdraw(double withdraw){
        if (balance>withdraw){
            balance = balance - withdraw;
            return balance;
        }
        else{
            System.out.println("Insufficient balance.");
        }
        return balance;
    }

    static void balanceCheck(Bank b){
        System.out.println("Bank: " + b.bankName );
        System.out.println("Customer ID: " + b.id);
        System.out.println("Customer Name: " + b.name);
        System.out.println("Balance amt: " + b.balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerId;
        String n;
        double b;
        ArrayList<Bank> arr = new ArrayList<>();
        Bank bk = new Bank();
        System.out.println("\nDefault values: ");
        balanceCheck(bk);
        System.out.println();

        Bank obj;
        for (int i=0;i<3;i++){
            customerId = UUID.randomUUID().toString();
            System.out.println("Enter your name and balance: ");
            n = sc.next();
            b = sc.nextDouble();
            obj = new Bank(customerId,n,b);
            arr.add(obj);
        }

        System.out.println("Select your account: ");
        for (int i=0;i<arr.size();i++){
            obj = arr.get(i);
            System.out.println(i+1 + ": " + obj.name);
        }
        System.out.print("\nAccount (1,2,3..): \t");
        int account = sc.nextInt();

        char ex = 0;
        do
        {
            System.out.println("Press 1 to withdraw" +
                    "\nPress 2 to deposit" +
                    "\nPress 3 to check balance" +
                    "\nPress 4 to exit\n");

            int a = sc.nextInt();
            switch (a){
                case 1:
                    obj = arr.get(account-1);
                    System.out.println("\nEnter withdraw amount:");
                    double withdraw = sc.nextDouble();
                    obj.withdraw(withdraw);
                    break;

                case 2:
                    obj = arr.get(account-1);
                    System.out.println("\nEnter deposit amount:");
                    double deposit = sc.nextDouble();
                    obj.deposit(deposit);
                    break;

                case 3:
                    obj = arr.get(account-1);
                    System.out.println("\nAccount Details:");
                    balanceCheck(arr.get(account-1));
                    break;
                case 4:
                    System.exit(0);
            }

            System.out.println("Do you want to exit (y/n):");
            ex = sc.next().charAt(0);
        }
        while(ex == 'y');
        sc.close();
    }






}