package com.company;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] name = {"Ram", "Shyam", "Hari", "Sita", "Gita"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name you want to search: ");
        String n = sc.next();

        boolean exist = false;
        for (int i=0;i< name.length;i++){
            if(n.equalsIgnoreCase(name[i])){
                System.out.println();
                System.out.println(n.toUpperCase() + " is at position " + (i+1));
                exist = true;
                break;
            }
        }
        if (exist != true){
            System.out.println();
            System.out.println(n.toUpperCase() + " does not exist in the array.");
        }
    }
}
