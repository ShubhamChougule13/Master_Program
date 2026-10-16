class Employee {

    int employeeId;
    String name;
    double basicSalary;
    double allowances;

    double hra;
    double da;
    double grossSalary;

    Employee(int employeeId, String name,
             double basicSalary, double allowances) {

        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    void calculateSalary() {

        hra = basicSalary * 20 / 100;
        da = basicSalary * 10 / 100;

        grossSalary = basicSalary + hra + da + allowances;
    }

    void displaySalarySlip() {

        calculateSalary();

        System.out.println("===== SALARY SLIP =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("Allowances: Rs. " + allowances);
        System.out.println("HRA (20%): Rs. " + hra);
        System.out.println("DA (10%): Rs. " + da);
        System.out.println("-----------------------");
        System.out.println("Gross Salary: Rs. " + grossSalary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(
            101, "Shubham", 30000, 2000
        );

        e1.displaySalarySlip();
    }
}