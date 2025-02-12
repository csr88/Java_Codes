package com.company;
import java.util.*;

public class RailFence {

    public static void encryption(String str,int rails){

        boolean checkdown=false;
        int j=0;
        int row=rails;
        int col=str.length();
        char[][] a=new char[row][col];

        for(int i=0;i<col;i++){
            if(j==0||j==row-1)
                checkdown=!checkdown;
            a[j][i]=str.charAt(i);
            if(checkdown){
                j++;
            }
            else {
                j--;
            }
        }

        System.out.println("\nEncryption process with " + rails + " rows: \n");

        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                System.out.print(a[i][k]+"  ");
            }
            System.out.println();
        }
        String en="";

        System.out.println("----------------------");
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                if(a[i][k]!=0)
                    en=en+a[i][k];
            }

        }
        System.out.println("Encrypted Text: " +  en);

    }

    public static void main(String arg[]){

        System.out.println("Enter the number of rails:");
        Scanner in=new Scanner (System.in);
        int rails=in.nextInt();

        System.out.println("Enter the plaintext for encryption");
        Scanner inn=new Scanner (System.in);
        String plaintext=inn.next();

        encryption(plaintext,rails);

    }

}
