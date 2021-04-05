package com.company;

public class Continue_Statement {
    public static void main(String[] args){

        //print the numbers from 1-10 except 2 and 5 without breaking the loop

        for(int i=1;i<11;i++){
        if (i==2 || i==5 )
            continue;
        else{
            System.out.println("Loop #:" +i);
        }
        }
        System.out.println("\nSkipped Loop2 & Loop5");

    }
}
