package com.company;

public class CaeserCipher {
    public static String text = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ \t\n\r x0b x0c";

    public static void encryption(String plainText, int key) {
        System.out.println("Encrypted text : ");

        for(int i = 0; i < plainText.length(); ++i) {
            char chr = plainText.charAt(i);
            int index = text.indexOf(chr);
            int newIndex = index + key % text.length();
            char cipherChar = text.charAt(newIndex);
            System.out.print(cipherChar);
        }

        System.out.println("\n");
    }

    public static void decryption(String plainText, int key) {
        System.out.println("Decrypted text: ");

        for(int i = 0; i < plainText.length(); ++i) {
            char chr = plainText.charAt(i);
            int index = text.indexOf(chr);
            int newIndex = index - key % text.length();
            char cipherChar = text.charAt(newIndex);
            System.out.print(cipherChar);
        }

    }

    public static void main(String[] args) {
        encryption("BLOCKCHAIN", 3);
        decryption("EORFNFKDLQ", 3);
    }
}
