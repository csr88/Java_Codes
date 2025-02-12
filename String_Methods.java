package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = sc.next();
        System.out.println("Enter your last name:");
        String lname = sc.next();

//charAt()

        System.out.println(fname + " = \t");
        for (int i=0;i<fname.length();i++){
            System.out.print(fname.charAt(i) + ",");
        }

//concat()

        System.out.println(" ");
        String fullname = fname.concat(lname);
        System.out.println("Your name is: " + fullname);

//contains()

        System.out.println("Enter the word you want to check in your name:");
        String check_word = sc.next();

        if (fullname.contains(check_word) == true){
            System.out.println("You name contains the word " + check_word);
        }
        else{
            System.out.println("Your name does not contain the word " + check_word);
        }

//endswith()

        boolean isTrue = fullname.endsWith("aryal");

        if (isTrue == true){
            System.out.println("You surname is aryal");
        }
        else{
            System.out.println("Your surname is not aryal");
        }


//equals()
        System.out.println("Enter two words:");
        String word1 = sc.next();
        String word2 = sc.next();

        if (word1.equals(word2)){
            System.out.println(word1 + " equals to " + word2);
        }
        else{
            System.out.println(word1 + " is not equals to " + word2);
        }

//format
        double light_speed = 2.99792458;

        System.out.printf("%c\n", fullname.charAt(0));
        System.out.printf("%s\n",fullname);
        System.out.printf("%.3f\n", light_speed); //displays only 3 decimal place


//hashcode()
        System.out.println("The hashcode of you name is " + fullname.hashCode());

//indexof()
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));

//length()
        System.out.println("The length of your full name is: " + fullname.length());

//split()
//        System.out.println(fullname.split());

//toupper
        System.out.println(fullname.toUpperCase());





    }
}
