package com.company;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){

        //print from 1-10
        for(int i=1;i<11;i++){
            System.out.println(i);
        }

        //find how many digits are there in the given number

        Scanner sc= new Scanner(System.in);
        System.out.println("\n\tEnter the number: ");
        int num;
        num = sc.nextInt();
        int original=num;
        int count=0;

        while(num>0){
            num = num/10;
            count = count+1;

        }
        System.out.println( original + " is a "+ count + " digit number");

        /* the final result of num in the program is 0
        so if we put num instead of original then the output will be "0 is a -- digit number no matter what number you
        input */







    }
}
