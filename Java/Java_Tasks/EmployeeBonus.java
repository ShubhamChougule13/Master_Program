
public class EmployeeBonus {

    double calculateBonus(double salary, double percentage) {
        return salary * percentage / 100;
    }

    double calculateFinalSalary(double salary, double percentage) {
        double bonus = calculateBonus(salary, percentage);
        return salary + bonus;
    }

    public static void main(String[] args) {

        EmployeeBonus eb = new EmployeeBonus();

        // Employee 1
        double salary1 = 30000;
        double bonus1 = eb.calculateBonus(salary1, 10);
        double finalSalary1 = eb.calculateFinalSalary(salary1, 10);

        // Employee 2
        double salary2 = 40000;
        double bonus2 = eb.calculateBonus(salary2, 15);
        double finalSalary2 = eb.calculateFinalSalary(salary2, 15);

        // Employee 3
        double salary3 = 50000;
        double bonus3 = eb.calculateBonus(salary3, 20);
        double finalSalary3 = eb.calculateFinalSalary(salary3, 20);

        System.out.println("Employee 1");
        System.out.println("Basic Salary: Rs. " + salary1);
        System.out.println("Bonus: Rs. " + bonus1);
        System.out.println("Final Salary: Rs. " + finalSalary1);

        System.out.println("\nEmployee 2");
        System.out.println("Basic Salary: Rs. " + salary2);
        System.out.println("Bonus: Rs. " + bonus2);
        System.out.println("Final Salary: Rs. " + finalSalary2);

        System.out.println("\nEmployee 3");
        System.out.println("Basic Salary: Rs. " + salary3);
        System.out.println("Bonus: Rs. " + bonus3);
        System.out.println("Final Salary: Rs. " + finalSalary3);
    }
}
