package com.company;

public class Try{
    int id;
    String name;
    float pi;

    Try(){
        System.out.println("Default constructor! ");
    }

    Try(int id, String name){
        this.id= id;
        this.name = name;
    }

    Try(String name, int id){
        this.id= id;
        this.name = name;
    }

    Try(int id, String name, float pi){
        this.id = id;
        this.name= name;
        this.pi = pi;
    }

    public static void main(String[] args) {
        Try t1 = new Try();
        System.out.println("ID: " + t1.id + "\tName: " + t1.name);

        Try t2 = new Try(101, "Ram");
        System.out.println("\nID: " + t2.id + "\tName: " + t2.name);

        Try t3 = new Try("Shyam", 202);
        System.out.println("\nID: " + t3.id + "\tName: " + t3.name);

        Try t4 = new Try(303, "Hari", (float) 3.14);
        System.out.println("\nID: " + t4.id + "\tName: " + t4.name + "\tpi: " + t4.pi);

    }

}