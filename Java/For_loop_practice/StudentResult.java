public class StudentResult {
    public static void main(String[] args) {
        int[] marks = { 75, 80, 65, 90, 85 };
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        double percentage = total / (marks.length * 100.0) * 100;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
