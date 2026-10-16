class Patient {
    int patientId;
    String name;
    int age;
    double consultationFee;

    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}

public class PatientDemo {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.patientId = 101;
        p.name = "Sneha";
        p.age = 28;
        p.consultationFee = 500;
        p.display();
    }
}
