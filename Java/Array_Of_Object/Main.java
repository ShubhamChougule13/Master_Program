class Student { 
    int rollNo; 
    String name; 
    int marks; 
 
    Student(int rollNo, String name, int marks) { 
        this.rollNo = rollNo; 
        this.name = name; 
        this.marks = marks; 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
 
        Student[] s = { 
            new Student(1, "Rahul", 78), 
 
 
            new Student(2, "Priya", 95), 
            new Student(3, "Amit", 85), 
            new Student(4, "Sneha", 91) 
        }; 
 
        Student topper = s[0]; 
 
        for (int i = 1; i < s.length; i++) { 
            if (s[i].marks > topper.marks) { 
                topper = s[i]; 
            } 
        } 
 
        System.out.println("Topper: " + topper.name); 
        System.out.println("Marks: " + topper.marks); 
    } 
} 