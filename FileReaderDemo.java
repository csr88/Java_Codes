package com.company;

import java.io.*;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/abc.txt");
//        Scanner sc = new Scanner(f);
//
//        while(sc.hasNextLine()){
//            String line = sc.nextLine();
//            System.out.println(line);
//        }

        FileWriter fw = new FileWriter("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/abc.txt", true);
//        fw.write("This line as been added\n");
//        fw.write("This is line 2\n");

        fw.append("\nWhat is this");
        fw.close();


        FileReader fr = new FileReader("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/abc.txt");
        int i;
        System.out.println(fr.read());

        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
