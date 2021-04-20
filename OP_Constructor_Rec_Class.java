class Rectangle{
    double length, breadth;

    //default constructor
    Rectangle(){
        length =10;
        breadth = 10;
    }

    //parametrized constructor -> constuctor with parameters
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    double area(){           //area method

        double a;
        a= length*breadth;
        // System.out.println("Area = " + a );
        return a; // if we use sout then void area() if we use return the double area
    }

}

public class OP_Constructor_Rec_Class {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();//rec object created
        Rectangle r2 = new Rectangle(12,13);
        System.out.println("The length and breadth of Rectangle1 is " + r1.length + r1.breadth);
        System.out.println("The length and breadth of Rectangle2 is " + r2.length + r2.breadth);
        //r2.area();
        System.out.println("Area2 = " + r2.area());
        System.out.println("Area1 = " + r1.area());
    }
}

