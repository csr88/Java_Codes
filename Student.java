package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    public static void GenerateReport(String name, double m1, double m2, double m3) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/StudentDemo.txt", true));
        int c = 0;
        if (c<1){
            bw.write("Name\t\tMark\t\t\tPercentage");
            c++;
        }
        double percent;
        percent = (m1+m2+m3)/3;
        bw.write("\n" + name + "\t\t" + m1+","+m2+","+m2+"\t\t" + percent + "%\n" );
        bw.close();


    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of students: ");
        int count = sc.nextInt();
        String n;
        double m1;
        double m2;
        double m3;

        for (int i=0;i<count;i++){
            System.out.println("Enter the name of student " + (i+1));
            n = sc.next();
            System.out.println("Enter " + n + "'s marks in 3 subjects (out of 100): ");
            m1=sc.nextDouble();
            m2=sc.nextDouble();
            m3=sc.nextDouble();

            GenerateReport(n,m1,m2,m3);
        }



    }

}

