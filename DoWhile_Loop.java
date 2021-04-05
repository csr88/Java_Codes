package com.company;

public class DoWhile_Loop {
    public static void main(String[] args){

        //print no. 1-10 using do while loop
        int i=1;
        do{
            System.out.println(i);
            i++; // or i=i+1

        }while (i<11);

        //print "Shishir" 5 times

        int j=1;
        do {
            System.out.println("Shishir");
            j++;
        } while (j<6);

        //sum of all number from 1-10

        int k=1;
        int sum=0;
        do {
            sum=sum+k;
            k++;
        }while (k<11);

        System.out.print("\nThe sum is: " + sum + "\n");

        
    }
}
