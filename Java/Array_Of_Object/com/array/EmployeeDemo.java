package com.array;

public class EmployeeDemo {

    public static void main(String[] args) {

        EmployeeSalary[] employees = {
            new EmployeeSalary(101, "Rahul", 35000),
            new EmployeeSalary(102, "Priya", 50000),
            new EmployeeSalary(103, "Amit", 42000),
            new EmployeeSalary(104, "Sneha", 30000)
        };

        System.out.println("Employees with salary greater than 40000:");

        for (EmployeeSalary e : employees) {

            if (e.salary > 40000) {
                System.out.println(e.name + " - " + e.salary);
            }
        }
    }
}