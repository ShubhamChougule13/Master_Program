
public class Result {

    // Method 1: Two subjects
    void calculateResult(double m1, double m2) {
        double average = (m1 + m2) / 2;
        System.out.println("Average of 2 subjects: " + average);
    }

    // Method 2: Three subjects
    void calculateResult(double m1, double m2, double m3) {
        double average = (m1 + m2 + m3) / 3;
        System.out.println("Average of 3 subjects: " + average);
    }

    // Method 3: Five subjects
    void calculateResult(double m1, double m2, double m3,
                         double m4, double m5) {
        double average = (m1 + m2 + m3 + m4 + m5) / 5;
        System.out.println("Average of 5 subjects: " + average);
    }

    public static void main(String[] args) {

        Result r = new Result();

        r.calculateResult(80, 90);

        r.calculateResult(70, 80, 90);

        r.calculateResult(75, 85, 90, 80, 70);
    }
}
