package com.company;

//here A is the superclass
class A{
    int i,j;
    void show(){
        System.out.println("i=" + i + ", j=" + j);
    }
}
//here B is Sub-class of A ,so it will inherit all properties of A
class B extends A{
    int k;

    void add(){
        System.out.println("Sum= " + (i+j+k));
    }

}

public class InheritanceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.i=10;
        b.j=20;
        b.show();

        b.k=30;
        b.add();

    }
}


