public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee(101, "Rahul", 35000);
        employees[1] = new Employee(102, "Priya", 45000);
        employees[2] = new Employee(103, "Amit", 30000);

        System.out.println("Employee Details:");

        for (Employee employee : employees) {
            employee.display();
        }
    }
}
