package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/filedemo.txt");
        //true enables edit/append functionality. If false then it will put text in first line by remove all previous text
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/bufferdemo.txt", true));
        bw.write("hey 1");
        bw.write("hey 2");
        bw.write("hey 2");
        bw.write("hey 2");
        bw.close();

        fw.write("\nThis is a write operation 1.");
        fw.write("\nThis is a write operation 2.");

        fw.append("\nWhat is this??");

        fw.close();
        System.out.println("Successfully written to the file.");
    }
}
