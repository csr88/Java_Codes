package com.company;

public class Break_Loop {
    public static void main(String[] args) {
        for(int i=1;i<11;i++) {

            if (i==6) break;

            else
            System.out.println(i);

        }

        System.out.println("\nLoop broken at 6 using break");
    }
}
