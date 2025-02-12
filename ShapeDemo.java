package com.company;
import java.util.ArrayList;
import java.util.Scanner;

class shape {
    double length;
    double breadth;
    double height;
    int id;
    public  shape(){
        this.length=10;
        this.breadth=10;
        this.height=10;
    }
    public shape(int id, double length,double breadth,double height){
        this.id = id;
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    double getVolume(){
        return (this.length*this.breadth*this.height);
    }

    shape compare(shape o){
        if (this.getVolume()>o.getVolume())
            return  this;
        else
            return o;
    }
    static shape compare(ArrayList<shape>a){
        shape s;
        if(a.get(0).getVolume()>a.get(1).getVolume()){
            if(a.get(0).getVolume()>a.get(2).getVolume()){
                s=a.get(0);
            }
            else{
                s=a.get(2);
            }
        }
        else{
            if(a.get(1).getVolume()>a.get(2).getVolume()){
                s=a.get(1);
            }
            else{
                s=a.get(2);
            }
        }
        return s;
    }
}
public class ShapeDemo{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double l,b,h;
        ArrayList<shape> arr=new ArrayList<>();
        shape s=new shape();
        System.out.println("Volume : "+(s.getVolume()));
        shape obj;
        for(int i=0;i<3;i++){
            System.out.println("Create a 3 digit ID: ");
            int n = sc.nextInt();
            System.out.println("Enter the dimension [L,B,H] for shape : " + n);
            l=sc.nextDouble();
            b=sc.nextDouble();
            h= sc.nextDouble();
            obj=new shape(n,l,b,h);
            arr.add(obj);
        }
        for(int i=0;i<arr.size();i++){
            obj=arr.get(i);
            System.out.printf("\nvolume of shape : %d is %f\n",i+1,obj.getVolume());
        }
        System.out.println("Enter the shape number to compare [0,1,2]: ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        obj=arr.get(i);
        shape obj2=arr.get(j);
        System.out.println("Largest volume among two is : "+(obj.compare(obj2).getVolume()));
        shape largest = new shape();
        largest = shape.compare(arr);
        System.out.print("\nLargest shape among three is:" + largest.id);
        System.out.println("\nLargest volume is:" + largest.getVolume());
        sc.close();
    }
}