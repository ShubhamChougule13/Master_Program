
package com.shubham.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CreateAndWriteFile {

    public static void main(String[] args) {

        try {
       
            File file = new File("employee.txt");

            if (file.createNewFile()) {

                System.out.println("File created: "
                        + file.getName());

            } else {

                System.out.println("File already exists");

            }

           
            FileWriter fw = new FileWriter(file);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Employee ID: 101");
            bw.newLine();

            bw.write("Employee Name: Shubham");
            bw.newLine();

            bw.write("Department: Java Development");
            bw.newLine();

            bw.write("Salary: 30000");

            bw.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}
