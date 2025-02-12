package com.company;

import java.util.Arrays;

public class Playfair_Cipher {
    static String cipher_text;
    static String key;

    public  Playfair_Cipher(String cipher_text, String key){
        this.cipher_text = cipher_text.toLowerCase();
        this.key = key.toLowerCase();
    }

    public static String encryption(){
        Character matrix[][] = new Character[5][5];
        for (int i=0, count=0;i<key.length();i++){
            for (int j=0;j<key.length();j++){
                    matrix[i][j] = cipher_text.charAt(count++);
            }
        }

        System.out.println("Playfair cipher matrix: ");
        for (int i=0;i<key.length();i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        return null;
    }



}
