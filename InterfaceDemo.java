package com.company;

interface Drawable{
    void draw();
    void show();
}

class IRectangle implements Drawable{
    int length;
    int breadth;
    public IRectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void draw(){
        System.out.println("Drawing rectangle");
    }
    public void show(){
        System.out.println("Length= "+this.length+" breadth= "+this.breadth);
    }

}

public class InterfaceDemo {
    public static void main(String[] args){
        IRectangle ir = new IRectangle(10,20);
        ir.draw();
        ir.show();
    }
}
