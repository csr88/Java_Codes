package com.company;

import java.util.Scanner;

public class OneTimePad{

    String encrypt(String message, String key) {
        String encrypted = "";


        if (message.length() == key.length()) {
            for (int i = 0; i < message.length(); i++) {
                int m = (int) message.charAt(i);
                int k = (int) key.charAt(i);

                char e = (char) (m ^ k);
                encrypted += e;
            }
        }
        else{
            System.out.println("Message length different than key length.");
        }
        return encrypted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String m = sc.next();
        System.out.println("Enter the key: ");
        String k = sc.next();

        OneTimePad op = new OneTimePad();
        String encrypted_text = op.encrypt(m,k);

        System.out.println("The encrypted text is: " + encrypted_text);

    }
}