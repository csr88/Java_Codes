package com.company;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo{
    public static void main(String[] args) throws IOException {
        File fob = new File("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/file1.txt");

        if (fob.createNewFile()){
            System.out.println("File created!");
        }
        else{
            System.out.println("File already exists!");
        }


    }
}
