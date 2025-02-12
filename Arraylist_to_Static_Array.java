package com.company;

import java.util.ArrayList;

public class Arraylist_to_Static_Array {
    public static void main(String[] args) {

        ArrayList <Integer> age = new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(30);

        Integer a[] = new Integer[age.size()];
        a= age.toArray(a);
        for (int i:age){
            System.out.println(i);
        }

    }
}
