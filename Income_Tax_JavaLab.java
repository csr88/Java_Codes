package com.company;
import java.util.Scanner;

public class Income_Tax_JavaLab {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Annual Income: ");
        int income = sc.nextInt();

        if (income>=0 && income <=100000){
            System.out.println("\nTax Amount is Rs 0");
        }

        if (income>=100001 && income <=150000){
            System.out.println("\nTax Amount is Rs " + ((income-100000)*0.1) );
        }

        if (income>=150001 && income <=250000){
            System.out.println("\nTax Amount is Rs " + ((income-150000)*0.2)+5000 );
        }

        else{
            System.out.println("\nTax Amount is Rs " + ((income-250000)*0.3)+25000 );
        }

    }

}
