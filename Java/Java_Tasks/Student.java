
class Student {

    String name;
    int rollNumber;
    int age;
    double percentage;
    String grade;
    boolean pass;

    Student(String name, int rollNumber, int age,
            double percentage, String grade) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.percentage = percentage;
        this.grade = grade;

        this.pass = percentage >= 40;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Pass Status: " + (pass ? "Pass" : "Fail"));
    }

    public static void main(String[] args) {

        Student s1 = new Student(
            "Shubham", 101, 25, 78.5, "A"
        );

        s1.displayDetails();
    }
}
