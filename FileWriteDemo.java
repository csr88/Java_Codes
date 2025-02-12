package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/shishir/IdeaProjects/Shishir_IdeaProjects/src/com/company/file1.txt");
        fw.write("File writer demo.");
        fw.write("\nThis is an append operation.");


        fw.close();

    }
}
