package com.company;

public class AllJavaOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Arithmetic Operators

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));


        //Assignment Operators

        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);

        //Logical (>,<,>=,<=) and Conditional (And, Or, Not, ==) operators

        // && operator
        System.out.println((a > b) && (a > b));
        System.out.println((a > b) && (b < a));

        // || operator
        System.out.println((a < b) || (b > a));
        System.out.println((a > b) || (b < a));
        System.out.println((a < b) || (b < a));

        // ! operator
        System.out.println(!(a == b));
        System.out.println(!(a > b));

        //Relational Operator

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true


        //Increment and Decrement Operators

        int increment = 5;
        int decrement = 10;

        // increase by 1
        System.out.println(++increment);

        // decrease by 1
        --decrement;



        //Bitwise Operator

        int c,d;
        // ~Bitwise unary not
        c=~b;
        System.out.println("Bitwise Operato(~)r: The invert of b is: " + c);

        //a|b, | operator
        d=a|b;
        System.out.println("Bitwise Operator(|): a or b = " + d);


        //Ternary Operators

        //know if the number num is even or odd
        int num = 10;
        String res;
        //if remainder of num/2 is true i.e. 0 then it will give even if it is false then print odd
        res = (num%2==0)?"even":"odd";
        System.out.println(res);

        int lam = 121;
        String jet = (lam%2==0)?"This is an even number":"This is an odd number";
        System.out.println(jet);

        //to know if the number is positive or negative
        int number = -3;
        String you = (number < 0)?"Negative number":"Positive number";
        System.out.println(you);

        //if the number is + then give its negative and vice versa
        int fly = -13;
        int me = (fly<0)?-fly:-fly;
        System.out.println(me);

        int sky = 77;
        int they = (sky<0)?-sky:-sky;
        System.out.println(they);

    }
}
