package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        //print number from 10 to 1
        int i=10;
        while (i>0){
            System.out.println(i);
            i--;
        }

        //print hello world five times

        int j=0;
        while (j<5) {
            System.out.print("\nHello World");
            j++;
        }

        //print all the even numbers from one to ten

        int k=0;
        while (k<11) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }

    }
}
