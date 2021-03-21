package com.company;

public class TernaryOperators {
    public static void main(String[] args) {
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
