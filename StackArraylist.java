package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class StackArraylist {
    int top;
    ArrayList <Integer>stack;

    StackArraylist(int size){
        this.top=-1;
        this.stack=new ArrayList<Integer>(size);
    }
    void push(int push){
        if (this.top==this.stack.size()-1){
            System.out.println("Stack is full.");
        }
        else{
            this.stack.set(++this.top,push);
            System.out.println(push + " has been pushed to the stack.");
        }
    }
    void pop(){
        if (this.top > -1){
            int popping = this.stack.get(this.top--);
            System.out.println(popping + " has been popped from the stack.");
        }
        else{
            System.out.println("Stack is empty.");
        }
    }

    void display(){
        System.out.println("\nStack Elements: ");
        for (int i=0;i<top;i++){
            System.out.println(this.stack.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size: ");
        int size = sc.nextInt();
        StackDemo s = new StackDemo(size);

        for (int i=0;i<size;i++){
            s.push(i);
        }
        System.out.println();
        s.pop();
        s.pop();
        s.pop();

        s.display();

    }
}
