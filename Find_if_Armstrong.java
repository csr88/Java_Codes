package com.company;
import java.util.Scanner;

public class Find_if_Armstrong {
    public static void main(String[] args){

        //find how many digits are there in the given number

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tEnter the number: ");
        int num;
        num = sc.nextInt();
        int original = num;
        int count = 0;

        //while loop

        while (num > 0) {
            num = num / 10;        //num/=10
            count = count + 1;
        }






    }
}
