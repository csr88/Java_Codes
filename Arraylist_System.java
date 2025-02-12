package com.company;
import java.util.*;
import java.util.ArrayList;

class Student1{
    String name;
    double marks[];
    public Student1(String name){
        this.name=name;
        this.marks = new double[3];
    }
    public String getName()
    {
        return this.name;
    }
    public double getPercent()
    {
        double sum = 0;
        for(int j=0;j<3;j++)
        {
            sum = sum+this.marks[j];
        }
        return (sum/3);
    }
    public void display_marks(){
        for(int j=0;j<3;j++)
        {
            System.out.print(this.marks[j]+" ");
        }
    }
    public void getRank()
    {


    }

}

public class Arraylist_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student1> st = new ArrayList<Student1>();
        HashMap<Student1, Double> result = new HashMap<Student1, Double>();

        Student1 s;
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter name and marks obtained in 3 subjects for student :"+i+1);
            String name = sc.next();
            s = new Student1(name);
            for(int j=0;j<3;j++)
            {
                s.marks[j] = sc.nextDouble();
            }
            st.add(s);
        }

        System.out.println("Following are the details of students: ");
        for(int i=0;i<st.size();i++)
        {
            s = st.get(i);
            System.out.print("Name: "+(s.getName())+ "\t");
            System.out.print(s.getPercent());
            result.put(s, s.getPercent());
        }





    }
}