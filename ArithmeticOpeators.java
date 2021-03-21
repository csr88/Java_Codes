package com.company;

public class ArithmeticOpeators {
    public static void main (String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=30;

        //+ operator
        int sum= a+b;
        System.out.println("The sum of a and b is:" + sum);
        // modulus % shows remainder
        int modulus= b%a;
        System.out.println("The remainder of b/a is:" + modulus);
        // add 10 to a using +=
        a += 10;
        System.out.println("The result of a=a+10 is:" + a);
        // -= operator
        a-=10;
        System.out.println("The result of a-=10 is: " + a);


        // a++ is similar to a+1
        a++;
        System.out.println("The result of a++ is:" + a);

        //placing ++ after the variable i.e. a++ is post-increment
        //placing ++ before the variable i.e. ++a is pre-increment
        ++a;
        System.out.println("After the preincrement of a is:");

        // Pre-increment makes a difference when using more than one variable
        b= a++;
        //b=a
        // a = a+ 1
        System.out.println("The value of b is:" + b + " and a is:" + a);
        // Here bcz of post-increment value of a is assigned to b then only increment in a
        //pre-increment
        b = ++a;
        // a= a+1
        // b=a
        System.out.println("The value of b is: " + b + " and a is:" + a);







    }
}