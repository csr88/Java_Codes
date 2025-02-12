package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    String name;
    double salary;


    Employee(){
        this.name=null;
        this.salary=0;
    }

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    static void compare_employee(Employee a, Employee b){
        if (a.salary>b.salary) {
            System.out.println("\n" + a.name + " has higher fucking salary.");
        }
        else {
            System.out.println("\n" + b.name + " has higher fuck off  salary");
        }

    }
    static void display(ArrayList<Employee>emp){
        System.out.println();
        System.out.print("Name - ");
        System.out.print("Salary");
        System.out.println();

        Employee obj;
        for (int i=0;i< emp.size();i++){
            obj = emp.get(i);
            System.out.print(obj.name + " - ");
            System.out.println(obj.salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        double s;
        ArrayList<Employee> arr = new ArrayList<>();


        Employee obj;
        for (int i=0;i<2;i++){
            System.out.println("Enter name and blooding salary of employee " + i+1);
            n = sc.next();
            s = sc.nextDouble();
            obj = new Employee(n,s);
            arr.add(obj);
        }

        compare_employee(arr.get(0), arr.get(1));
        display(arr);


        }

}
