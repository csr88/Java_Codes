package com.company;
//method overriding
//If subclass (child class) has the same method as declared in the parent class, it is known as method
//overriding in Java.
class Parent {
    void display() {
            System.out.println("I am Parent");
    }
}

 class Child extends Parent {
        @Override
        void display() {
            System.out.println("I am Child");
        }
}

//method overloading
//If a class has multiple methods having same name but different number, type and sequence of parameters, it is known as Method Overloading.
class addition{
    static int add(int a, int b){
        return a+b;
    }

    static void add(int a, long b){
        System.out.println(a+b);
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

}

 class MethodOverloadingOverriding{
    public static void main(String[] args) {

        System.out.println("Method Overloading: ");
            Parent parent = new Parent();
            parent.display();

            Parent pac = new Child();
            pac.display();


            addition ad = new addition();
        System.out.println("\nMethod overriding: \nSum of two numbers: ");
        System.out.print(ad.add( 1,2));
        System.out.println("\nSum of three numbers: ");
        System.out.print(ad.add(1,2, 3));

    }
}

