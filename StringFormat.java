package com.company;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Shishir";
        int age = 20;
        double pi = 3.1415;
        char value_c = 'c'; //single quote for character

        //String
        System.out.printf("%s\n", name);
        //Character
        System.out.printf("%c\n", name.charAt(0));
        System.out.printf("%c\n", value_c);
        //Float & Double
        System.out.printf("%f\n", pi);
        //Three decimal place
        System.out.printf("%.3f\n", pi);
        //Decimal Integer
        System.out.printf("%d", age);

    }
}
