package com.company;

public class Monoalphabetic_cipher {
    // String letter = "कखगघङचछजझञटठडढणतथदधनपफबभमयरलवशषसहक्षत्रज्ञा\nा\nि\nी\nु\nू\nृ\nॄॅ\nॆ\nेै\nॉ\nॊ\nो\nौ";
    // String letter = "कखगघङचछजझञटठडढणतथदधनपफबभमयरलवशषसहक्षत्रज्ञा ािीुूृॄॅॆेैॉॊोौ";

    String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String cipher, String key){
        char c;
        char d;
        int index;
        char[] encrypted_text = new char[cipher.length()];
        for (int i = 0; i < cipher.length(); i++) {
            c = cipher.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){

                index = letter.indexOf(c);
                d = key.charAt(index);
                encrypted_text[i] = d;
            }
        }
        String cipher_text = new String(encrypted_text);
        return cipher_text;
    }

    public String decrypt(String ciphered, String key){
        char c;
        char d;
        int index;
        char[] decrypted_text = new char[ciphered.length()];
        for (int i = 0; i < ciphered.length(); i++) {
            c = ciphered.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){

                index = key.indexOf(c);
                d = letter.charAt(index);
                decrypted_text[i] = d;
            }
        }
        String decipher_text = new String(decrypted_text);
        return decipher_text;
   }

    public static void main(String[] args) {

        String key = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

        Monoalphabetic_cipher cipher = new Monoalphabetic_cipher();


        String ctext = cipher.encrypt("my name is shishir", key);
        System.out.println("\nCiphered text: " + ctext);

        String dtext = cipher.decrypt(ctext, key);
        System.out.println("\nDeciphered text: " + dtext);

        String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(letter.length());
        System.out.println(key.length());




    }
}
