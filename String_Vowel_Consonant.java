package com.company;

import java.util.Scanner;

public class String_Vowel_Consonant{
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.next();

        int length = word.length();

        for (int i=0;i<length;i++) {
            char ch = word.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    isVowel = true;
            }
            if(isVowel == true) {
                System.out.println(ch + " is  a Vowel");
            }
            else {
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                    System.out.println(ch+" is a Consonant");
                else
                    System.out.println(ch + " is not an alphabet");
            }
        }
    }
}