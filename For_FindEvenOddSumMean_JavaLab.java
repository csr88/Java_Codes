package com.company;
import java.util.Scanner;

public class For_FindEvenOddSumMean_JavaLab {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the maximum integer: ");
        int max = sc.nextInt();
        int num=0;

        while(num<max){
            num +=1;
            if (num%2==0){
                System.out.print(num + ",");
            }
            else{

            }




        }
    }
}
