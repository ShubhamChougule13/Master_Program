
package com.shubham.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

    public static void main(String[] args) {

        try {

            // Create workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // Create sheet
            XSSFSheet sheet = workbook.createSheet("Employees");

            // Create header row
            XSSFRow header = sheet.createRow(0);

            header.createCell(0).setCellValue("Employee ID");
            header.createCell(1).setCellValue("Name");
            header.createCell(2).setCellValue("Department");
            header.createCell(3).setCellValue("Salary");

            // Employee 1
            XSSFRow row1 = sheet.createRow(1);

            row1.createCell(0).setCellValue(101);
            row1.createCell(1).setCellValue("Shubham");
            row1.createCell(2).setCellValue("Java");
            row1.createCell(3).setCellValue(30000);

            // Employee 2
            XSSFRow row2 = sheet.createRow(2);

            row2.createCell(0).setCellValue(102);
            row2.createCell(1).setCellValue("Rahul");
            row2.createCell(2).setCellValue("Testing");
            row2.createCell(3).setCellValue(25000);

            // Employee 3
            XSSFRow row3 = sheet.createRow(3);

            row3.createCell(0).setCellValue(103);
            row3.createCell(1).setCellValue("Amit");
            row3.createCell(2).setCellValue("Development");
            row3.createCell(3).setCellValue(35000);

            // Adjust column width
            for (int i = 0; i < 4; i++) {
                sheet.autoSizeColumn(i);
            }

            // Create output folder
            Files.createDirectories(Path.of("output"));

            // Save Excel file
            try (FileOutputStream fos =
                    new FileOutputStream("output/Employee.xlsx")) {

                workbook.write(fos);

            }

            workbook.close();

            System.out.println("Excel file created successfully!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
