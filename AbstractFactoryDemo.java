package com.company;

import java.util.Scanner;

abstract class shapes{
    public abstract void draw();
}

class circle extends shapes{
    public circle(){
        super();
    }
    public void draw() {
        System.out.println("This is a circle.");
    }
}

class square extends shapes{
    public square(){
        super();
    }
    public void draw(){
        System.out.println("This is a square.");
    }
}

class rectang extends shapes{
    public rectang(){
        super();
    }
    public void draw(){
        System.out.println("This is a rectangle.");
    }
}

class ShapeFactory{
    public shapes getShapes(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new rectang();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new square();
        }

        return null;
    }

}

public class AbstractFactoryDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the shape you want: ");
        s = sc.next();

        ShapeFactory sf = new ShapeFactory();
        shapes shape1 = sf.getShapes(s);
        shape1.draw();


    }
}
