package com.company;
//Create an interface "Animal" with two methods move() and eat().
//Create a class Dog and implement the interface methods.
//Create a new class "Test" and execute the methods of "Dog" class.

interface Animal{
    void move();
    void eat();
}

class Dog implements Animal{

    @Override
    public void move() {
        System.out.println("Animal is moving!");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
        d.eat();
    }
}
