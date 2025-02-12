package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Product {
    int id;
    String name;
    double price;
    double stack_amount;
    static ArrayList<Product> arr = new ArrayList<>();

    Product(){
        this.id = 0;
        this.name = null;
        this.price = 0;
        this.stack_amount = 0;
    }

    Product(int id, String name, double price, double stack_amount){
        this.id=id;
        this.name=name;
        this.price=price;
        this.stack_amount=stack_amount;
    }

    static void add_product(int id,String pname, double pr, double stack_amt){
        Product product = new Product(id, pname, pr, stack_amt);
        arr.add(product);
    }
    static void update_product(int id,String name, double price, double stack_amount, Product p){
        p.id = id;
        p.name = name;
        p.price = price;
        p.stack_amount = stack_amount;
    }
    static void remove_product(Product p){
        arr.remove(p);
    }
    static void display_product(){
        System.out.println();
        System.out.print("ID\t");
        System.out.print("Name\t");
        System.out.print("Price\t");
        System.out.print("Stack amount\n");

        Product obj;
        for (int i=0;i< arr.size();i++){
            obj = arr.get(i);

            System.out.print(obj.id + "\t");
            System.out.print(obj.name + "\t");
            System.out.print(obj.price + "\t");
            System.out.print(obj.stack_amount + "\t");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerID = 0;
        String n;
        double p;
        double sa;
        Product pk = new Product();

        Product obj;
        System.out.println("Enter number of products: ");
        int count = sc.nextInt();
        for (int i=0;i<count;i++){
            customerID += 1;
            System.out.println("Enter name, price and stack amount of product: ");
            n = sc.next();
            p = sc.nextDouble();
            sa = sc.nextDouble();
            obj = new Product(customerID,n,p,sa);
            arr.add(obj);
        }

//        int cID = customerID;
        char ex = 0;
        do{
            System.out.println("\nPress 1 to Add product" +
                    "\nPress 2 to Update product" +
                    "\nPress 3 to Remove product" +
                    "\nPress 4 to Display"+
                    "\nPress 5 to exit\n");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter name, price and stack amount of product: ");
                    String na = sc.next();
                    double pr = sc.nextDouble();
                    double s = sc.nextDouble();
                    add_product(++customerID, na,pr,s);
                    break;

                case 2:
                    display_product();
                    System.out.println("\nEnter product ID: ");
                    int index = sc.nextInt();
                    obj = arr.get(index-1);
                    System.out.println("\nEnter n to update name, p for price and sa for stack amount: ");
                    String option = sc.next();

                    if (option.equalsIgnoreCase("n")){
                        System.out.println("\nEnter new name: ");
                        String update_name = sc.next();
                        update_product(obj.id, update_name, obj.price, obj.stack_amount, obj );

                    }
                    else if(option.equalsIgnoreCase("p")){
                        System.out.println("\nEnter the new price");
                        double update_price = sc.nextDouble();
                        update_product(obj.id, obj.name, update_price, obj.stack_amount, obj );

                    }
                    else if(option.equalsIgnoreCase("sa")){
                        System.out.println("\nEnter the new stack amount:");
                        double update_stack = sc.nextDouble();
                        update_product(obj.id, obj.name, obj.price, update_stack, obj );
                    }
                    else {
                        System.out.println("\nInput Error!");
                    }
                    break;

                case 3:
                    display_product();
                    System.out.println("\nEnter product ID of the product to remove: ");
                    index = sc.nextInt();
                    System.out.println("\nProduct " + arr.get(index-1).name + " removed from the list.");
                    arr.remove(index-1);
                    break;

                case 4:
                    display_product();
                    break;

                case 5:
                    System.out.println("\nYour purchase list: ");
                    display_product();
                    System.out.println("Thank you for purchasing from us :)");
                    System.exit(0);

            }
            System.out.println("\nDo you want to continue(y/n): ");
            ex = sc.next().charAt(0);
        }while (ex == 'y');

        System.out.println("\nThank you for purchasing from us :)");

    }
}

