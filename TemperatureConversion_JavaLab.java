package com.company;
import java.util.Scanner;

public class TemperatureConversion_JavaLab {
    public static void main(String[] args){
        float tempf,tempc;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature(fahrenheit): ");
        tempf = sc.nextInt();
        tempc = ((tempf-32)*5)/9;
        System.out.print("\nThe temperature is " + tempc + " degree celsius.");

        if (tempc>=0 && tempc<=10 ){
            System.out.println("\nCold Climate");
        }

        if (tempc>=11 && tempc<=25 ){
            System.out.println("\nNormal Climate");
        }

        if (tempc>=26 && tempc<=45 ){
            System.out.println("\nVery Hot Climate");
        }
        else{
            System.out.println("\nInvalid Temperature");
        }
        sc.close();



    }

}
