package com.example.gradletask.important;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ImportConfigFile {
    public static void main(String[] args) throws IOException {
        System.out.println("BEGIN");
        String path = "src/main/resources";
        String filename = path + "/important.properties";
        System.out.println("Filename: " + filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("username=Mike\n");
        writer.write("password=1234\n");
        writer.flush();
        writer.close();
        System.out.println("END " + filename);
    }
}
