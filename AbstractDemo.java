package com.company;

abstract class Shape{
    double length;
    double breadth;

    public Shape(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //method is empty so made it abstract. It is child class's duty to define the abstract class,method.
    abstract public void area();

    public void show(){
        System.out.println("Side 1= "+(this.length)+"Side 2= "+(this.breadth));
    }
}

class Rect extends Shape{

    public Rect(double length, double breadth) {
        super(length, breadth);
    }
    public void area(){
        System.out.println("Area= "+(this.length)*(this.breadth));
    }
}

//here is we do not implement area then it will throw error. Child class should define the abstract method
//of the abstract class.
class Tri extends Shape{
    public Tri(double length, double breadth){
        super(length, breadth);
    }

    @Override //denotes that we are overriding this method.
    public void area() {
        System.out.println("Area of Triangle");
    }

}

public class AbstractDemo{
    public static void main(String[] args) {
        Rect robj = new Rect(10,20);
        robj.area();
        Tri tobj = new Tri(5,6);
        tobj.area();
    }
}
