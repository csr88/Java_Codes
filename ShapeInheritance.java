package com.company;

public class ShapeInheritance {
    double dim1;
    double dim2;

    public ShapeInheritance(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void display() {
        System.out.println("Side 1: " + this.dim1 + ", Side 2: " + this.dim2);
    }
}

    class Rectangle extends ShapeInheritance{

        public Rectangle(double dim1, double dim2) {
            //super keyword used to refer methods and variables of parent class to child class
            super(dim1,dim2);//calling constructor of super class
        }
    }

    class Triangle extends ShapeInheritance{
        double dim3;
        public Triangle(double dim1, double dim2, double dim3) {
            super(dim1, dim2);//calling constructor of super class
            this.dim3 = dim3;
        }
        //here display() method of parent class is overridden
        public void display(){
            super.display();
            System.out.println("Side 3: " + this.dim3);
        }
    }

    class ShapeD{
        public static void main(String[] args) {
            Rectangle robj = new Rectangle(10,20);
            robj.display();
            Triangle tobj = new Triangle(10,20,30);
            tobj.display();

        }
    }

