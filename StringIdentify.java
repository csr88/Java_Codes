package com.company;

import java.util.Scanner;

public class StringIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.next();

        for (int i=0;i<st.length();i++){
            char c = st.charAt(i);

            if (c>='A' && c<='Z' || c>='a' && c<='z'){
                System.out.println(c + " - alphabet");
            }
            else if(c>='0' && c<='9'){
                System.out.println(c + " - number");
            }
            else{
                System.out.println(c + " - neither an alphabet nor a number");
            }
        }
        sc.close();


    }
}
