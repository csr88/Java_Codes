package com.company;
import java.util.Scanner;

public class StackDemo {
    int top;
    int[] stack;

    StackDemo(int size){
        this.top = -1;
        this.stack = new int[size];
    }

    void push(int push){
        //using this. is a good practice
        if (this.top == this.stack.length-1){
            System.out.println("Stack is full.");
        }
        else{
            this.stack[++this.top] = push;
            System.out.println(push + " has been pushed to the stack.");
//            this.top++;
        }
    }

    void pop(){
        if (this.top > -1){
            int data = this.stack[this.top--];
            System.out.println(data + " has been popped from the stack.");
//            this.top -= 1;
        }
        else{
            System.out.println("Stack is empty.");
        }
    }

    void display(){
        System.out.println("\nStack elements: ");
        for (int i=0;i<=top;i++){
            System.out.println(stack[i]);
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
        s.display();

    }
}
