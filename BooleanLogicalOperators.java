package com.company;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        int a=10,b=10,c=10;
        boolean res= (a==b) & (b==c);
        System.out.println(res);
        c=20;
        boolean jet = (a==b) | (b==c);
        System.out.println(jet);

    }
}
