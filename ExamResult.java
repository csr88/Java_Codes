package com.company;
import java.util.Scanner;


public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your final marks: ");
        int marks = sc.nextInt();

        if (marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks >= 80 && marks <= 100) {
            System.out.println("Congratulation!! You passed with Distinction.");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("You passed with A Grade.");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("You passed with B Grade.");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("You passed with C Grade.");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("You passed with D Grade.");
        }else
            System.out.println("You failed the exam.");
        }

    }


